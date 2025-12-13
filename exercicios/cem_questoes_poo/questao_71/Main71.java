package exercicios.cem_questoes_poo.questao_71;

/**
 * @param args
 * * questão: O sistema deve registrar os jutsus lendários de cada aldeia. Crie a classe AldeiaJutsusLendarios com nome da aldeia e lista de jutsus lendários.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Jutsus lendários de Konoha: Rasengan, Chidori"
 */
public class Main71 {
    public static void main(String[] args) {
        AldeiaJutsusLendarios konoha = new AldeiaJutsusLendarios("Konoha");

        konoha.adicionarJutsu("Rasengan");
        konoha.adicionarJutsu("Chidori");

        konoha.mostrarJutsus();
    }
}