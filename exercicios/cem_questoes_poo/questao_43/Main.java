package exercicios.cem_questoes_poo.questao_43;
/**
 * @param args
 *
 * questão: Cada missão pode ter vários participantes. Crie a classe Missao com uma lista de nomes de ninjas participantes e método para mostrar todos os participantes.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 *
 * @return "Participantes da missão: Naruto, Sasuke"
 */
public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Participantes: [“Naruto”, “Sasuke”]
        Missao missao = new Missao();
        
        missao.adicionarParticipante("Naruto");
        missao.adicionarParticipante("Sasuke");
        
        missao.listarParticipantes();
    }    
}
