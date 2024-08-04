package hackathon.backend.interfaces;

import hackathon.backend.entitys.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
    
}
