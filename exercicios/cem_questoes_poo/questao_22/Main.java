package exercicios.cem_questoes_poo.questao_22;
/**
 * @param args
 *
 * questão: Crie a classe base Jutsu com o método executar(). Implemente as subclasses KageBunshin, Katon e Suiton, cada um executando seu jutsu de forma diferente.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 *
 * @return "Naruto executa Kage Bunshin! / Sasuke executa Katon! / Kakashi executa Suiton!"
 */
public class Main {
    public static void main(String[] args) {
        Jutsu jutsu1 = new KageBunshin();
        Jutsu jutsu2 = new Katon();
        Jutsu jutsu3 = new Suiton();

        jutsu1.executar();
        jutsu2.executar();
        jutsu3.executar();
    }
}
