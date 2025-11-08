package exercicios.cem_questoes_poo.questao_65;

import java.util.ArrayList;
import java.util.List;

public class MedicoEspecialidades {
    private String nome;
    private List<String> especialidades = new ArrayList<>();

    public MedicoEspecialidades(String nome) {
        this.nome = nome;
    }

    public void adicionarEspecialidade(String especialidade) {
        especialidades.add(especialidade);
    }

    public void mostrarEspecialidades() {
        System.out.println("Especialidades médicas de " + nome + ": " + String.join(", ", especialidades));
    }
}