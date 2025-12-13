package exercicios.cem_questoes_poo.questao_82;

import java.util.ArrayList;
import java.util.List;

public class MedicoTecnicasCura {
    private String nome;
    private List<String> tecnicas = new ArrayList<>();

    public MedicoTecnicasCura(String nome) {
        this.nome = nome;
    }

    public void adicionarTecnica(String tecnica) {
        tecnicas.add(tecnica);
    }

    public void mostrarTecnicas() {
        System.out.println("Técnicas de cura de " + nome + ": " + String.join(", ", tecnicas));
    }
}