package exercicios.cem_questoes_poo.questao_5;

public class Main {
    public static void main(String[] args) {
        Aldeia konoha = new Aldeia("Konoha", "Hokage");
        System.out.println("Aldeia: " + konoha.getNome());
        System.out.println("Líder: " + konoha.getLider());
    }
}