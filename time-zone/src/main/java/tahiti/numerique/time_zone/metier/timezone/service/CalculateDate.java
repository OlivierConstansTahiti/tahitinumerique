package tahiti.numerique.time_zone.metier.timezone.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tahiti.numerique.time_zone.persistence.timezone.Timezone;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CalculateDate {

    private List<CalculateDateItem> calculateDateItemList = new ArrayList<>();

    @Getter
    @Setter
    @AllArgsConstructor
    public static class CalculateDateItem {
        private Timezone timezone;
        private LocalDateTime date;
    }
}
