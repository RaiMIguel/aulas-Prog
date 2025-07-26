import java.util.ArrayList;

public class Questoes92 {

    // Método principal para validar o cartão de crédito
    public static boolean validarCartaoCredito(String numeroCartao) {
        System.out.println("\nTestando: " + numeroCartao);

        // 1. Validar comprimento
        if (numeroCartao.length() < 13 || numeroCartao.length() > 19) {
            System.out.println("Comprimento: " + numeroCartao.length() + " dígitos ✗ (esperado 13-19)");
            System.out.println("Resultado: CARTÃO INVÁLIDO");
            return false;
        } else {
            System.out.println("Comprimento: " + numeroCartao.length() + " dígitos ✓");
        }

        // 2. Validar se é composto apenas por dígitos
        if (!ehNumero(numeroCartao)) {
            System.out.println("Erro: O número do cartão contém caracteres não numéricos.");
            System.out.println("Resultado: CARTÃO INVÁLIDO");
            return false;
        }

        // 3. Identificar o tipo do cartão
        identificarTipoCartao(numeroCartao);

        // 4. Aplicar Algoritmo de Luhn
        return aplicarLuhn(numeroCartao);
    }

    // Verifica se a string contém apenas dígitos
    private static boolean ehNumero(String str) {
        return str.matches("\\d+");
    }

    // Identifica e imprime o tipo do cartão
    private static void identificarTipoCartao(String numeroCartao) {
        if (numeroCartao.startsWith("4")) {
            System.out.println("Tipo: Visa (inicia com 4)");
        } else if (numeroCartao.startsWith("5")) {
            System.out.println("Tipo: Mastercard (inicia com 5)");
        } else if (numeroCartao.startsWith("34") || numeroCartao.startsWith("37")) {
            System.out.println("Tipo: Amex (inicia com 34 ou 37)");
        } else {
            System.out.println("Tipo: Desconhecido");
        }
    }

    // Implementa o Algoritmo de Luhn
    private static boolean aplicarLuhn(String numeroCartao) {
        System.out.println("\nAlgoritmo de Luhn:");
        int somaTotal = 0;
        StringBuilder posicoesImparesStr = new StringBuilder();
        StringBuilder posicoesParesDobroStr = new StringBuilder();
        ArrayList<Integer> posicoesParesDobroValores = new ArrayList<>();

        boolean isSegundoDigito = false; // Começa da direita para a esquerda, o último dígito é o primeiro
        for (int i = numeroCartao.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(numeroCartao.charAt(i));

            if (isSegundoDigito) {
                int dobrado = digito * 2;
                posicoesParesDobroStr.append("(").append(digito).append("×2)");
                if (dobrado > 9) {
                    dobrado = dobrado - 9;
                    posicoesParesDobroStr.append(" (").append(dobrado).append(")");
                }
                posicoesParesDobroValores.add(dobrado);
                somaTotal += dobrado;
                posicoesParesDobroStr.append(" + ");
            } else {
                somaTotal += digito;
                posicoesImparesStr.append(digito).append("+");
            }
            isSegundoDigito = !isSegundoDigito;
        }

        // Remover o último "+" ou " + "
        if (posicoesImparesStr.length() > 0) {
            posicoesImparesStr.setLength(posicoesImparesStr.length() - 1);
        }
        if (posicoesParesDobroStr.length() > 0) {
             posicoesParesDobroStr.setLength(posicoesParesDobroStr.length() - 3); // Remove " + "
        }


        System.out.println("Posições ímpares (direita para esquerda): " + posicoesImparesStr.toString());
        System.out.println("Posições pares dobradas: " + posicoesParesDobroStr.toString());

        int somaParesAjustada = 0;
        for(int val : posicoesParesDobroValores){
            somaParesAjustada += val;
        }
        System.out.println("Soma dos dígitos em posições pares dobradas (ajustado): " + somaParesAjustada);


        System.out.println("Soma total: " + somaTotal);
        int modulo10 = somaTotal % 10;
        System.out.println(somaTotal + " % 10 = " + modulo10 + " " + (modulo10 == 0 ? "== 0" : "≠ 0"));

        if (modulo10 == 0) {
            System.out.println("Resultado: CARTÃO VÁLIDO");
            return true;
        } else {
            System.out.println("Resultado: CARTÃO INVÁLIDO");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== VALIDADOR DE CARTÃO DE CRÉDITO ===");

        // Testes
        validarCartaoCredito("4532015112830366"); // Visa válido de exemplo
        validarCartaoCredito("1234567890123456"); // Inválido
        validarCartaoCredito("378282246310005");  // Amex válido de exemplo
        validarCartaoCredito("5400000000000000"); // Mastercard de teste (válido)
    }
}