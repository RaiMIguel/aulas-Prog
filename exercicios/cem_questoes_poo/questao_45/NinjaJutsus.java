package exercicios.cem_questoes_poo.questao_45;

import java.util.ArrayList;
import java.util.List;

public class NinjaJutsus {
    private List<String> jutsus = new ArrayList<>();
    
    public void aprenderJutsu(String nome) {
        jutsus.add(nome);
    }
    
    public void listarJutsus() {
        System.out.println("Jutsus do ninja: " + String.join(", ", jutsus));
    }

    // Getter
    public List<String> getJutsus() {
        return jutsus;
    }
    
}
