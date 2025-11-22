import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Shinobi {
    private static final AtomicLong IDGENERATOR = new AtomicLong(2999);

    LocalDate dateRegistration;
    long id;
    String name;
    String email;
    String password;
    List<String> abilities;

public Shinobi(String name, String email, String password, List<String> abilities){
    this.name = name;
    this.email = email;
    this.password = password;

    this.dateRegistration = LocalDate.now();
    this.id = IDGENERATOR.incrementAndGet();

    if (abilities == null) {
        this.abilities = new ArrayList<>();
    } else {
        this.abilities = abilities;
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

    public List<String> getabilities() {
        return abilities;
    }

    public void setabilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public String toString() {
        return
            "\n--- Registro de Shinobi ---\n" +
            "ID: " + this.id + " \n" +
            "Nome: " + this.name + "\n" +
            "Email: " + this.email + "\n" +
            "Data de Registro: " + this.dateRegistration + "\n" +
            "Habilidades: " + this.abilities.toString() +
            "\n----------------------------";
    }
}

