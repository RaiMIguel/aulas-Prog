package exercicios.cem_questoes_poo.questao_90;

import java.util.ArrayList;
import java.util.List;

public class ClaJutsusProibidos {
    private String nomeCla;
    private List<String> jutsus = new ArrayList<>();

    public ClaJutsusProibidos(String nomeCla) {
        this.nomeCla = nomeCla;
    }

    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }

    public void mostrarJutsus() {
        System.out.println("Jutsus proibidos do clã " + nomeCla + ": " + String.join(", ", jutsus));
    }
}