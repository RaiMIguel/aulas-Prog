package exercicios.cem_questoes_poo.questao_66;

/**
 * @param args
 * * questão: O sistema deve registrar os jutsus usados em cada batalha. Crie a classe BatalhaJutsus com nome da batalha e lista de jutsus utilizados.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Jutsus usados na batalha Naruto vs Pain: Rasengan, Chibaku Tensei"
 */
public class Main66 {
    public static void main(String[] args) {
        BatalhaJutsus batalha = new BatalhaJutsus("Naruto vs Pain");

        batalha.adicionarJutsu("Rasengan");
        batalha.adicionarJutsu("Chibaku Tensei");

        batalha.mostrarJutsus();
    }
}