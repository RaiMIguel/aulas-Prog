package exercicios.cem_questoes_poo.questao_70;

/**
 * @param args
 * * questão: O sistema deve registrar os ninjas exilados de cada aldeia. Crie a classe AldeiaExilados com nome da aldeia e lista de exilados.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Exilados de Konoha: Orochimaru, Itachi"
 */
public class Main70 {
    public static void main(String[] args) {
        AldeiaExilados konoha = new AldeiaExilados("Konoha");

        konoha.adicionarExilado("Orochimaru");
        konoha.adicionarExilado("Itachi");

        konoha.mostrarExilados();
    }
}