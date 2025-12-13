package exercicios.cem_questoes_poo.questao_54;

import java.util.ArrayList;
import java.util.List;

public class NinjaHistorico {
    private String nome;
    private List<String> missoes = new ArrayList<>();

    public NinjaHistorico(String nome) {
        this.nome = nome;
    }

    public void adicionarMissao(String missao) {
        missoes.add(missao);
    }

    public void mostrarHistorico() {
        System.out.println("Histórico de missões de " + nome + ": " + String.join(", ", missoes));
    }
}