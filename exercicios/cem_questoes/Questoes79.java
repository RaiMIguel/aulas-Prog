public class Questoes79 {

    /**
     * @param args
     * Enunciado: Remova espaços em branco extras de uma string.
     *
     * Objetivos:
     * - Limpar espaços desnecessários
     * - Manter um espaço entre palavras
     * - Implementar trim customizado
     */
    public static void main(String[] args) {
        String texto = "   O    ninja   nunca    desiste   ";
        
        System.out.println("Texto original: \"" + texto + "\"");
        
        removerEspacos(texto);
    }

    /**
     * Remove espaços extras de uma string e exibe a quantidade removida.
     * @param texto A string a ser limpa.
     */
    public static void removerEspacos(String texto) {
        int originalLength = texto.length();
        
        String textoTrimado = texto.trim();
        int espacosInicioFim = originalLength - textoTrimado.length();
        
        String textoLimpo = textoTrimado.replaceAll(" +", " ");
        int espacosExtrasInternos = textoTrimado.length() - textoLimpo.length();
        
        System.out.println("Texto limpo: \"" + textoLimpo + "\"");
        System.out.println("\nRemoções:");
        System.out.println("- Espaços do início: " + texto.substring(0, texto.indexOf(texto.trim().charAt(0))).length());
        System.out.println("- Espaços do fim: " + (originalLength - texto.trim().length() - texto.indexOf(texto.trim().charAt(0))));
        System.out.println("- Espaços extras internos: " + (textoTrimado.length() - textoLimpo.length()));
        System.out.println("Total de espaços removidos: " + (espacosInicioFim + espacosExtrasInternos));
    }
}