package exercicios.cem_questoes_poo.questao_85;

import java.util.ArrayList;
import java.util.List;

public class AliancasAldeias {
    private String nomeAldeia;
    private List<String> aliadas = new ArrayList<>();

    public AliancasAldeias(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarAliada(String aliada) {
        aliadas.add(aliada);
    }

    public void mostrarAliadas() {
        System.out.println("Aldeias aliadas de " + nomeAldeia + ": " + String.join(", ", aliadas));
    }
}