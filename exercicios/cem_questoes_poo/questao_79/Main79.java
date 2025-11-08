package exercicios.cem_questoes_poo.questao_79;

/**
 * @param args
 * * questão: O sistema deve registrar os ataques especiais usados em batalhas importantes. Crie a classe BatalhaAtaquesEspeciais com nome da batalha e lista de ataques especiais.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Ataques especiais na batalha Naruto vs Sasuke: Rasengan, Chidori"
 */
public class Main79 {
    public static void main(String[] args) {
        BatalhaAtaquesEspeciais batalha = new BatalhaAtaquesEspeciais("Naruto vs Sasuke");

        batalha.adicionarAtaque("Rasengan");
        batalha.adicionarAtaque("Chidori");

        batalha.mostrarAtaques();
    }
}