package exercicios.cem_questoes_poo.questao_12;

public class Main {
    public static void main(String[] args) {

        NinjaUchiha sasuke = new NinjaUchiha("Sasuke", 16, "Sharingan");
        
        System.out.println("Nome: " + sasuke.getNome());
        System.out.println("Idade: " + sasuke.getIdade());
        System.out.println("Poder Kekkei Genkai: " + sasuke.getPoderKekkeiGenkai());
    }
}