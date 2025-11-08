package exercicios.cem_questoes_poo.questao_87;

import java.util.ArrayList;
import java.util.List;

public class HokagesKonoha {
    private List<String> hokages = new ArrayList<>();

    public void adicionarHokage(String hokage) {
        hokages.add(hokage);
    }

    public void mostrarHokages() {
        System.out.println("Hokages de Konoha: " + String.join(", ", hokages));
    }
}