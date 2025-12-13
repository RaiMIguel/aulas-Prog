package exercicios.cem_questoes_poo.questao_72;

import java.util.ArrayList;
import java.util.List;

public class NinjaCargos {
    private String nome;
    private List<String> cargos = new ArrayList<>();

    public NinjaCargos(String nome) {
        this.nome = nome;
    }

    public void adicionarCargo(String cargo) {
        cargos.add(cargo);
    }

    public void mostrarCargos() {
        System.out.println("Cargos de " + nome + ": " + String.join(", ", cargos));
    }
}