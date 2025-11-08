package exercicios.cem_questoes_poo.questao_54;

/**
 * @param args
 * * questão: Cada ninja pode registrar seu histórico de missões. Crie a classe NinjaHistorico com nome do ninja e lista de missões realizadas.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Histórico de missões de Naruto: Resgatar gato, Salvar aldeia"
 */
public class Main54 {
    public static void main(String[] args) {
        NinjaHistorico naruto = new NinjaHistorico("Naruto");

        naruto.adicionarMissao("Resgatar gato");
        naruto.adicionarMissao("Salvar aldeia");

        naruto.mostrarHistorico();
    }
}