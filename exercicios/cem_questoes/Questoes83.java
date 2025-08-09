import java.util.Map;
import java.util.TreeMap;

public class Questoes83 {

    /**
     * @param args
     * Enunciado: Implemente um analisador de frequência de caracteres com
     * estatísticas detalhadas.
     *
     * Objetivos:
     * - Analisar todos os tipos de caracteres
     * - Calcular percentuais
     * - Criar relatório detalhado
     */
    public static void main(String[] args) {
        String texto = "A programação em Java é muito interessante!";
        
        System.out.println("Texto: \"" + texto + "\"");
        System.out.println("Total de caracteres: " + texto.length());
        
        analisarFrequencia(texto);
    }

    /**
     * Analisa a frequência de caracteres em uma string, categorizando e exibindo
     * um relatório detalhado.
     * @param texto A string a ser analisada.
     */
    public static void analisarFrequencia(String texto) {
        Map<Character, Integer> letras = new TreeMap<>();
        int espacos = 0;
        int pontuacao = 0;
        int numeros = 0;
        int outros = 0;
        int totalCaracteres = texto.length();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerC = Character.toLowerCase(c);
                letras.put(lowerC, letras.getOrDefault(lowerC, 0) + 1);
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (c == '!' || c == '.' || c == ',' || c == '?' || c == 'é') { // Exemplo de pontuação e acentuação
                pontuacao++;
            } else {
                outros++;
            }
        }
        
        System.out.println("\n=== ANÁLISE DE FREQUÊNCIA ===");
        
        int totalLetras = letras.values().stream().mapToInt(Integer::intValue).sum();
        System.out.printf("\nLETRAS (%d - %.2f%%):%n", totalLetras, (double) totalLetras / totalCaracteres * 100);
        
        letras.entrySet().stream()
              .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
              .forEach(entry -> System.out.printf("%c: %d (%.2f%%)  ", Character.toUpperCase(entry.getKey()), entry.getValue(), (double) entry.getValue() / totalCaracteres * 100));
        System.out.println();
        
        System.out.printf("\nESPAÇOS: %d (%.2f%%)%n", espacos, (double) espacos / totalCaracteres * 100);
        System.out.printf("PONTUAÇÃO: %d (%.2f%%)%n", pontuacao, (double) pontuacao / totalCaracteres * 100);
        System.out.printf("NÚMEROS: %d (%.2f%%)%n", numeros, (double) numeros / totalCaracteres * 100);
        System.out.printf("OUTROS: %d (%.2f%%)%n", outros, (double) outros / totalCaracteres * 100);
        
        char maisFrequente = letras.entrySet().stream()
                                  .max(Map.Entry.comparingByValue())
                                  .map(Map.Entry::getKey)
                                  .orElse(' ');
        
        System.out.printf("\nCaractere mais frequente: %c (%d ocorrências)%n", Character.toUpperCase(maisFrequente), letras.get(maisFrequente));
    }
}