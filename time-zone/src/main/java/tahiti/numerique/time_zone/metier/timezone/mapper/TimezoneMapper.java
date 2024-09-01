package tahiti.numerique.time_zone.metier.timezone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import tahiti.numerique.time_zone.metier.timezone.controller.TimezoneRequest;
import tahiti.numerique.time_zone.metier.timezone.controller.TimezoneResponse;
import tahiti.numerique.time_zone.persistence.timezone.Timezone;

@Mapper(componentModel = "spring")
public interface TimezoneMapper {

    TimezoneResponse mapToResponse(Timezone timezone);

    void populate(@MappingTarget Timezone timezone, TimezoneRequest form);

}
