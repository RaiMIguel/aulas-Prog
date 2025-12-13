package exercicios.cem_questoes_poo.questao_75;

import java.util.ArrayList;
import java.util.List;

public class AldeiaTimesElite {
    private String nomeAldeia;
    private List<String> times = new ArrayList<>();

    public AldeiaTimesElite(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarTime(String time) {
        times.add(time);
    }

    public void mostrarTimes() {
        System.out.println("Times de elite de " + nomeAldeia + ": " + String.join(", ", times));
    }
}