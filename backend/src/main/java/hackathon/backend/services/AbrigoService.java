package hackathon.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hackathon.backend.entitys.Abrigo;
import hackathon.backend.interfaces.AbrigoRepository;

@Service
public class AbrigoService {
    @Autowired
    private AbrigoRepository repository;

    public List<Abrigo> getAll() {
        return repository.findAll();
    }

    public Abrigo getById(long id) {
        return repository.findById(id).orElse(null);
    }

    public Abrigo save(Abrigo abrigo) {
        return repository.save(abrigo);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
