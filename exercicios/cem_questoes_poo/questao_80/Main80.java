package exercicios.cem_questoes_poo.questao_80;

/**
 * @param args
 * * questão: O sistema deve registrar os eventos especiais realizados nas aldeias. Crie a classe AldeiaEventosEspeciais com nome da aldeia e lista de eventos especiais.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Eventos especiais em Konoha: Festival da Folha, Cerimônia do Hokage"
 */
public class Main80 {
    public static void main(String[] args) {
        AldeiaEventosEspeciais konoha = new AldeiaEventosEspeciais("Konoha");

        konoha.adicionarEvento("Festival da Folha");
        konoha.adicionarEvento("Cerimônia do Hokage");

        konoha.mostrarEventos();
    }
}