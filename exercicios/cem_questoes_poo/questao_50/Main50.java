package exercicios.cem_questoes_poo.questao_50;
/**
 * @param args
 *
 * questão: O sistema ninja deve permitir comparar o poder de dois ninjas. Crie a classe ComparadorPoderNinja com nomes e poder de cada ninja, e método para comparar quem é mais forte.
 * Objetivos**:
 * - Encapsulamento
 * - Métodos de comparação
 *
 * @return "Naruto é mais forte que Sasuke"
 */
public class Main50 {
    public static void main(String[] args) {
        // Entrada Simulada: Ninja1: “Naruto”, Poder: 10, Ninja2: “Sasuke”, Poder: 9
        ComparadorPoderNinja comparador = new ComparadorPoderNinja("Naruto", 10, "Sasuke", 9);
        
        comparador.comparar();
    }    
}
