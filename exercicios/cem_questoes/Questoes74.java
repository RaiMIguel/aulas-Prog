public class Questoes74 {
    public static void main(String[] args) {
        String texto = "O ninja nunca desiste.\nEle sempre encontra um caminho.";

        System.out.println("Texto:\n\"" + texto + "\"");

        int numCaracteres = texto.length();
        int numCaracteresSemEspacos = 0;
        for (char c : texto.toCharArray()) {
            if (c != ' ' && c != '\n' && c != '\r') {
                numCaracteresSemEspacos++;
            }
        }
        
        String[] palavras = texto.split("\\s+"); // Divide por um ou mais espaços/quebras de linha
        int numPalavras = 0;
        for (String palavra : palavras) {
            if (!palavra.trim().isEmpty()) { // Conta apenas palavras não vazias
                numPalavras++;
            }
        }

        String[] linhas = texto.split("\n");
        int numLinhas = linhas.length;

        System.out.println("\nEstatísticas:");
        System.out.println("Caracteres: " + numCaracteres);
        System.out.println("Caracteres (sem espaços): " + numCaracteresSemEspacos);
        System.out.println("Palavras: " + numPalavras);
        System.out.println("Linhas: " + numLinhas);
    }
}