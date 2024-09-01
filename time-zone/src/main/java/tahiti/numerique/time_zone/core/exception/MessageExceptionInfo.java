package tahiti.numerique.time_zone.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class MessageExceptionInfo {

    private String code;
    private Object[] args;

}
