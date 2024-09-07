package tahiti.numerique.time_zone.persistence;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.ZoneOffset;
import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum OffsetUTC {

    UTC("UTC", "+00:00"),
    UTC_PLUS_01("UTC+01","+01:00"),
    UTC_PLUS_02("UTC+02","+02:00"),
    UTC_PLUS_03("UTC+03","+03:00"),
    UTC_PLUS_03_30("UTC+03:30","+03:30"),
    UTC_PLUS_04("UTC+04","+04:00"),
    UTC_PLUS_04_30("UTC+04:30","+04:30"),
    UTC_PLUS_05("UTC+05","+05:00"),
    UTC_PLUS_05_30("UTC+05:30","+05:30"),
    UTC_PLUS_05_45("UTC+05:45","+05:45"),
    UTC_PLUS_06("UTC+06","+06:00"),
    UTC_PLUS_06_30("UTC+06:30","+06:30"),
    UTC_PLUS_07("UTC+07","+07:00"),
    UTC_PLUS_08("UTC+08","+08:00"),
    UTC_PLUS_08_45("UTC+08:45","+08:45"),
    UTC_PLUS_09("UTC+09","+09:00"),
    UTC_PLUS_09_30("UTC+09:30","+09:30"),
    UTC_PLUS_10("UTC+10","+10:00"),
    UTC_PLUS_10_30("UTC+10:30","+10:30"),
    UTC_PLUS_11("UTC+11","+11:00"),
    UTC_PLUS_12("UTC+12","+12:00"),
    UTC_PLUS_12_45("UTC+12:45","+12:45"),
    UTC_PLUS_13("UTC+13","+13:00"),
    UTC_PLUS_13_45("UTC+13:45","+13:45"),
    UTC_PLUS_14("UTC+14","+14:00"),
    UTC_MINUS_01("UTC-01","-01:00"),
    UTC_MINUS_02("UTC-02","-02:00"),
    UTC_MINUS_02_30("UTC-02:30","-02:30"),
    UTC_MINUS_03("UTC-03","-03:00"),
    UTC_MINUS_03_30("UTC-03:30","-03:30"),
    UTC_MINUS_04("UTC-04","-04:00"),
    UTC_MINUS_04_30("UTC-04:30","-04:30"),
    UTC_MINUS_05("UTC-05","-05:00"),
    UTC_MINUS_06("UTC-06","-06:00"),
    UTC_MINUS_07("UTC-07","-07:00"),
    UTC_MINUS_08("UTC-08","-08:00"),
    UTC_MINUS_09("UTC-09","-09:00"),
    UTC_MINUS_09_30("UTC-09:30","-09:30"),
    UTC_MINUS_10("UTC-10","-10:00"),
    UTC_MINUS_11("UTC-11","-11:00"),
    UTC_MINUS_12("UTC-12","-12:00");

    private final String label;
    private final String value;

    public static OffsetUTC getEnumForLabel(String label){
        return Arrays.stream(OffsetUTC.values())
                .filter(eachValue -> eachValue.label.equalsIgnoreCase(label))
                .findFirst()
                .orElse(null);
    }

    public ZoneOffset getZoneOffset(){
        return ZoneOffset.of(this.value);
    }
}
