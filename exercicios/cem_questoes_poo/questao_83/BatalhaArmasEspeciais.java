package exercicios.cem_questoes_poo.questao_83;

import java.util.ArrayList;
import java.util.List;

public class BatalhaArmasEspeciais {
    private String nomeBatalha;
    private List<String> armas = new ArrayList<>();

    public BatalhaArmasEspeciais(String nomeBatalha) {
        this.nomeBatalha = nomeBatalha;
    }

    public void adicionarArma(String arma) {
        armas.add(arma);
    }

    public void mostrarArmas() {
        System.out.println("Armas especiais na batalha " + nomeBatalha + ": " + String.join(", ", armas));
    }
}