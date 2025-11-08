package exercicios.cem_questoes_poo.questao_79;

import java.util.ArrayList;
import java.util.List;

public class BatalhaAtaquesEspeciais {
    private String nomeBatalha;
    private List<String> ataques = new ArrayList<>();

    public BatalhaAtaquesEspeciais(String nomeBatalha) {
        this.nomeBatalha = nomeBatalha;
    }

    public void adicionarAtaque(String ataque) {
        ataques.add(ataque);
    }

    public void mostrarAtaques() {
        System.out.println("Ataques especiais na batalha " + nomeBatalha + ": " + String.join(", ", ataques));
    }
}