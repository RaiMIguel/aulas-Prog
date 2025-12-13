package exercicios.cem_questoes_poo.questao_46;
/**
 * @param args
 *
 * questão: O sistema deve permitir registrar resultados de batalhas. Crie a classe Batalha com nomes dos participantes e resultado da batalha.
 * Objetivos**:
 * - Encapsulamento
 *
 * @return "Batalha: Naruto vs Sasuke / Resultado: Naruto venceu"
 */
public class Main {
    public static void main(String[] args) {
        Batalha luta = new Batalha("Naruto", "Sasuke", "Naruto venceu");
        
        luta.mostrarResultado();
    }    
}
