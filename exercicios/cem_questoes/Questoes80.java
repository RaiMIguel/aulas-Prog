public class Questoes80 {
    public static void main(String[] args) {
        String[] testes = {"arara", "A base do teto desaba", "Naruto", "Ovo"};

        for (int i = 0; i < testes.length; i++) {
            String textoOriginal = testes[i];
            System.out.println("\nTeste " + (i + 1) + ": \"" + textoOriginal + "\"");

            // 1. Limpar a string: remover espaços, pontuação, acentos e converter para minúsculas
            String textoLimpo = textoOriginal.toLowerCase()
                                             .replaceAll("[^a-z]", ""); // Remove tudo que não for letra de 'a' a 'z'

            // 2. Inverter a string limpa
            StringBuilder invertidoBuilder = new StringBuilder(textoLimpo);
            invertidoBuilder.reverse();
            String textoInvertido = invertidoBuilder.toString();

            System.out.println("Limpo: \"" + textoLimpo + "\"");
            System.out.println("Invertido: \"" + textoInvertido + "\"");

            // 3. Comparar
            if (textoLimpo.equals(textoInvertido)) {
                System.out.println("Resultado: É palíndromo ✓");
            } else {
                System.out.println("Resultado: NÃO é palíndromo ✗");
            }
        }
    }
}