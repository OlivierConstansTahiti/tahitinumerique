package tahiti.numerique.time_zone.core.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException  implements MessageException{

    private MessageExceptionInfo messageExceptionInfo;

    public BusinessException(String code, Object[] args) {
        super();
        messageExceptionInfo = new MessageExceptionInfo(code, args);
    }
}
