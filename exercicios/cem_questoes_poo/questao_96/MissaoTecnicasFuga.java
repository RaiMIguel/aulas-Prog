package exercicios.cem_questoes_poo.questao_96;

import java.util.ArrayList;
import java.util.List;

public class MissaoTecnicasFuga {
    private String nomeMissao;
    private List<String> tecnicas = new ArrayList<>();

    public MissaoTecnicasFuga(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public void adicionarTecnica(String tecnica) {
        tecnicas.add(tecnica);
    }

    public void mostrarTecnicas() {
        System.out.println("Técnicas de fuga na missão " + nomeMissao + ": " + String.join(", ", tecnicas));
    }
}