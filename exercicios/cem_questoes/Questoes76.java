public class Questoes76 {

    /**
     * @param args
     * Enunciado: Verifique se uma string contém determinadas substrings.
     *
     * Objetivos:
     * - Usar .contains()
     * - Fazer múltiplas verificações
     * - Ignorar case sensitivity
     */
    public static void main(String[] args) {
        String texto = "Konoha é a vila oculta da folha";
        String[] substrings = {"vila", "ninja", "folha"};
        
        System.out.println("Texto: \"" + texto + "\"");
        
        verificarSubstrings(texto, substrings);
    }

    /**
     * Verifica a presença de múltiplas substrings em um texto, ignorando o case.
     * @param texto O texto principal.
     * @param substrings As substrings a serem buscadas.
     */
    public static void verificarSubstrings(String texto, String[] substrings) {
        System.out.println("\nVerificando substrings:");
        String textoMinusculo = texto.toLowerCase();
        int encontradas = 0;
        
        for (String substring : substrings) {
            boolean encontrada = textoMinusculo.contains(substring.toLowerCase());
            System.out.println((encontrada ? "✓" : "✗") + " \"" + substring + "\" - " + (encontrada ? "Encontrada" : "Não encontrada"));
            if (encontrada) {
                encontradas++;
            }
        }
        
        System.out.println("\nResumo: " + encontradas + " de " + substrings.length + " substrings encontradas");
    }
}