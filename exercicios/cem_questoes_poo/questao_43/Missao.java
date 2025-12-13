package exercicios.cem_questoes_poo.questao_43;

import java.util.ArrayList;
import java.util.List;

public class Missao {
    private List<String> participantes = new ArrayList<>();
    
    public void adicionarParticipante(String nome) {
        participantes.add(nome);
    }
    
    public void listarParticipantes() {
        System.out.println("Participantes da missão: " + String.join(", ", participantes));
    }
    
    // Getter
    public List<String> getParticipantes() {
        return participantes;
    }
    
}
