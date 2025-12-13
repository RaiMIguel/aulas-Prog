package exercicios.cem_questoes_poo.questao_56;

/**
 * @param args
 * * questão: O sistema deve registrar os títulos já recebidos pelos ninjas. Crie a classe NinjaTitulos com nome do ninja e lista de títulos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Títulos de Gaara: Kazekage, Salvador de Suna"
 */
public class Main56 {
    public static void main(String[] args) {
        NinjaTitulos gaara = new NinjaTitulos("Gaara");

        gaara.adicionarTitulo("Kazekage");
        gaara.adicionarTitulo("Salvador de Suna");

        gaara.mostrarTitulos();
    }
}