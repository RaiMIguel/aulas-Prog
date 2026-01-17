package exercicios.exercicios_algoritmosordenacao.mergesort;

public class Main {
    public static void main(String[] args) {

        Ninja[] konoha = {
                new Ninja("Naruto", "Konoha", 9000, "S"),
                new Ninja("Sasuke", "Konoha", 8500, "S"),
                new Ninja("Sakura", "Konoha", 7000, "A"),
                new Ninja("Kakashi", "Konoha", 8800, "S"),
                new Ninja("Rock Lee", "Konoha", 6000, "B"),
                new Ninja("Hinata", "Konoha", 6500, "A"),
                new Ninja("Shikamaru", "Konoha", 5500, "B"),
                new Ninja("Gai Sensei", "Konoha", 9500, "S"),
                new Ninja("Ino", "Konoha", 5000, "B"),
                new Ninja("Choji", "Konoha", 6200, "B")
        };

        RankingSystem system = new RankingSystem();

        //testando 100 ninjas ao mesmo tempo
        //Ninja[] konoha = new Ninja[100];
        //for (int i = 0; i < 100; i++) {
        //    int chakraAleatorio = (int) (Math.random() * 10000);
        //    konoha[i] = new Ninja("Ninja_" + i, "Vila", chakraAleatorio, "A");
        //}

        //RankingSystem system = new RankingSystem();

        System.out.println("=== [ORDENAÇÃO MERGE SORT] POR PODER (CRESCENTE) ===");
        system.orderByPower(konoha, 0, konoha.length - 1);

        for (Ninja n : konoha) {
            System.out.println(n);
        }
        system.showStatistics();

        System.out.println("\n=== [PODIUM] TOP 3 MAIS PODEROSOS ===");
        Ninja[] winners = system.listTop3(konoha);
        for (Ninja n : winners) {
            System.out.println(n);
        }

        System.out.println("\n=== [ORDENAÇÃO MERGE SORT] POR NOME (A-Z) ===");
        system.orderByName(konoha, 0, konoha.length - 1);

        for (Ninja n : konoha) {
            System.out.println(n);
        }
        system.showStatistics();
    }
}