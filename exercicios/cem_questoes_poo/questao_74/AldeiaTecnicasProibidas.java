package exercicios.cem_questoes_poo.questao_74;

import java.util.ArrayList;
import java.util.List;

public class AldeiaTecnicasProibidas {
    private String nomeAldeia;
    private List<String> tecnicas = new ArrayList<>();

    public AldeiaTecnicasProibidas(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarTecnica(String tecnica) {
        tecnicas.add(tecnica);
    }

    public void mostrarTecnicas() {
        System.out.println("Técnicas proibidas de " + nomeAldeia + ": " + String.join(", ", tecnicas));
    }
}