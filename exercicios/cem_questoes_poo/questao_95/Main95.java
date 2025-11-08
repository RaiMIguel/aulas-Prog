package exercicios.cem_questoes_poo.questao_95;

/**
 * @param args
 * * questão: O sistema deve registrar os eventos históricos de cada aldeia. Crie a classe AldeiaEventosHistoricos com nome da aldeia e lista de eventos históricos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Eventos históricos de Konoha: Fundação, Ataque da Kyuubi"
 */
public class Main95 {
    public static void main(String[] args) {
        AldeiaEventosHistoricos konoha = new AldeiaEventosHistoricos("Konoha");

        konoha.adicionarEvento("Fundação");
        konoha.adicionarEvento("Ataque da Kyuubi");

        konoha.mostrarEventos();
    }
}