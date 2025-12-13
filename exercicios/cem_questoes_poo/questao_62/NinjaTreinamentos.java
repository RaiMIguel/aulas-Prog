package exercicios.cem_questoes_poo.questao_62;

import java.util.ArrayList;
import java.util.List;

public class NinjaTreinamentos {
    private String nome;
    private List<String> treinamentos = new ArrayList<>();

    public NinjaTreinamentos(String nome) {
        this.nome = nome;
    }

    public void adicionarTreinamento(String treinamento) {
        treinamentos.add(treinamento);
    }

    public void mostrarTreinamentos() {
        System.out.println("Treinamentos de " + nome + ": " + String.join(", ", treinamentos));
    }
}