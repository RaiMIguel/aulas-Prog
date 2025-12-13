package exercicios.cem_questoes_poo.questao_59;

/**
 * @param args
 * * questão: O sistema deve permitir registrar a pontuação dos ninjas em torneios. Crie a classe NinjaPontuacao com nome do ninja e pontuação.
 * Objetivos**:
 * - Encapsulamento
 * * @return "Rock Lee tem pontuação 87 no torneio"
 */
public class Main59 {
    public static void main(String[] args) {
        NinjaPontuacao rockLee = new NinjaPontuacao("Rock Lee", 87);

        rockLee.mostrarPontuacao();
    }
}