import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Questoes83 {
    public static void main(String[] args) {
        String texto = "A programação em Java é muito interessante!";

        System.out.println("Texto: \"" + texto + "\"");
        System.out.println("Total de caracteres: " + texto.length());

        Map<Character, Integer> letrasFrequencia = new HashMap<>();
        int totalLetras = 0;
        int totalEspacos = 0;
        int totalNumeros = 0;
        int totalPontuacao = 0;
        int totalOutros = 0;

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char letraUpper = Character.toUpperCase(c);
                letrasFrequencia.put(letraUpper, letrasFrequencia.getOrDefault(letraUpper, 0) + 1);
                totalLetras++;
            } else if (Character.isDigit(c)) {
                totalNumeros++;
            } else if (Character.isWhitespace(c)) {
                totalEspacos++;
            } else if (String.valueOf(c).matches("[.,!?;:]")) { // Caracteres de pontuação comuns
                totalPontuacao++;
            } else {
                totalOutros++;
            }
        }

        // Ordenar letras por frequência (decrescente) e depois alfabeticamente
        Map<Character, Integer> letrasOrdenadas = letrasFrequencia.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // Merge function for duplicate keys (not expected with unique chars)
                        LinkedHashMap::new // Preserve insertion order for sorting
                ));

        System.out.println("\n=== ANÁLISE DE FREQUÊNCIA ===");

        System.out.printf("\nLETRAS (%d - %.2f%%):%n", totalLetras, (double) totalLetras / texto.length() * 100);
        for (Map.Entry<Character, Integer> entry : letrasOrdenadas.entrySet()) {
            System.out.printf("%C: %d (%.2f%%)  ", entry.getKey(), entry.getValue(), (double) entry.getValue() / texto.length() * 100);
        }
        System.out.println(); // Nova linha após as letras

        System.out.printf("\nESPAÇOS: %d (%.2f%%)%n", totalEspacos, (double) totalEspacos / texto.length() * 100);
        System.out.printf("PONTUAÇÃO: %d (%.2f%%)%n", totalPontuacao, (double) totalPontuacao / texto.length() * 100);
        System.out.printf("NÚMEROS: %d (%.2f%%)%n", totalNumeros, (double) totalNumeros / texto.length() * 100);
        System.out.printf("OUTROS: %d (%.2f%%)%n", totalOutros, (double) totalOutros / texto.length() * 100);

        // Caractere mais frequente (entre letras)
        char caractereMaisFrequente = ' ';
        int maxFreqGeral = -1;
        
        // Percorre todas as categorias para encontrar o mais frequente geral
        if (!letrasFrequencia.isEmpty()) {
            for (Map.Entry<Character, Integer> entry : letrasFrequencia.entrySet()) {
                if (entry.getValue() > maxFreqGeral) {
                    maxFreqGeral = entry.getValue();
                    caractereMaisFrequente = entry.getKey();
                }
            }
        }
        
        // Verifica se algum outro tipo de caractere é mais frequente
        if (totalEspacos > maxFreqGeral) {
             maxFreqGeral = totalEspacos;
             caractereMaisFrequente = ' ';
        }
        // ... pode adicionar lógica similar para números, pontuação, outros, se quiser que eles sejam "o mais frequente"

        System.out.printf("\nCaractere mais frequente: %C (%d ocorrências)%n", caractereMaisFrequente, maxFreqGeral);
    }
}