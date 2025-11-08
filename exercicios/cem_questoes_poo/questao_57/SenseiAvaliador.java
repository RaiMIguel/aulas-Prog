package exercicios.cem_questoes_poo.questao_57;

public class SenseiAvaliador {
    private String nome;

    public SenseiAvaliador(String nome) {
        this.nome = nome;
    }

    public void avaliarAluno(String aluno, int nota) {
        System.out.println("Sensei " + nome + " avaliou " + aluno + " com nota " + nota);
    }
}