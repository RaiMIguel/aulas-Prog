package exercicios.cem_questoes_poo.questao_52;

/**
 * @param args
 * * questão: Senseis podem liderar mais de um time. Crie a classe SenseiTimes que recebe nome do sensei e lista de times liderados.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Sensei Kakashi lidera os times: Time 7, Time 11"
 */
public class Main52 {
    public static void main(String[] args) {
        SenseiTimes kakashi = new SenseiTimes("Kakashi");

        kakashi.adicionarTime("Time 7");
        kakashi.adicionarTime("Time 11");

        kakashi.mostrarTimes();
    }
}