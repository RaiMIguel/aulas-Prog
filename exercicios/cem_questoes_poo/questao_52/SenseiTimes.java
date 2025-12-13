package exercicios.cem_questoes_poo.questao_52;

import java.util.ArrayList;
import java.util.List;

public class SenseiTimes {
    private String nome;
    private List<String> times = new ArrayList<>();

    public SenseiTimes(String nome) {
        this.nome = nome;
    }

    public void adicionarTime(String time) {
        times.add(time);
    }

    public void mostrarTimes() {
        System.out.println("Sensei " + nome + " lidera os times: " + String.join(", ", times));
    }
}