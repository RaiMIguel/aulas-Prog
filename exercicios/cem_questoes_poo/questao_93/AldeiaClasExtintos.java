package exercicios.cem_questoes_poo.questao_93;

import java.util.ArrayList;
import java.util.List;

public class AldeiaClasExtintos {
    private String nomeAldeia;
    private List<String> clasExtintos = new ArrayList<>();

    public AldeiaClasExtintos(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarClaExtinto(String cla) {
        clasExtintos.add(cla);
    }

    public void mostrarClasExtintos() {
        System.out.println("Clãs extintos de " + nomeAldeia + ": " + String.join(", ", clasExtintos));
    }
}