package exercicios.cem_questoes_poo.questao_26;
/**
 * @param args
 *
 * questão: Todos os jutsus devem ser executáveis. Crie a interface Executavel com método executar(). Implemente a classe Jutsu e suas subclasses Rasengan e Chidori, que implementam a interface.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Executando Rasengan! / Executando Chidori!"
 */
public class Main {
    public static void main(String[] args) {
        Executavel rasengan = new Rasengan();
        Executavel chidori = new Chidori();
        
        rasengan.executar();
        chidori.executar();
    }
}