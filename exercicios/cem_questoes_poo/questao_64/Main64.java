package exercicios.cem_questoes_poo.questao_64;

/**
 * @param args
 * * questão: O sistema deve registrar os times adversários em torneios. Crie a classe TorneioAdversarios com nome do torneio e lista de times adversários.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Adversários do Exame Chunin: Time 8, Time 10"
 */
public class Main64 {
    public static void main(String[] args) {
        TorneioAdversarios exameChunin = new TorneioAdversarios("Exame Chunin");

        exameChunin.adicionarAdversario("Time 8");
        exameChunin.adicionarAdversario("Time 10");

        exameChunin.mostrarAdversarios();
    }
}