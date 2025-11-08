package exercicios.cem_questoes_poo.questao_24;
/**
 * @param args
 *
 * questão: Kakashi, Jiraiya e Orochimaru possuem diferentes estilos de ensino. Crie a classe base Sensei com o método ensinar(). Implemente as subclasses, cada uma sobrescrevendo o método.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 *
 * @return "Kakashi ensina com livros! / Jiraiya ensina viajando! / Orochimaru ensina experimentando!"
 */
public class Main {
    public static void main(String[] args) {
        Sensei kakashi = new Kakashi();
        Sensei jiraiya = new Jiraiya();
        Sensei orochimaru = new Orochimaru();
        
        kakashi.ensinar();
        jiraiya.ensinar();
        orochimaru.ensinar();
    }
}