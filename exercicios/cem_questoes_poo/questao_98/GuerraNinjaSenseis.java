package exercicios.cem_questoes_poo.questao_98;

import java.util.ArrayList;
import java.util.List;

public class GuerraNinjaSenseis {
    private List<String> senseis = new ArrayList<>();

    public void adicionarSensei(String sensei) {
        this.senseis.add(sensei);
    }

    public void mostrarSenseis() {
        System.out.println("Senseis que participaram da guerra ninja: " + String.join(", ", senseis));
    }
}