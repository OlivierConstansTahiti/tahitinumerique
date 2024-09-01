package tahiti.numerique.time_zone.core.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException  implements MessageException{

    private MessageExceptionInfo messageExceptionInfo;

    public NotFoundException(String code, Object[] args) {
        super();
        messageExceptionInfo = new MessageExceptionInfo(code, args);
    }
}
