package exercicios.cem_questoes_poo.questao_55;

import java.util.ArrayList;
import java.util.List;

public class NinjaEspecialidades {
    private String nome;
    private List<String> especialidades = new ArrayList<>();

    public NinjaEspecialidades(String nome) {
        this.nome = nome;
    }

    public void adicionarEspecialidade(String esp) {
        especialidades.add(esp);
    }

    public void mostrarEspecialidades() {
        System.out.println("Especialidades de " + nome + ": " + String.join(", ", especialidades));
    }
}