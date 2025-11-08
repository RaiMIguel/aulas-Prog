package exercicios.cem_questoes_poo.questao_92;

/**
 * @param args
 * * questão: O sistema deve registrar os times que venceram o exame Chunin. Crie a classe ExameChuninVencedores com lista de times vencedores.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Vencedores do Exame Chunin: Time 7, Time 10"
 */
public class Main92 {
    public static void main(String[] args) {
        ExameChuninVencedores vencedores = new ExameChuninVencedores();

        vencedores.adicionarVencedor("Time 7");
        vencedores.adicionarVencedor("Time 10");

        vencedores.mostrarVencedores();
    }
}