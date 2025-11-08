package exercicios.cem_questoes_poo.questao_81;

import java.util.ArrayList;
import java.util.List;

public class AldeiaScrollsSecretos {
    private String nomeAldeia;
    private List<String> scrolls = new ArrayList<>();

    public AldeiaScrollsSecretos(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarScroll(String scroll) {
        scrolls.add(scroll);
    }

    public void mostrarScrolls() {
        System.out.println("Scrolls secretos de " + nomeAldeia + ": " + String.join(", ", scrolls));
    }
}