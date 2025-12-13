package exercicios.cem_questoes_poo.questao_69;

/**
 * @param args
 * * questão: O sistema deve registrar os clãs presentes em cada aldeia. Crie a classe AldeiaClas com nome da aldeia e lista de clãs.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Clãs de Konoha: Uchiha, Hyuga, Nara"
 */
public class Main69 {
    public static void main(String[] args) {
        AldeiaClas konoha = new AldeiaClas("Konoha");

        konoha.adicionarCla("Uchiha");
        konoha.adicionarCla("Hyuga");
        konoha.adicionarCla("Nara");

        konoha.mostrarClas();
    }
}