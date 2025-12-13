package exercicios.cem_questoes_poo.questao_73;

/**
 * @param args
 * * questão: O sistema deve registrar os alunos treinados por cada sensei. Crie a classe SenseiAlunos com nome do sensei e lista de alunos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Alunos treinados por Kakashi: Naruto, Sasuke, Sakura"
 */
public class Main73 {
    public static void main(String[] args) {
        SenseiAlunos kakashi = new SenseiAlunos("Kakashi");

        kakashi.adicionarAluno("Naruto");
        kakashi.adicionarAluno("Sasuke");
        kakashi.adicionarAluno("Sakura");

        kakashi.mostrarAlunos();
    }
}