package tahiti.numerique.time_zone.persistence.audit;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Embeddable
public class Audit {
	
	@Column(name = "create_date", nullable = false, updatable = false)
	private LocalDateTime createDate;
	
	@Column(name = "update_date", nullable = false)
	private LocalDateTime updateDate;
	
}
