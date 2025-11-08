package exercicios.cem_questoes_poo.questao_83;

/**
 * @param args
 * * questão: O sistema deve registrar as armas especiais usadas em batalhas. Crie a classe BatalhaArmasEspeciais com nome da batalha e lista de armas.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Armas especiais na batalha Naruto vs Sasuke: Kunai, Espada Kusanagi"
 */
public class Main83 {
    public static void main(String[] args) {
        BatalhaArmasEspeciais batalha = new BatalhaArmasEspeciais("Naruto vs Sasuke");

        batalha.adicionarArma("Kunai");
        batalha.adicionarArma("Espada Kusanagi");

        batalha.mostrarArmas();
    }
}