package hackathon.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hackathon.backend.entitys.Abrigo;
import hackathon.backend.services.AbrigoService;
import java.util.List;

@RestController
@RequestMapping("/abrigo")
public class AbrigoController {
    @Autowired
    private AbrigoService service;

    @GetMapping
    public List<Abrigo> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Abrigo save(@RequestBody Abrigo abrigo) {
        return service.save(abrigo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}
