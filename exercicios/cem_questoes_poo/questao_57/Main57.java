package exercicios.cem_questoes_poo.questao_57;

/**
 * @param args
 * * questão: O sistema deve permitir que senseis avaliem o desempenho de seus alunos. Crie a classe SenseiAvaliador com nome do sensei e método para avaliar alunos.
 * Objetivos**:
 * - Encapsulamento
 * - Métodos de avaliação
 * * @return "Sensei Kakashi avaliou Naruto com nota 9"
 */
public class Main57 {
    public static void main(String[] args) {
        SenseiAvaliador kakashi = new SenseiAvaliador("Kakashi");

        kakashi.avaliarAluno("Naruto", 9);
    }
}