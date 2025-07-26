public class Questoes75 {
    public static void main(String[] args) {
        String textoOriginal = "naruto UZUMAKI";

        System.out.println("Texto original: \"" + textoOriginal + "\"");
        System.out.println("Maiúscula: \"" + textoOriginal.toUpperCase() + "\"");
        System.out.println("Minúscula: \"" + textoOriginal.toLowerCase() + "\"");

        // Capitalizar
        String[] palavras = textoOriginal.split(" ");
        StringBuilder textoCapitalizado = new StringBuilder();

        for (String palavra : palavras) {
            if (palavra.length() > 0) {
                textoCapitalizado.append(Character.toUpperCase(palavra.charAt(0)))
                                  .append(palavra.substring(1).toLowerCase())
                                  .append(" ");
            } else {
                textoCapitalizado.append(" "); // Mantém espaços múltiplos se houver
            }
        }
        System.out.println("Capitalizada: \"" + textoCapitalizado.toString().trim() + "\"");
    }
}