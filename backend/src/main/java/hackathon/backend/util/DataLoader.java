package hackathon.backend.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void loadData() {
        jdbcTemplate.execute("INSERT INTO Institution (username, password, email, adress, CNPJ) VALUES ('Teste', 'passwordTeste', 'teste@teste.com', 'Rua Teste', '12345678901234')");
    }
}
