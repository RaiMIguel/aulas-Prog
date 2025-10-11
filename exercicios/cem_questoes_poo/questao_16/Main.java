package exercicios.cem_questoes_poo.questao_16;

public class Main {
    public static void main(String[] args) {
        AldeiaOculta kiri = new AldeiaOculta("Kiri", "Mizukage", "Névoa");
        
        System.out.println("Aldeia: " + kiri.getNome());
        System.out.println("Líder: " + kiri.getLider());
        System.out.println("Símbolo: " + kiri.getSimbolo());
    }
}