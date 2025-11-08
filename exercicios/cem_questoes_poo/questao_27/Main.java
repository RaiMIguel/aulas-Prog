package exercicios.cem_questoes_poo.questao_27;
/**
 * @param args
 *
 * questão: Todo ninja pode atacar, mas cada um de forma diferente. Crie a classe abstrata Ninja com método abstrato atacar(). Implemente as subclasses Naruto e Sasuke.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (classe abstrata)
 *
 * @return "Naruto ataca com Rasengan! / Sasuke ataca com Chidori!"
 */
public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Naruto();
        Ninja sasuke = new Sasuke();
        
        naruto.atacar();
        sasuke.atacar();
    }
}
