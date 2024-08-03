package hackathon.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hackathon.backend.interfaces.AbrigoRepository;

@Service
public class AbrigoService {
    @Autowired
    private AbrigoRepository repository;

    
}
