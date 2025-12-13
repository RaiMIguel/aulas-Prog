public class Questoes74 {

    /**
     * @param args
     * Enunciado: Conte o número de caracteres, palavras e linhas em uma string.
     *
     * Objetivos:
     * - Usar métodos da classe String
     * - Contar diferentes unidades
     * - Trabalhar com quebras de linha
     */
    public static void main(String[] args) {
        String texto = "O ninja nunca desiste.\nEle sempre encontra um caminho.";
        
        System.out.println("Texto:\n\"" + texto + "\"");
        
        analisarTexto(texto);
    }

    /**
     * Analisa e exibe estatísticas de um texto.
     * @param texto A string a ser analisada.
     */
    public static void analisarTexto(String texto) {
        int caracteresComEspaco = texto.length();
        int caracteresSemEspaco = texto.replace(" ", "").length();
        
        String[] palavras = texto.split("\\s+");
        int numPalavras = palavras.length;
        
        String[] linhas = texto.split("\n");
        int numLinhas = linhas.length;
        
        System.out.println("\nEstatísticas:");
        System.out.println("Caracteres: " + caracteresComEspaco);
        System.out.println("Caracteres (sem espaços): " + caracteresSemEspaco);
        System.out.println("Palavras: " + numPalavras);
        System.out.println("Linhas: " + numLinhas);
    }
}