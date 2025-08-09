import java.util.Map;
import java.util.TreeMap;

public class Questoes78 {

    /**
     * @param args
     * Enunciado: Conte quantas vezes cada letra aparece em uma string.
     *
     * Objetivos:
     * - Contar frequência de caracteres
     * - Ignorar não-letras
     * - Organizar resultado
     */
    public static void main(String[] args) {
        String texto = "Naruto Uzumaki";
        
        System.out.println("Texto: \"" + texto + "\"");
        
        contarLetras(texto);
    }

    /**
     * Conta a frequência de cada letra em uma string e exibe o resultado ordenado.
     * @param texto A string a ser analisada.
     */
    public static void contarLetras(String texto) {
        TreeMap<Character, Integer> frequencias = new TreeMap<>();
        int totalLetras = 0;
        
        String textoLimpo = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        for (char letra : textoLimpo.toCharArray()) {
            frequencias.put(letra, frequencias.getOrDefault(letra, 0) + 1);
            totalLetras++;
        }

        System.out.println("\nContagem de letras (case-insensitive):");
        for (Map.Entry<Character, Integer> entry : frequencias.entrySet()) {
            System.out.println(Character.toUpperCase(entry.getKey()) + ": " + entry.getValue() + " vez" + (entry.getValue() > 1 ? "es" : ""));
        }
        
        System.out.println("\nTotal de letras: " + totalLetras);
    }
}