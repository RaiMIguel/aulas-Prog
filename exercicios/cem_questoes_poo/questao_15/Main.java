package exercicios.cem_questoes_poo.questao_15;

public class Main {
    public static void main(String[] args) {
        SenseiJounin kakashi = new SenseiJounin("Kakashi", "Sharingan", "Naruto");
        
        System.out.println("Sensei: " + kakashi.getNome());
        System.out.println("Especialidade: " + kakashi.getEspecialidade());
        System.out.println("Aluno Favorito: " + kakashi.getAlunoFavorito());
    }
}