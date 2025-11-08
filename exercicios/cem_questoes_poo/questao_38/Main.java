package exercicios.cem_questoes_poo.questao_38;
/**
 * @param args
 *
 * questão: Os times podem realizar missões juntos. Crie a interface TimeMissao com o método realizarMissao(). Implemente a classe TimeMissaoRealizada que registra o nome do time e o nome da missão.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Time 7 realizou a missão: Derrotar Zabuza"
 */
public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Time: “Time 7”, Missão: “Derrotar Zabuza”
        TimeMissao time7 = new TimeMissaoRealizada("Time 7", "Derrotar Zabuza");
        
        time7.realizarMissao();
    }
    
}
