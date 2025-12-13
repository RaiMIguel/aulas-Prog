package exercicios.cem_questoes_poo.questao_82;

/**
 * @param args
 * * questão: O sistema deve registrar as técnicas de cura usadas por cada ninja médico. Crie a classe MedicoTecnicasCura com nome do ninja e lista de técnicas de cura.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Técnicas de cura de Tsunade: Cura Celular, Regeneração Avançada"
 */
public class Main82 {
    public static void main(String[] args) {
        MedicoTecnicasCura tsunade = new MedicoTecnicasCura("Tsunade");

        tsunade.adicionarTecnica("Cura Celular");
        tsunade.adicionarTecnica("Regeneração Avançada");

        tsunade.mostrarTecnicas();
    }
}