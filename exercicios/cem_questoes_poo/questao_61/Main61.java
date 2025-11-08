package exercicios.cem_questoes_poo.questao_61;

/**
 * @param args
 * * questão: O sistema deve registrar os exames que cada ninja participou. Crie a classe NinjaExames com nome do ninja e lista de exames.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Exames de Naruto: Genin, Chunin"
 */
public class Main61 {
    public static void main(String[] args) {
        NinjaExames naruto = new NinjaExames("Naruto");

        naruto.adicionarExame("Genin");
        naruto.adicionarExame("Chunin");

        naruto.mostrarExames();
    }
}