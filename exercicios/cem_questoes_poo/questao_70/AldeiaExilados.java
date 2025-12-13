package exercicios.cem_questoes_poo.questao_70;

import java.util.ArrayList;
import java.util.List;

public class AldeiaExilados {
    private String nomeAldeia;
    private List<String> exilados = new ArrayList<>();

    public AldeiaExilados(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarExilado(String exilado) {
        exilados.add(exilado);
    }

    public void mostrarExilados() {
        System.out.println("Exilados de " + nomeAldeia + ": " + String.join(", ", exilados));
    }
}