package hackathon.backend.interfaces;

import hackathon.backend.entitys.Abrigo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbrigoRepository extends JpaRepository<Abrigo, Long> {
    
}
