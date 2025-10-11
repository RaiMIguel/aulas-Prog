package exercicios.cem_questoes_poo.questao_9;

public class Main {
    public static void main(String[] args) {
        MedicaNinja tsunade = new MedicaNinja("Tsunade", 10);
        System.out.println("Nome: " + tsunade.getNome());
        System.out.println("Nível Médico: " + tsunade.getNivelMedico());
    }
}