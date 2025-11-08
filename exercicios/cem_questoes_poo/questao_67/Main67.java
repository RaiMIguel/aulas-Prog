package exercicios.cem_questoes_poo.questao_67;
/**
 * @param args
 * * questão: O sistema deve registrar os times formados por senseis lendários. Crie a classe SenseiLendarioTimes com nome do sensei e lista de times.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Times treinados por Jiraiya: Time Sannin, Time Minato"
 */
public class Main67 {
    public static void main(String[] args) {
        SenseiLendarioTimes jiraiya = new SenseiLendarioTimes("Jiraiya");

        jiraiya.adicionarTime("Time Sannin");
        jiraiya.adicionarTime("Time Minato");

        jiraiya.mostrarTimes();
    }
}