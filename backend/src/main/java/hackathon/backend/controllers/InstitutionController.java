package hackathon.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hackathon.backend.entitys.Institution;
import hackathon.backend.services.InstitutionService;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/abrigo")
public class InstitutionController {
    @Autowired
    private InstitutionService service;

    @GetMapping
    public List<Institution> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Institution save(@RequestBody Institution abrigo) {
        return service.save(abrigo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }

    @GetMapping("/executar-sql")
    public List<Map<String, Object>> executarSQL(@RequestParam String sql) {
        InstitutionService institutionService = new InstitutionService();
        return institutionService.executarSQLNativo(sql);
    }
    
}
