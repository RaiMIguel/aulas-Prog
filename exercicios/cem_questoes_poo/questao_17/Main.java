package exercicios.cem_questoes_poo.questao_17;

public class Main {
    public static void main(String[] args) {
        Kazekage gaara = new Kazekage("Gaara", 18, 3);
        
        System.out.println("Nome: " + gaara.getNome());
        System.out.println("Idade: " + gaara.getIdade());
        System.out.println("Tempo de Mandato: " + gaara.getTempoMandato());
    }
}