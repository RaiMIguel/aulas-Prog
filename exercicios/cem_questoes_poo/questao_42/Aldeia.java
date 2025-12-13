package exercicios.cem_questoes_poo.questao_42;

import java.util.ArrayList;
import java.util.List;

public class Aldeia {
    private List<String> ninjas = new ArrayList<>();
    
    public void adicionarNinja(String nome) {
        ninjas.add(nome);
    }
    
    public void listarNinjas() {
        System.out.println("Ninjas da aldeia: " + String.join(", ", ninjas));
    }

    // Getter para manter o encapsulamento, se necessário
    public List<String> getNinjas() {
        return ninjas;
    }
    
}
