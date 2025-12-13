package exercicios.cem_questoes_poo.questao_84;

import java.util.ArrayList;
import java.util.List;

public class BatalhaChefesInvocados {
    private String nomeBatalha;
    private List<String> chefes = new ArrayList<>();

    public BatalhaChefesInvocados(String nomeBatalha) {
        this.nomeBatalha = nomeBatalha;
    }

    public void adicionarChefe(String chefe) {
        chefes.add(chefe);
    }

    public void mostrarChefes() {
        System.out.println("Chefes invocados na batalha " + nomeBatalha + ": " + String.join(", ", chefes));
    }
}