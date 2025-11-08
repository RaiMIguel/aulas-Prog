package exercicios.cem_questoes_poo.questao_97;

import java.util.ArrayList;
import java.util.List;

public class AkatsukiDerrotadaPor {
    private List<String> times = new ArrayList<>();

    public void adicionarTime(String time) {
        times.add(time);
    }

    public void mostrarTimes() {
        System.out.println("Times que derrotaram a Akatsuki: " + String.join(", ", times));
    }
}