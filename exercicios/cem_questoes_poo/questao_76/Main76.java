package exercicios.cem_questoes_poo.questao_76;
/**
 * @param args
 * * questão: O sistema deve registrar os ninjas que participaram do grupo Akatsuki. Crie a classe AkatsukiMembros com lista de nomes dos membros.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Membros da Akatsuki: Itachi, Pain, Kisame"
 */
public class Main76 {
    public static void main(String[] args) {
        AkatsukiMembros akatsuki = new AkatsukiMembros();

        akatsuki.adicionarMembro("Itachi");
        akatsuki.adicionarMembro("Pain");
        akatsuki.adicionarMembro("Kisame");

        akatsuki.mostrarMembros();
    }
}