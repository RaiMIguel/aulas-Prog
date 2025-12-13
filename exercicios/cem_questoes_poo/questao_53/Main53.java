package exercicios.cem_questoes_poo.questao_53;

/**
 * @param args
 * * questão: Uma missão pode ser dividida em tarefas. Crie a classe MissaoTarefas que recebe descrição da missão e lista de tarefas.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Missão: Proteger aldeia / Tarefas: Patrulhar muro, Monitorar entrada"
 */
public class Main53 {
    public static void main(String[] args) {
        MissaoTarefas protecao = new MissaoTarefas("Proteger aldeia");

        protecao.adicionarTarefa("Patrulhar muro");
        protecao.adicionarTarefa("Monitorar entrada");

        protecao.mostrarTarefas();
    }
}