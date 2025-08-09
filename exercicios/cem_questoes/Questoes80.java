import java.text.Normalizer;

public class Questoes80 {

    /**
     * @param args
     * Enunciado: Verifique se uma string é um palíndromo.
     *
     * Objetivos:
     * - Implementar verificação de palíndromo
     * - Ignorar espaços, acentos e case
     * - Testar múltiplos casos
     */
    public static void main(String[] args) {
        String[] testes = {"arara", "A base do teto desaba", "Naruto"};
        
        for (int i = 0; i < testes.length; i++) {
            System.out.println("Teste " + (i + 1) + ": \"" + testes[i] + "\"");
            verificarPalindromo(testes[i]);
            System.out.println();
        }
    }

    /**
     * Verifica e exibe o resultado de uma verificação de palíndromo.
     * @param texto O texto a ser testado.
     */
    public static void verificarPalindromo(String texto) {
        String textoLimpo = Normalizer.normalize(texto, Normalizer.Form.NFD)
                                     .replaceAll("[^\\p{ASCII}]", "")
                                     .replaceAll("[^a-zA-Z]", "")
                                     .toLowerCase();
        
        String textoInvertido = new StringBuilder(textoLimpo).reverse().toString();
        
        System.out.println("Limpo: \"" + textoLimpo + "\"");
        System.out.println("Invertido: \"" + textoInvertido + "\"");
        
        if (textoLimpo.equals(textoInvertido)) {
            System.out.println("Resultado: É palíndromo ✓");
        } else {
            System.out.println("Resultado: NÃO é palíndromo ✗");
        }
    }
}