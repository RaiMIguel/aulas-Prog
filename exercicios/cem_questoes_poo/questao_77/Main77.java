package exercicios.cem_questoes_poo.questao_77;
/**
 * @param args
 * * questão: O sistema deve registrar os jutsus únicos de cada clã. Crie a classe ClaJutsusUnicos com nome do clã e lista de jutsus únicos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Jutsus únicos do clã Uchiha: Amaterasu, Tsukuyomi"
 */
public class Main77 {
    public static void main(String[] args) {
        ClaJutsusUnicos uchiha = new ClaJutsusUnicos("Uchiha");

        uchiha.adicionarJutsu("Amaterasu");
        uchiha.adicionarJutsu("Tsukuyomi");

        uchiha.mostrarJutsus();
    }
}