package tahiti.numerique.time_zone.metier.audit.controller;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuditResponse {

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
