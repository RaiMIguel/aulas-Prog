package exercicios.cem_questoes_poo.questao_72;

/**
 * @param args
 * * questão: O sistema deve registrar os cargos já ocupados por cada ninja. Crie a classe NinjaCargos com nome do ninja e lista de cargos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Cargos de Naruto: Genin, Chunin, Hokage"
 */
public class Main72 {
    public static void main(String[] args) {
        NinjaCargos naruto = new NinjaCargos("Naruto");

        naruto.adicionarCargo("Genin");
        naruto.adicionarCargo("Chunin");
        naruto.adicionarCargo("Hokage");

        naruto.mostrarCargos();
    }
}