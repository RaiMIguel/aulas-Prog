package exercicios.cem_questoes_poo.questao_99;

import java.util.ArrayList;
import java.util.List;

public class GuerraNinjaNinjas {
    private List<String> ninjas = new ArrayList<>();

    public void adicionarNinja(String ninja) {
        ninjas.add(ninja);
    }

    public void mostrarNinjas() {
        System.out.println("Ninjas que participaram da guerra ninja: " + String.join(", ", ninjas));
    }
}