package exercicios.cem_questoes_poo.questao_100;

import java.util.ArrayList;
import java.util.List;

public class AliancaContraKaguya {
    private List<String> clas = new ArrayList<>();
    private List<String> aldeias = new ArrayList<>();

    public void adicionarCla(String cla) {
        this.clas.add(cla);
    }

    public void adicionarAldeia(String aldeia) {
        this.aldeias.add(aldeia);
    }

    public void mostrarAlianca() {
        System.out.println("Clãs que formaram a aliança contra Kaguya: " + String.join(", ", clas));
        System.out.println("Aldeias que formaram a aliança contra Kaguya: " + String.join(", ", aldeias));
    }
}