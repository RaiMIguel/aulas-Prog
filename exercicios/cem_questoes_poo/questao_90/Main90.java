package exercicios.cem_questoes_poo.questao_90;

/**
 * @param args
 * * questão: O sistema deve registrar os jutsus proibidos de cada clã. Crie a classe ClaJutsusProibidos com nome do clã e lista de jutsus.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Jutsus proibidos do clã Uchiha: Izanagi, Izanami"
 */
public class Main90 {
    public static void main(String[] args) {
        ClaJutsusProibidos uchiha = new ClaJutsusProibidos("Uchiha");

        uchiha.adicionarJutsu("Izanagi");
        uchiha.adicionarJutsu("Izanami");

        uchiha.mostrarJutsus();
    }
}