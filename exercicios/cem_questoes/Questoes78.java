import java.util.Map;
import java.util.TreeMap; // TreeMap mantém as chaves ordenadas

public class Questoes78 {
    public static void main(String[] args) {
        String texto = "Naruto Uzumaki";
        Map<Character, Integer> contagemLetras = new TreeMap<>();
        int totalLetras = 0;

        System.out.println("Texto: \"" + texto + "\"");
        System.out.println("\nContagem de letras (case-insensitive):");

        for (char caractere : texto.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char letra = Character.toUpperCase(caractere);
                contagemLetras.put(letra, contagemLetras.getOrDefault(letra, 0) + 1);
                totalLetras++;
            }
        }

        for (Map.Entry<Character, Integer> entry : contagemLetras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " vez" + (entry.getValue() > 1 ? "es" : ""));
        }

        System.out.println("\nTotal de letras: " + totalLetras);
    }
}