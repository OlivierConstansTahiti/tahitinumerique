package tahiti.numerique.time_zone.metier.timezone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import tahiti.numerique.time_zone.metier.audit.mapper.AuditMapper;
import tahiti.numerique.time_zone.metier.timezone.controller.TimezoneRequest;
import tahiti.numerique.time_zone.metier.timezone.controller.TimezoneResponse;
import tahiti.numerique.time_zone.persistence.timezone.Timezone;

@Mapper(componentModel = "spring", uses = AuditMapper.class)
public interface TimezoneMapper {

    @Mapping(target = TimezoneResponse.Fields.offsetUTC,
            expression = "java(timezone.getOffsetUTC().getLabel())")
    TimezoneResponse mapToResponse(Timezone timezone);

    @Mapping(target = Timezone.Fields.offsetUTC,
            expression = "java(tahiti.numerique.time_zone.persistence.OffsetUTC.getEnumForLabel(form.getOffsetUTC()))")
    void populate(@MappingTarget Timezone timezone, TimezoneRequest form);

}
