package exercicios.cem_questoes_poo.questao_44;

import java.util.ArrayList;
import java.util.List;

public class AldeiaSenseis {
    private List<String> senseis = new ArrayList<>();
    
    public void adicionarSensei(String nome) {
        senseis.add(nome);
    }
    
    public void listarSenseis() {
        System.out.println("Senseis da aldeia: " + String.join(", ", senseis));
    }

    // Getter
    public List<String> getSenseis() {
        return senseis;
    }
    
}
