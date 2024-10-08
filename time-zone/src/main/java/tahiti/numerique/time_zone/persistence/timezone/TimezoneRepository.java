package tahiti.numerique.time_zone.persistence.timezone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimezoneRepository extends JpaRepository<Timezone, Long>, PagingAndSortingRepository<Timezone, Long> {
}