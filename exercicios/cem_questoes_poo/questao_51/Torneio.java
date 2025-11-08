package exercicios.cem_questoes_poo.questao_51;

import java.util.ArrayList;
import java.util.List;

public class Torneio {
    private String nome;
    private List<String> times = new ArrayList<>();

    public Torneio(String nome) {
        this.nome = nome;
    }

    public void adicionarTime(String time) {
        times.add(time);
    }

    public void mostrarTimes() {
        System.out.println("Torneio: " + nome);
        System.out.println("Times participantes: " + String.join(", ", times));
    }
}