package tahiti.numerique.time_zone.core.exception;

import lombok.Getter;

import static tahiti.numerique.time_zone.core.validator.MessageCode.GENERIC_NOT_FOUND;

@Getter
public class NotFoundException extends RuntimeException  implements MessageException{

    private MessageExceptionInfo messageExceptionInfo;

    public NotFoundException(String code, Object[] args) {
        super();
        messageExceptionInfo = new MessageExceptionInfo(code, args);
    }

    public NotFoundException(String nameObject, Object id) {
        this(GENERIC_NOT_FOUND, new Object[]{nameObject, id});
    }
}
