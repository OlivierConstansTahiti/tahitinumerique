package tahiti.numerique.time_zone.persistence.audit;

public interface Auditable {
	
	Audit getAudit();
	
	void setAudit(Audit audit);

}
