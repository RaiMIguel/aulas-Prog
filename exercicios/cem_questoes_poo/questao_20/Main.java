package exercicios.cem_questoes_poo.questao_20;

public class Main {
    public static void main(String[] args) {
        Hokage tsunade = new Hokage("Tsunade", 10, 5);
        
        System.out.println("Nome: " + tsunade.getNome());
        System.out.println("Nível Médico: " + tsunade.getNivelMedico());
        System.out.println("Mandato: " + tsunade.getMandato());
    }
}