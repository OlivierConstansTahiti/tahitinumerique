package tahiti.numerique.time_zone.metier.timezone.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@FieldNameConstants
public class CalculateDateRequest {
    private TimezoneResponse timezone;
    private LocalDateTime date;
}
