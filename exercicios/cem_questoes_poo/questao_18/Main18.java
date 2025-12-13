package exercicios.cem_questoes_poo.questao_18;
/**
 * @param args
 *
 * questão: Hinata é uma ninja Hyuga com habilidades especiais. Crie a classe Ninja e uma subclasse NinjaHyuga com o atributo clan (String).
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 *
 * @return "Nome: Hinata / Idade: 16 / Clã: Hyuga"
 */
public class Main18 {
    public static void main(String[] args) {
        NinjaHyuga hinata = new NinjaHyuga("Hinata", 16, "Hyuga");
        
        System.out.println("Nome: " + hinata.getNome());
        System.out.println("Idade: " + hinata.getIdade());
        System.out.println("Clã: " + hinata.getClan());
    }
}