package exercicios.cem_questoes_poo.questao_8;

public class Main {
    public static void main(String[] args) {
        Estrategista shikamaru = new Estrategista("Shikamaru Nara", 10);
        System.out.println("Nome: " + shikamaru.getNome());
        System.out.println("Nível de Estratégia: " + shikamaru.getNivelEstrategia());
    }
}