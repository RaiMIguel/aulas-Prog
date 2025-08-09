import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questoes62 {

    /**
     * @param args
     * Enunciado: Crie um sistema de votação usando ArrayList.
     * Permita votar em candidatos e exiba resultados.
     *
     * Objetivos:
     * - Contar votos por candidato
     * - Calcular percentuais
     * - Determinar vencedor
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> candidatos = new ArrayList<>(Arrays.asList("João", "Maria", "Pedro"));
        int[] votos = new int[candidatos.size()];
        int totalVotos = 0;
        int voto;

        System.out.println("=== SISTEMA DE VOTAÇÃO ===");
        do {
            exibirMenuVotacao(candidatos);
            System.out.print("Voto: ");
            voto = scanner.nextInt();

            if (voto > 0 && voto <= candidatos.size()) {
                votos[voto - 1]++;
                totalVotos++;
            } else if (voto != 0) {
                System.out.println("Voto inválido!");
            }
        } while (voto != 0);

        exibirResultados(candidatos, votos, totalVotos);
        
        scanner.close();
    }

    /**
     * Exibe o menu de votação com a lista de candidatos.
     * @param candidatos A lista de candidatos.
     */
    public static void exibirMenuVotacao(ArrayList<String> candidatos) {
        System.out.println("Candidatos:");
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println((i + 1) + " - " + candidatos.get(i));
        }
        System.out.println("0 - Encerrar votação");
        System.out.println();
    }

    /**
     * Exibe os resultados finais da votação.
     * @param candidatos A lista de candidatos.
     * @param votos O array de contagem de votos.
     * @param totalVotos O número total de votos.
     */
    public static void exibirResultados(ArrayList<String> candidatos, int[] votos, int totalVotos) {
        System.out.println("\n=== RESULTADO DA VOTAÇÃO ===");
        
        double maiorPercentual = -1;
        String vencedor = "";
        boolean empate = false;

        for (int i = 0; i < candidatos.size(); i++) {
            double percentual = totalVotos > 0 ? (double) votos[i] / totalVotos * 100 : 0.0;
            System.out.printf("%s: %d voto(s) (%.2f%%)%n", candidatos.get(i), votos[i], percentual);
            
            if (percentual > maiorPercentual) {
                maiorPercentual = percentual;
                vencedor = candidatos.get(i);
                empate = false;
            } else if (percentual == maiorPercentual) {
                empate = true;
            }
        }

        System.out.println("\nTotal de votos: " + totalVotos);
        if (totalVotos == 0) {
            System.out.println("Vencedor: Não houve votos.");
        } else if (empate) {
            System.out.println("Vencedor: Empate!");
        } else {
            System.out.println("Vencedor: " + vencedor);
        }
    }
}