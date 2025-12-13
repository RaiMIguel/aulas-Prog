package exercicios.cem_questoes_poo.questao_29;
/**
 * @param args
 *
 * questão: Todos os senseis devem treinar os ninjas. Crie a interface Treinavel com método treinar(). Implemente as classes Kakashi e Jiraiya.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Kakashi treina com Sharingan! / Jiraiya treina com invocação!"
 */
public class Main {
    public static void main(String[] args) {
        Treinavel kakashi = new Kakashi();
        Treinavel jiraiya = new Jiraiya();
        
        kakashi.treinar();
        jiraiya.treinar();
    }
}