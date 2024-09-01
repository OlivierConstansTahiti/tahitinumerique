package tahiti.numerique.time_zone.metier.timezone.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tahiti.numerique.time_zone.metier.audit.controller.AuditResponse;

@NoArgsConstructor
@Getter
@Setter
public class TimezoneResponse {

    private Long id;

    private AuditResponse audit;

    private String label;
}
