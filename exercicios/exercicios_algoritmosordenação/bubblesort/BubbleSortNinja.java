package exercicios.exercicios_algoritmosordenação.bubblesort;

public class BubbleSortNinja {
    public static void main(String[] args) {
        Ninja[] konoha = {
                new Ninja("Naruto", "Konoha", 9000, "S"),
                new Ninja("Sasuke", "Konoha", 8500, "S"),
                new Ninja("Sakura", "Konoha", 7000, "A"),
                new Ninja("Kakashi", "Konoha", 8800, "S"),
                new Ninja("Rock Lee", "Konoha", 6000, "B"),
                new Ninja("Hinata", "Konoha", 6500, "A"),
                new Ninja("Shikamaru", "Konoha", 5500, "B")
        };

        RankingSystem sistema = new RankingSystem();

        System.out.println("=== NINJAS POR PODER (CRESCENTE) ===");
        sistema.orderByPower(konoha);
        for (Ninja n : konoha) System.out.println(n);
        sistema.showStatistics();

        System.out.println("\n=== TOP 3 MAIS PODEROSOS ===");
        Ninja[] top3 = sistema.listTop3(konoha);
        for (Ninja n : top3) System.out.println(n);

        System.out.println("\n=== NINJAS POR RANK (S -> D) ===");
        sistema.orderByRank(konoha);
        for (Ninja n : konoha) System.out.println(n);
    }
}
