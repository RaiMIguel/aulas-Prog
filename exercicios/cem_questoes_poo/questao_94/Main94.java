package exercicios.cem_questoes_poo.questao_94;
/**
 * @param args
 * * questão: O sistema deve registrar as invocações especiais feitas por ninjas. Crie a classe NinjaInvocacoesEspeciais com nome do ninja e lista de invocações.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Invocações especiais de Naruto: Gamabunta, Gamakichi"
 */
public class Main94 {
    public static void main(String[] args) {
        NinjaInvocacoesEspeciais naruto = new NinjaInvocacoesEspeciais("Naruto");

        naruto.adicionarInvocacao("Gamabunta");
        naruto.adicionarInvocacao("Gamakichi");

        naruto.mostrarInvocacoes();
    }
}