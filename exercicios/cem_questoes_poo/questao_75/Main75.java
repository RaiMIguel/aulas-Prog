package exercicios.cem_questoes_poo.questao_75;

/**
 * @param args
 * * questão: O sistema deve registrar os times de elite de cada aldeia. Crie a classe AldeiaTimesElite com nome da aldeia e lista de times de elite.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Times de elite de Konoha: ANBU, Time Sannin"
 */
public class Main75 {
    public static void main(String[] args) {
        AldeiaTimesElite konoha = new AldeiaTimesElite("Konoha");

        konoha.adicionarTime("ANBU");
        konoha.adicionarTime("Time Sannin");

        konoha.mostrarTimes();
    }
}