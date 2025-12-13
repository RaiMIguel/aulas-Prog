public class Questoes77 {

    /**
     * @param args
     * Enunciado: Inverta uma string sem usar métodos prontos como .reverse().
     *
     * Objetivos:
     * - Implementar inversão manual
     * - Usar laços e manipulação de caracteres
     * - Trabalhar com índices
     */
    public static void main(String[] args) {
        String texto = "Sasuke Uchiha";
        
        System.out.println("String original: \"" + texto + "\"");
        String invertido = inverterString(texto);
        System.out.println("String invertida: \"" + invertido + "\"");
    }

    /**
     * Inverte uma string manualmente, mostrando parte do processo.
     * @param texto A string a ser invertida.
     * @return A string invertida.
     */
    public static String inverterString(String texto) {
        StringBuilder invertido = new StringBuilder();
        System.out.println("\nProcesso:");
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido.append(texto.charAt(i));
            // Mostra o processo para os 3 primeiros e 3 últimos caracteres
            if (i >= texto.length() - 3 || i < 3) {
                System.out.println(texto.charAt(texto.length() - 1 - i) + " → " + texto.charAt(i));
            } else if (i == texto.length() - 4) {
                 System.out.println("...");
            }
        }
        return invertido.toString();
    }
}