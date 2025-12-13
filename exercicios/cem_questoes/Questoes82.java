import java.util.regex.Pattern;

public class Questoes82 {

    /**
     * @param args
     * Enunciado: Conte quantas palavras existem em uma frase,
     * considerando diferentes separadores.
     *
     * Objetivos:
     * - Identificar separadores de palavras
     * - Extrair palavras válidas
     * - Ignorar separadores múltiplos
     */
    public static void main(String[] args) {
        String texto = "Olá,mundo!Como;você:está?Bem...";
        
        System.out.println("Texto: \"" + texto + "\"");
        
        contarPalavras(texto);
    }

    /**
     * Extrai e conta palavras de uma string, lidando com múltiplos separadores.
     * @param texto A string a ser analisada.
     */
    public static void contarPalavras(String texto) {
        String separadores = ",!;?:.";
        
        System.out.println("\nSeparadores encontrados: " + separadores);

        String[] palavras = texto.split("[\\s" + Pattern.quote(separadores) + "]+");
        
        System.out.println("Palavras extraídas:");
        int contador = 1;
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                System.out.println(contador + ". \"" + palavra + "\"");
                contador++;
            }
        }
        
        System.out.println("\nTotal de palavras: " + (contador - 1));
    }
}