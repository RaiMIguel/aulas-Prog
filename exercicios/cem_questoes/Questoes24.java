import java.util.Scanner;

public class Questoes24 {

    /**
     * @param args
     * Enunciado: Verifique se um ano é bissexto. Um ano é bissexto se for divisível por 4,
     * exceto os anos divisíveis por 100, a menos que também sejam divisíveis por 400.
     *
     * Objetivos:
     * - Implementar lógica complexa
     * - Usar operadores lógicos
     * - Combinar múltiplas condições
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();
        
        String status = ehAnoBissexto(ano) ? "bissexto" : "não é bissexto";
        
        System.out.println("O ano " + ano + " é " + status + ".");
        
        scanner.close();
    }

    /**
     * Verifica se um ano é bissexto de acordo com as regras do calendário gregoriano.
     * @param ano O ano a ser verificado.
     * @return true se o ano for bissexto, false caso contrário.
     */
    public static boolean ehAnoBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }
}