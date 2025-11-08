package exercicios.cem_questoes_poo.questao_73;

import java.util.ArrayList;
import java.util.List;

public class SenseiAlunos {
    private String nome;
    private List<String> alunos = new ArrayList<>();

    public SenseiAlunos(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(String aluno) {
        alunos.add(aluno);
    }

    public void mostrarAlunos() {
        System.out.println("Alunos treinados por " + nome + ": " + String.join(", ", alunos));
    }
}