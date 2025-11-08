package exercicios.cem_questoes_poo.questao_17;
/**
 * @param args
 *
 * questão: Gaara é Kazekage e também ninja especial. Crie uma classe Ninja e uma subclasse Kazekage que adiciona o atributo tempoMandato (int).
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 *
 * @return "Nome: Gaara / Idade: 18 / Tempo de Mandato: 3"
 */
public class Main {
    public static void main(String[] args) {
        Kazekage gaara = new Kazekage("Gaara", 18, 3);
        
        System.out.println("Nome: " + gaara.getNome());
        System.out.println("Idade: " + gaara.getIdade());
        System.out.println("Tempo de Mandato: " + gaara.getTempoMandato());
    }
}