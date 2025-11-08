package exercicios.cem_questoes_poo.questao_35;
/**
 * @param args
 *
 * questão: Os senseis podem ser avaliados por seus alunos. Crie a interface Avaliavel com o método avaliarSensei(). Implemente a classe SenseiAvaliado que recebe o nome do sensei e a nota dada pelo aluno.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Sensei Kakashi recebeu nota: 10"
 */
public class Main {
    public static void main(String[] args) {
        Avaliavel kakashi = new SenseiAvaliado("Kakashi", 10);
        
        kakashi.avaliarSensei();
    }
}    

