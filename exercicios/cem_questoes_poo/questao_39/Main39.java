package exercicios.cem_questoes_poo.questao_39;
/**
 * @param args
 *
 * questão: Os ninjas podem receber títulos especiais. Crie a interface RecebeTitulo com método concederTitulo(). Implemente a classe NinjaTitulado que recebe nome do ninja e título.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Ninja Gaara recebeu o título: Kazekage"
 */
public class Main39 {
    public static void main(String[] args) {
        // Entrada Simulada: Nome: “Gaara”, Título: “Kazekage”
        RecebeTitulo gaara = new NinjaTitulado("Gaara", "Kazekage");
        
        gaara.concederTitulo();
    }
    
}
