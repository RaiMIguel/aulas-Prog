package exercicios.cem_questoes_poo.questao_91;

import java.util.ArrayList;
import java.util.List;

public class ExameChuninTimes {
    private List<String> times = new ArrayList<>();

    public void adicionarTime(String time) {
        times.add(time);
    }

    public void mostrarTimes() {
        System.out.println("Times do Exame Chunin: " + String.join(", ", times));
    }
}
