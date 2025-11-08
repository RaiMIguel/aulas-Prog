package exercicios.cem_questoes_poo.questao_23;
/**
 * @param args
 *
 * questão: Crie a classe base Missao com o método realizar(). Implemente as subclasses MissaoD e MissaoS, cada uma sobrescrevendo o método para imprimir sua dificuldade.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 *
 * @return "Missão D: Simples / Missão S: Perigosa!"
 */
public class Main {
    public static void main(String[] args) {
        Missao missaoD = new MissaoD();
        Missao missaoS = new MissaoS();
        
        missaoD.realizar();
        missaoS.realizar();
    }
}