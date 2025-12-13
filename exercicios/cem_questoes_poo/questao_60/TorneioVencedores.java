package exercicios.cem_questoes_poo.questao_60;

import java.util.ArrayList;
import java.util.List;

public class TorneioVencedores {
    private String nomeTorneio;
    private List<String> timesVencedores = new ArrayList<>();

    public TorneioVencedores(String nomeTorneio) {
        this.nomeTorneio = nomeTorneio;
    }

    public void adicionarVencedor(String time) {
        timesVencedores.add(time);
    }

    public void mostrarVencedores() {
        System.out.println("Vencedores do " + nomeTorneio + ": " + String.join(", ", timesVencedores));
    }
}