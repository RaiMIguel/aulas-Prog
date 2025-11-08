package exercicios.cem_questoes_poo.questao_58;

/**
 * @param args
 * * questão: O sistema deve registrar o histórico de batalhas de cada ninja. Crie a classe NinjaBatalhas com nome do ninja e lista de batalhas.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Batalhas de Naruto: Naruto vs Pain, Naruto vs Sasuke"
 */
public class Main58 {
    public static void main(String[] args) {
        NinjaBatalhas naruto = new NinjaBatalhas("Naruto");

        naruto.adicionarBatalha("Naruto vs Pain");
        naruto.adicionarBatalha("Naruto vs Sasuke");

        naruto.mostrarBatalhas();
    }
}