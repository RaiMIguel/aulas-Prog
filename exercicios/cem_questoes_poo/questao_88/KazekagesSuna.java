package exercicios.cem_questoes_poo.questao_88;

import java.util.ArrayList;
import java.util.List;

public class KazekagesSuna {
    private List<String> kazekages = new ArrayList<>();

    public void adicionarKazekage(String kazekage) {
        kazekages.add(kazekage);
    }

    public void mostrarKazekages() {
        System.out.println("Kazekages de Suna: " + String.join(", ", kazekages));
    }
}