package tahiti.numerique.time_zone.metier.timezone.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;

@NoArgsConstructor
@Getter
@Setter
public class CalculateDateResponse {
    private Collection<CalculateDateItemResponse> calculateDateItemList;

    @NoArgsConstructor
    @Getter
    @Setter
    static public class CalculateDateItemResponse {
        private TimezoneResponse timezone;
        private LocalDateTime date;
    }
}
