package exercicios.exercicios_algoritmosordenacao.bubblesort;

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

        RankingSystem system = new RankingSystem();

        //testando 100 ninjas ao mesmo tempo
        //Ninja[] konoha = new Ninja[100];
        //for (int i = 0; i < 100; i++) {
        //    int chakraAleatorio = (int) (Math.random() * 10000);
        //    konoha[i] = new Ninja("Ninja_" + i, "Vila", chakraAleatorio, "A");
        //}

        //RankingSystem system = new RankingSystem();

        System.out.println("=== NINJAS POR PODER (CRESCENTE) ===");
        system.orderByPower(konoha);
        for (Ninja n : konoha) System.out.println(n);
        system.showStatistics();

        System.out.println("\n=== TOP 3 MAIS PODEROSOS ===");
        Ninja[] top3 = system.listTop3(konoha);
        for (Ninja n : top3) System.out.println(n);

        System.out.println("\n=== NINJAS POR RANK (S -> D) ===");
        system.orderByRank(konoha);
        for (Ninja n : konoha) System.out.println(n);
    }
}
