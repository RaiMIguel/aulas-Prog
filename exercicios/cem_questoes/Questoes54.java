import java.util.ArrayList;

public class Questoes54 {
    public static void main(String[] args) {
        ArrayList<String> ninjas = new ArrayList<>();
        
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Kakashi");
        ninjas.add("Hinata");

        System.out.println("=== LISTA DE NINJAS ===");
        for (int i = 0; i < ninjas.size(); i++) {
            System.out.println((i + 1) + ". " + ninjas.get(i));
        }
        System.out.println("\nTotal de ninjas: " + ninjas.size());
    }
}