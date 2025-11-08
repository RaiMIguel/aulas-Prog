package exercicios.cem_questoes_poo.questao_51;

/**
 * @param args
 * * questão: Os times podem participar de torneios. Crie a classe Torneio que recebe o nome do torneio e lista de times participantes. Implemente método para exibir todos os times.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Torneio: Exame Chunin / Times participantes: Time 7, Time 10"
 */
public class Main51 {
    public static void main(String[] args) {
        Torneio exameChunin = new Torneio("Exame Chunin");

        exameChunin.adicionarTime("Time 7");
        exameChunin.adicionarTime("Time 10");

        exameChunin.mostrarTimes();
    }
}