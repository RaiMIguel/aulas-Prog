package exercicios.cem_questoes_poo.questao_78;

import java.util.ArrayList;
import java.util.List;

public class NinjaTransformacoes {
    private String nome;
    private List<String> transformacoes = new ArrayList<>();

    public NinjaTransformacoes(String nome) {
        this.nome = nome;
    }

    public void adicionarTransformacao(String transformacao) {
        transformacoes.add(transformacao);
    }

    public void mostrarTransformacoes() {
        System.out.println("Transformações de " + nome + ": " + String.join(", ", transformacoes));
    }
}