package tahiti.numerique.time_zone.metier.audit.mapper;

import org.mapstruct.Mapper;
import tahiti.numerique.time_zone.metier.audit.controller.AuditResponse;
import tahiti.numerique.time_zone.persistence.audit.Audit;

@Mapper(componentModel = "spring")
public interface AuditMapper {

    AuditResponse mapToResponse(Audit audit);

}
