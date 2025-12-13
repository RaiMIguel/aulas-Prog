package exercicios.cem_questoes_poo.questao_56;

import java.util.ArrayList;
import java.util.List;

public class NinjaTitulos {
    private String nome;
    private List<String> titulos = new ArrayList<>();

    public NinjaTitulos(String nome) {
        this.nome = nome;
    }

    public void adicionarTitulo(String titulo) {
        titulos.add(titulo);
    }

    public void mostrarTitulos() {
        System.out.println("Títulos de " + nome + ": " + String.join(", ", titulos));
    }
}