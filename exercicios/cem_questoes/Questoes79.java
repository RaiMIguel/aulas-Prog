public class Questoes79 {
    public static void main(String[] args) {
        String original = "   O    ninja   nunca    desiste   ";

        System.out.println("Texto original: \"" + original + "\"");

        int espacosInicioOriginal = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ') {
                espacosInicioOriginal++;
            } else {
                break;
            }
        }

        int espacosFimOriginal = 0;
        for (int i = original.length() - 1; i >= 0; i--) {
            if (original.charAt(i) == ' ') {
                espacosFimOriginal++;
            } else {
                break;
            }
        }

        String trimmed = original.trim(); // Remove espaços do início e fim
        
        String[] palavras = trimmed.split("\\s+"); // Divide por um ou mais espaços
        StringBuilder textoLimpoBuilder = new StringBuilder();
        int espacosExtrasInternos = 0;
        
        if (palavras.length > 0) {
            textoLimpoBuilder.append(palavras[0]);
            for (int i = 1; i < palavras.length; i++) {
                if (!palavras[i].isEmpty()) { // Garante que não adicione espaço se for string vazia
                    textoLimpoBuilder.append(" ").append(palavras[i]);
                }
            }
            // A contagem de espacosExtrasInternos é mais complexa, mas pode ser inferida:
            // (Total de espaços originais) - (Espaços início) - (Espaços fim) - (Espaços entre palavras finais)
            // Ou, de forma mais simples: total de espaços originais - total de espaços na string limpa
            int totalEspacosOriginal = 0;
            for(char c : original.toCharArray()) {
                if (c == ' ') totalEspacosOriginal++;
            }
            int totalEspacosLimpo = 0;
            for(char c : textoLimpoBuilder.toString().toCharArray()) {
                if (c == ' ') totalEspacosLimpo++;
            }
            espacosExtrasInternos = totalEspacosOriginal - espacosInicioOriginal - espacosFimOriginal - totalEspacosLimpo;

        }

        String textoLimpo = textoLimpoBuilder.toString();
        int totalEspacosRemovidos = espacosInicioOriginal + espacosFimOriginal + espacosExtrasInternos;

        System.out.println("Texto limpo: \"" + textoLimpo + "\"");
        System.out.println("\nRemoções:");
        System.out.println("- Espaços do início: " + espacosInicioOriginal);
        System.out.println("- Espaços do fim: " + espacosFimOriginal);
        System.out.println("- Espaços extras internos: " + espacosExtrasInternos);
        System.out.println("Total de espaços removidos: " + totalEspacosRemovidos);
    }
}