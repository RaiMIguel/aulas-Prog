package exercicios.cem_questoes_poo.questao_16;
/**
 * @param args
 *
 * questão: Crie a classe base Aldeia com atributos nome e lider. Implemente a subclasse AldeiaOculta, que possui o atributo simbolo (String).
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 *
 * @return "Aldeia: Kiri / Líder: Mizukage / Símbolo: Névoa"
 */
public class Main {
    public static void main(String[] args) {
        AldeiaOculta kiri = new AldeiaOculta("Kiri", "Mizukage", "Névoa");
        
        System.out.println("Aldeia: " + kiri.getNome());
        System.out.println("Líder: " + kiri.getLider());
        System.out.println("Símbolo: " + kiri.getSimbolo());
    }
}