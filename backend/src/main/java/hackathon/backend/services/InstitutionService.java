package hackathon.backend.services;

import java.util.List;
import java.util.Map;

import jakarta.persistence.Query;
import javax.swing.text.html.parser.Entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import hackathon.backend.entitys.Institution;
import hackathon.backend.interfaces.InstitutionRepository;
import jakarta.persistence.EntityManager;

@Service
public class InstitutionService {
    @Autowired
    private InstitutionRepository repository;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Institution> getAll() {
        return repository.findAll();
    }

    public Institution getById(long id) {
        return repository.findById(id).orElse(null);
    }

    public Institution save(Institution abrigo) {
        return repository.save(abrigo);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public List<Object[]> executarSqlNativoComEntityManager(String sql) {
        Query query = entityManager.createNativeQuery(sql);
        return query.getResultList();
    }

    public List<Map<String, Object>> executarSQLNativo(String sql) {
        return jdbcTemplate.queryForList(sql);
    }
}
