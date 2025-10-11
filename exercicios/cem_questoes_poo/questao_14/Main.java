package exercicios.cem_questoes_poo.questao_14;

public class Main {
    public static void main(String[] args) {
        MissaoMedica missaoSakura = new MissaoMedica("Salvar aldeia", 'A', 9);
        
        System.out.println("Missão: " + missaoSakura.getDescricao());
        System.out.println("Rank: " + missaoSakura.getRank());
        System.out.println("Nível de Dificuldade: " + missaoSakura.getNivelDificuldade());
    }
}