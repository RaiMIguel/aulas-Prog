package exercicios.cem_questoes_poo.questao_71;

import java.util.ArrayList;
import java.util.List;

public class AldeiaJutsusLendarios {
    private String nomeAldeia;
    private List<String> jutsus = new ArrayList<>();

    public AldeiaJutsusLendarios(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }

    public void mostrarJutsus() {
        System.out.println("Jutsus lendários de " + nomeAldeia + ": " + String.join(", ", jutsus));
    }
}