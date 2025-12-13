public class Questoes75 {

    /**
     * @param args
     * Enunciado: Converta uma string para maiúscula, minúscula e capitalize.
     *
     * Objetivos:
     * - Usar métodos de conversão
     * - Implementar capitalize customizado
     * - Manipular caracteres
     */
    public static void main(String[] args) {
        String texto = "naruto UZUMAKI";
        
        System.out.println("Texto original: \"" + texto + "\"");
        System.out.println("Maiúscula: \"" + texto.toUpperCase() + "\"");
        System.out.println("Minúscula: \"" + texto.toLowerCase() + "\"");
        
        String capitalizada = capitalizarString(texto);
        System.out.println("Capitalizada: \"" + capitalizada + "\"");
    }

    /**
     * Capitaliza a primeira letra de cada palavra em uma string.
     * @param texto A string a ser capitalizada.
     * @return A string com a primeira letra de cada palavra em maiúscula.
     */
    public static String capitalizarString(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        
        String[] palavras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                resultado.append(Character.toUpperCase(palavra.charAt(0)))
                         .append(palavra.substring(1).toLowerCase())
                         .append(" ");
            }
        }
        
        return resultado.toString().trim();
    }
}