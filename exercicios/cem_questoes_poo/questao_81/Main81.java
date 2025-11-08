package exercicios.cem_questoes_poo.questao_81;

/**
 * @param args
 * * questão: O sistema deve registrar os scrolls de técnicas secretas de cada aldeia. Crie a classe AldeiaScrollsSecretos com nome da aldeia e lista de scrolls.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Scrolls secretos de Konoha: Scroll de Invocação, Scroll de Técnicas Proibidas"
 */
public class Main81 {
    public static void main(String[] args) {
        AldeiaScrollsSecretos konoha = new AldeiaScrollsSecretos("Konoha");

        konoha.adicionarScroll("Scroll de Invocação");
        konoha.adicionarScroll("Scroll de Técnicas Proibidas");

        konoha.mostrarScrolls();
    }
}