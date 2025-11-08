package exercicios.cem_questoes_poo.questao_77;

import java.util.ArrayList;
import java.util.List;

public class ClaJutsusUnicos {
    private String nomeCla;
    private List<String> jutsus = new ArrayList<>();

    public ClaJutsusUnicos(String nomeCla) {
        this.nomeCla = nomeCla;
    }

    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }

    public void mostrarJutsus() {
        System.out.println("Jutsus únicos do clã " + nomeCla + ": " + String.join(", ", jutsus));
    }
}