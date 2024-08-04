package hackathon.backend.entitys;

import jakarta.annotation.Generated;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "institution")
public class Institution {
    // Atributo identificador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // Atributos da entidade
    private String username;
    private String password;
    private String email;
    private String adress;
    private String CNPJ;
    
    // Constructors
    public Institution(long id, String username, String password, String email, String adress, String CNPJ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.adress = adress;
        this.CNPJ = CNPJ;
    }
    
    public Institution() {
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return username;
    }

    public void setUser(String user) {
        this.username = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
}
