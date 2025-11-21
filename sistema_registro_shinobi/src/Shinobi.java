import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Shinobi {
Long id;
String name;
String email;
String password;
LocalDate dateRegistration;
List<String> habilities;

public Shinobi(String name, String email, String password, LocalDate dateRegistration, List<String> habilities){
    this.name = name;
    this.email = email;
    this.password = password;
    this.dateRegistration = dateRegistration;
    if (habilities == null) {
        this.habilities = new ArrayList<>();
    } else {
        this.habilities = habilities;
    }
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(LocalDate dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public List<String> getHabilities() {
        return habilities;
    }

    public void setHabilities(List<String> habilities) {
        this.habilities = habilities;
    }

    public String toString() {
        return "\n--- Registro de Shinobi ---\n" +
                "ID: " + this.id + " ---\n" +
                "Nome: " + this.name + "\n" +
                "Email: " + this.email + "\n" +
                "Data de Registro: " + this.dateRegistration + "\n" +
                "Habilidades: " + this.habilities.toString() +
                "\n------------------------------";
    }
}
