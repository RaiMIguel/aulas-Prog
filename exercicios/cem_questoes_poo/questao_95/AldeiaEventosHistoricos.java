package exercicios.cem_questoes_poo.questao_95;

import java.util.ArrayList;
import java.util.List;

public class AldeiaEventosHistoricos {
    private String nomeAldeia;
    private List<String> eventos = new ArrayList<>();

    public AldeiaEventosHistoricos(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarEvento(String evento) {
        eventos.add(evento);
    }

    public void mostrarEventos() {
        System.out.println("Eventos históricos de " + nomeAldeia + ": " + String.join(", ", eventos));
    }
}