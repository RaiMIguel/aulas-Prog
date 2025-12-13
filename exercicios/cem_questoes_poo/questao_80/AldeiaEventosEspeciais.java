package exercicios.cem_questoes_poo.questao_80;

import java.util.ArrayList;
import java.util.List;

public class AldeiaEventosEspeciais {
    private String nomeAldeia;
    private List<String> eventos = new ArrayList<>();

    public AldeiaEventosEspeciais(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }

    public void adicionarEvento(String evento) {
        eventos.add(evento);
    }

    public void mostrarEventos() {
        System.out.println("Eventos especiais em " + nomeAldeia + ": " + String.join(", ", eventos));
    }
}