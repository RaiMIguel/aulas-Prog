package exercicios.cem_questoes_poo.questao_28;
/**
 * @param args
 *
 * questão: Toda missão deve ser realizável. Crie a interface Realizavel com método realizar(). Implemente as classes MissaoD e MissaoS que realizam missões de diferentes níveis.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Realizando missão simples! / Realizando missão perigosa!"
 */
public class Main {
    public static void main(String[] args) {
        Realizavel missaoD = new MissaoD();
        Realizavel missaoS = new MissaoS();
        
        missaoD.realizar();
        missaoS.realizar();
    }
}