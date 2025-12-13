package exercicios.cem_questoes_poo.questao_91;

/**
 * @param args
 * * questão: O sistema deve registrar os times que participaram do exame Chunin. Crie a classe ExameChuninTimes com lista de times.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Times do Exame Chunin: Time 7, Time 10, Time 8"
 */
public class Main91 {
    public static void main(String[] args) {
        ExameChuninTimes exame = new ExameChuninTimes();

        exame.adicionarTime("Time 7");
        exame.adicionarTime("Time 10");
        exame.adicionarTime("Time 8");

        exame.mostrarTimes();
    }
}