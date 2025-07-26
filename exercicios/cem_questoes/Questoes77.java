public class Questoes77 {
    public static void main(String[] args) {
        String original = "Sasuke Uchiha";
        StringBuilder invertida = new StringBuilder();

        System.out.println("String original: \"" + original + "\"");
        System.out.println("Processo:");

        for (int i = original.length() - 1; i >= 0; i--) {
            char charAtual = original.charAt(i);
            invertida.append(charAtual);
            // Mostrar processo
            if (i == original.length() - 1) {
                System.out.println(original.charAt(original.length() - 1) + " → " + invertida.charAt(0));
            } else if (i == original.length() - 2) {
                 System.out.println(original.charAt(original.length() - 2) + " → " + invertida.charAt(1));
            } else if (i == 0) {
                 System.out.println("... " + original.charAt(0) + " → " + invertida.charAt(invertida.length() -1));
            }
        }
        System.out.println("String invertida: \"" + invertida.toString() + "\"");
    }
}