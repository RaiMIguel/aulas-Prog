package exercicios.cem_questoes_poo.questao_63;

import java.util.ArrayList;
import java.util.List;

public class NinjaRivais {
    private String nome;
    private List<String> rivais = new ArrayList<>();

    public NinjaRivais(String nome) {
        this.nome = nome;
    }

    public void adicionarRival(String rival) {
        rivais.add(rival);
    }

    public void mostrarRivais() {
        System.out.println("Rivais de " + nome + ": " + String.join(", ", rivais));
    }
}