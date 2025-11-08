package exercicios.cem_questoes_poo.questao_86;

import java.util.ArrayList;
import java.util.List;

public class NinjaTrofeus {
    private String nome;
    private List<String> trofeus = new ArrayList<>();

    public NinjaTrofeus(String nome) {
        this.nome = nome;
    }

    public void adicionarTrofeu(String trofeu) {
        trofeus.add(trofeu);
    }

    public void mostrarTrofeus() {
        System.out.println("Troféus de " + nome + ": " + String.join(", ", trofeus));
    }
}