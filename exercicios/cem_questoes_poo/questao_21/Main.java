package exercicios.cem_questoes_poo.questao_21;
/**
 * @param args
 *
 * questão: Naruto, Sasuke e Sakura possuem diferentes estilos de ataque. Crie a classe base Ninja com o método atacar(). Implemente as subclasses Naruto, Sasuke e Sakura, cada uma sobrescrevendo atacar() para imprimir seu jutsu especial.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo (sobrescrita de métodos)
 *
 * @return "Naruto ataca com Rasengan! / Sasuke ataca com Chidori! / Sakura ataca com Soco Poderoso!"
 */
public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Naruto();
        Ninja sasuke = new Sasuke();
        Ninja sakura = new Sakura();
        
        naruto.atacar();
        sasuke.atacar();
        sakura.atacar();
    }
}