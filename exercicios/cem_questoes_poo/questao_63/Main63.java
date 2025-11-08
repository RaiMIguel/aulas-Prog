package exercicios.cem_questoes_poo.questao_63;

/**
 * @param args
 * * questão: O sistema deve registrar os rivais de cada ninja. Crie a classe NinjaRivais com nome do ninja e lista de rivais.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Rivais de Naruto: Sasuke, Neji"
 */
public class Main63 {
    public static void main(String[] args) {
        NinjaRivais naruto = new NinjaRivais("Naruto");

        naruto.adicionarRival("Sasuke");
        naruto.adicionarRival("Neji");

        naruto.mostrarRivais();
    }
}