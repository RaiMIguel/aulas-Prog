package exercicios.cem_questoes_poo.questao_47;

import java.util.ArrayList;
import java.util.List;

public class TimeNinjaCompleto {
    private List<String> ninjas = new ArrayList<>();
    private String sensei;
    
    public TimeNinjaCompleto(String sensei) {
        this.sensei = sensei;
    }
    
    public void adicionarNinja(String nome) {
        ninjas.add(nome);
    }
    
    public void mostrarTime() {
        System.out.println("Time formado por: " + String.join(", ", ninjas));
        System.out.println("Sensei: " + sensei);
    }

    // Getters e Setters (omissos para brevidade)
    public List<String> getNinjas() { return ninjas; }
    public String getSensei() { return sensei; }
    public void setSensei(String sensei) { this.sensei = sensei; }
    
}
