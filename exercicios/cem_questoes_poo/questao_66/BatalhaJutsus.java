package exercicios.cem_questoes_poo.questao_66;

import java.util.ArrayList;
import java.util.List;

public class BatalhaJutsus {
    private String nomeBatalha;
    private List<String> jutsus = new ArrayList<>();

    public BatalhaJutsus(String nomeBatalha) {
        this.nomeBatalha = nomeBatalha;
    }

    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }

    public void mostrarJutsus() {
        System.out.println("Jutsus usados na batalha " + nomeBatalha + ": " + String.join(", ", jutsus));
    }
}