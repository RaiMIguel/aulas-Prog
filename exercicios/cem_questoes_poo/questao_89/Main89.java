package exercicios.cem_questoes_poo.questao_89;

/**
 * @param args
 * * questão: O sistema deve registrar os membros lendários de cada clã. Crie a classe ClaMembrosLendarios com nome do clã e lista de membros.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Membros lendários do clã Uchiha: Madara, Itachi, Sasuke"
 */
public class Main89 {
    public static void main(String[] args) {
        ClaMembrosLendarios uchiha = new ClaMembrosLendarios("Uchiha");

        uchiha.adicionarMembro("Madara");
        uchiha.adicionarMembro("Itachi");
        uchiha.adicionarMembro("Sasuke");

        uchiha.mostrarMembros();
    }
}