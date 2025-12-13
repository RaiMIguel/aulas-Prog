package exercicios.cem_questoes_poo.questao_86;

/**
 * @param args
 * * questão: O sistema deve registrar os troféus conquistados pelos ninjas. Crie a classe NinjaTrofeus com nome do ninja e lista de troféus.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Troféus de Naruto: Campeão Exame Chunin, Herói de Konoha"
 */
public class Main86 {
    public static void main(String[] args) {
        NinjaTrofeus naruto = new NinjaTrofeus("Naruto");

        naruto.adicionarTrofeu("Campeão Exame Chunin");
        naruto.adicionarTrofeu("Herói de Konoha");

        naruto.mostrarTrofeus();
    }
}