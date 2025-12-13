package exercicios.cem_questoes_poo.questao_68;

import java.util.ArrayList;
import java.util.List;

public class AldeiaLideres {
    private String nomeAldeia;
    private List<String> lideres = new ArrayList<>();

    public AldeiaLideres(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarLider(String lider) {
        lideres.add(lider);
    }

    public void mostrarLideres() {
        System.out.println("Líderes da aldeia " + nomeAldeia + ": " + String.join(", ", lideres));
    }
}