public class Questoes76 {
    public static void main(String[] args) {
        String texto = "Konoha é a vila oculta da folha";
        String[] buscas = {"vila", "ninja", "folha"};

        System.out.println("Texto: \"" + texto + "\"");
        System.out.println("\nVerificando substrings:");

        int encontradas = 0;
        String textoLower = texto.toLowerCase();

        for (String busca : buscas) {
            String buscaLower = busca.toLowerCase();
            if (textoLower.contains(buscaLower)) {
                System.out.println("✓ \"" + busca + "\" - Encontrada");
                encontradas++;
            } else {
                System.out.println("✗ \"" + busca + "\" - Não encontrada");
            }
        }

        System.out.println("\nResumo: " + encontradas + " de " + buscas.length + " substrings encontradas");
    }
}