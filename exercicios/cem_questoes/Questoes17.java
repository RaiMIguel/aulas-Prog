import java.util.Scanner;

public class Questoes17 {

    /**
     * @param args
     *             Enunciado: Use Scanner para ler uma frase completa e exiba
     *             quantas
     *             palavras ela contém.
     *
     *             Objetivos:
     *             - Ler linha completa
     *             - Manipular strings básico
     *             - Contar elementos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int numeroDePalavras = contarPalavras(frase);

        System.out.println("Frase digitada: \"" + frase + "\"");
        System.out.println("Número de palavras: " + numeroDePalavras);

        scanner.close();
    }

    /**
     * Conta o número de palavras em uma frase.
     * 
     * @param frase A frase a ser analisada.
     * @return O número de palavras na frase.
     */
    public static int contarPalavras(String frase) {
        String[] palavras = frase.trim().split("\\s+");
        return frase.trim().isEmpty() ? 0 : palavras.length;
    }

   public static int contarPalavrasSemSplit(String frase) {
    // (dicas do naruto) Validação de entrada
    if (frase == null || frase.length() == 0) {
        return 0;
    }
    
    int contador = 0;
    boolean dentroDeUmaPalavra = false;
    
    // (dicas do naruto) Percorre cada caractere da string
    for (int i = 0; i < frase.length(); i++) {
        char caractereAtual = frase.charAt(i);
        
        // (dicas do naruto) Se não é espaço (é uma letra/número/símbolo)
        if (caractereAtual != ' ') {
            // (dicas do naruto) Se não estava em uma palavra, começou uma nova
            if (!dentroDeUmaPalavra) {
                contador++;
                dentroDeUmaPalavra = true;
            }
        } 
        // (dicas do naruto) Se é espaço, saiu da palavra
        else {
            dentroDeUmaPalavra = false;
        }
    }
    
    return contador; // (dicas do naruto) AGORA SIM retorna a contagem real!
}
}