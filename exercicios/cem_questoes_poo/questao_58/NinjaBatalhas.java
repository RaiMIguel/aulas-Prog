package exercicios.cem_questoes_poo.questao_58;

import java.util.ArrayList;
import java.util.List;

public class NinjaBatalhas {
    private String nome;
    private List<String> batalhas = new ArrayList<>();

    public NinjaBatalhas(String nome) {
        this.nome = nome;
    }

    public void adicionarBatalha(String batalha) {
        batalhas.add(batalha);
    }

    public void mostrarBatalhas() {
        System.out.println("Batalhas de " + nome + ": " + String.join(", ", batalhas));
    }
}