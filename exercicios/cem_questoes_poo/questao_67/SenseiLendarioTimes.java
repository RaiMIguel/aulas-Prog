package exercicios.cem_questoes_poo.questao_67;

import java.util.ArrayList;
import java.util.List;

public class SenseiLendarioTimes {
    private String nome;
    private List<String> times = new ArrayList<>();

    public SenseiLendarioTimes(String nome) {
        this.nome = nome;
    }

    public void adicionarTime(String time) {
        times.add(time);
    }

    public void mostrarTimes() {
        System.out.println("Times treinados por " + nome + ": " + String.join(", ", times));
    }
}