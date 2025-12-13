package exercicios.cem_questoes_poo.questao_94;

import java.util.ArrayList;
import java.util.List;

public class NinjaInvocacoesEspeciais {
    private String nome;
    private List<String> invocacoes = new ArrayList<>();

    public NinjaInvocacoesEspeciais(String nome) {
        this.nome = nome;
    }

    public void adicionarInvocacao(String invocacao) {
        invocacoes.add(invocacao);
    }

    public void mostrarInvocacoes() {
        System.out.println("Invocações especiais de " + nome + ": " + String.join(", ", invocacoes));
    }
}