package exercicios.cem_questoes_poo.questao_84;

/**
 * @param args
 * * questão: O sistema deve registrar os chefes invocados em cada batalha. Crie a classe BatalhaChefesInvocados com nome da batalha e lista de chefes.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Chefes invocados na batalha Jiraiya vs Pain: Gamabunta, Rei dos Seis Caminhos"
 */
public class Main84 {
    public static void main(String[] args) {
        BatalhaChefesInvocados batalha = new BatalhaChefesInvocados("Jiraiya vs Pain");

        batalha.adicionarChefe("Gamabunta");
        batalha.adicionarChefe("Rei dos Seis Caminhos");

        batalha.mostrarChefes();
    }
}