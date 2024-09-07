package tahiti.numerique.time_zone.persistence.timezone;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import tahiti.numerique.time_zone.persistence.OffsetUTC;
import tahiti.numerique.time_zone.persistence.audit.Audit;
import tahiti.numerique.time_zone.persistence.audit.AuditListener;
import tahiti.numerique.time_zone.persistence.audit.Auditable;

@Entity
@EntityListeners(AuditListener.class)
@NoArgsConstructor
@Getter
@Setter
@FieldNameConstants
public class Timezone implements Auditable {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Audit audit;

    private String label;

    @Enumerated(EnumType.STRING)
    private OffsetUTC offsetUTC;

}
