package exercicios.cem_questoes_poo.questao_20;
/**
 * @param args
 *
 * questão: Tsunade é uma médica ninja e Hokage. Crie a classe MedicaNinja com atributos comuns e a subclasse Hokage com o atributo mandato (int).
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 *
 * @return "Nome: Tsunade / Nível Médico: 10 / Mandato: 5"
 */
public class Main {
    public static void main(String[] args) {
        Hokage tsunade = new Hokage("Tsunade", 10, 5);
        
        System.out.println("Nome: " + tsunade.getNome());
        System.out.println("Nível Médico: " + tsunade.getNivelMedico());
        System.out.println("Mandato: " + tsunade.getMandato());
    }
}