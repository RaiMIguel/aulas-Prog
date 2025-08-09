public class Questoes92 {

    /**
     * @param args
     * Enunciado: Implemente um método que valide número de cartão de crédito
     * usando o algoritmo de Luhn.
     */
    public static void main(String[] args) {
        String[] cartoes = {"4532015112830366", "1234567890123456"};
        
        System.out.println("=== VALIDADOR DE CARTÃO DE CRÉDITO ===");
        
        for (String cartao : cartoes) {
            System.out.println("\nTestando: " + cartao);
            validarCartao(cartao);
        }
    }

    /**
     * Valida um número de cartão de crédito.
     * @param numero O número do cartão como uma String.
     */
    public static void validarCartao(String numero) {
        if (!ehNumero(numero)) {
            System.out.println("Erro: O número do cartão contém caracteres não numéricos.");
            return;
        }

        System.out.println("Tipo: " + identificarTipo(numero));
        System.out.println("Comprimento: " + numero.length() + " dígitos " + ((numero.length() >= 13 && numero.length() <= 19) ? "✓" : "✗"));
        
        if (ehValidoLuhn(numero)) {
            System.out.println("\nResultado: CARTÃO VÁLIDO");
        } else {
            System.out.println("\nResultado: CARTÃO INVÁLIDO");
        }
    }

    /**
     * Implementa o algoritmo de Luhn para validação.
     * @param numero O número do cartão.
     * @return true se a soma for um múltiplo de 10, false caso contrário.
     */
    public static boolean ehValidoLuhn(String numero) {
        System.out.println("\nAlgoritmo de Luhn:");
        int soma = 0;
        boolean par = false;
        
        StringBuilder impares = new StringBuilder("Posições ímpares (direita para esquerda): ");
        StringBuilder pares = new StringBuilder("Posições pares dobradas: ");
        StringBuilder paresAjustados = new StringBuilder();
        
        for (int i = numero.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numero.charAt(i));
            
            if (par) {
                pares.append("(" + digito + "×2) + ");
                digito *= 2;
                if (digito > 9) {
                    paresAjustados.append(digito + " - 9 = " + (digito-9) + ", ");
                    digito -= 9;
                }
            } else {
                impares.append(digito + "+");
            }
            soma += digito;
            par = !par;
        }
        
        System.out.println(impares.deleteCharAt(impares.length()-1));
        System.out.println(pares.delete(pares.length()-3, pares.length()));
        System.out.println("Ajustando dígitos > 9: " + paresAjustados);
        
        System.out.println("\nSoma total: " + soma);
        System.out.println(soma + " % 10 = " + (soma % 10) + " " + ((soma % 10 != 0) ? "≠ 0" : "== 0"));

        return (soma % 10 == 0);
    }
    
    /**
     * Identifica o tipo do cartão de crédito com base no primeiro dígito.
     * @param numero O número do cartão.
     * @return O tipo do cartão.
     */
    public static String identificarTipo(String numero) {
        if (numero.startsWith("4")) return "Visa (inicia com 4)";
        if (numero.startsWith("5")) return "Mastercard (inicia com 5)";
        if (numero.startsWith("34") || numero.startsWith("37")) return "Amex (inicia com 34/37)";
        return "Desconhecido";
    }

    /**
     * Verifica se uma string contém apenas dígitos.
     * @param str A string a ser verificada.
     * @return true se a string for um número, false caso contrário.
     */
    public static boolean ehNumero(String str) {
        return str.matches("\\d+");
    }
}