package exercicios.cem_questoes_poo.questao_3;

public class Main {
    public static void main(String[] args) {
        Missao rankD = new Missao("Buscar ervas medicinais", 'D');
        System.out.println("Missão: " + rankD.getDescricao());
        System.out.println("Rank: " + rankD.getRank());
    }
}
