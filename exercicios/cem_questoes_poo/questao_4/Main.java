package exercicios.cem_questoes_poo.questao_4;

public class Main {
    public static void main(String[] args) {
        Sensei kakashi = new Sensei("Kakashi Hatake", "Sharingan");
        System.out.println("Sensei: " + kakashi.getNome());
        System.out.println("Especialidade: " + kakashi.getEspecialidade());
    }
}