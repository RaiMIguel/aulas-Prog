import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questoes62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> candidatos = new ArrayList<>(Arrays.asList("João", "Maria", "Pedro"));
        Map<String, Integer> votos = new HashMap<>(); 
        for (String candidato : candidatos) {
            votos.put(candidato, 0);
        }

        int totalVotos = 0;
        int votoEntrada;

        System.out.println("=== SISTEMA DE VOTAÇÃO ===");
        do {
            System.out.println("\nCandidatos:");
            for (int i = 0; i < candidatos.size(); i++) {
                System.out.println((i + 1) + " - " + candidatos.get(i));
            }
            System.out.println("0 - Encerrar votação");
            System.out.print("Voto: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                System.out.print("Voto: ");
                scanner.next();
            }
            votoEntrada = scanner.nextInt();

            if (votoEntrada >= 1 && votoEntrada <= candidatos.size()) {
                String candidatoVotado = candidatos.get(votoEntrada - 1);
                votos.put(candidatoVotado, votos.get(candidatoVotado) + 1); 
                totalVotos++;
            } else if (votoEntrada != 0) {
                System.out.println("Opção inválida. Digite um número de candidato ou 0 para sair.");
            }

        } while (votoEntrada != 0);

        System.out.println("\n=== RESULTADO DA VOTAÇÃO ===");

        int maiorNumeroDeVotos = -1; 
        ArrayList<String> vencedores = new ArrayList<>();
        for (String candidato : candidatos) {
            int votosDoCandidato = votos.get(candidato);
            double percentual = (totalVotos > 0) ? ((double) votosDoCandidato / totalVotos) * 100 : 0.0;
            System.out.printf("%s: %d votos (%.2f%%)%n", candidato, votosDoCandidato, percentual);

           
            if (votosDoCandidato > maiorNumeroDeVotos) {
                maiorNumeroDeVotos = votosDoCandidato;
                vencedores.clear(); 
                vencedores.add(candidato);
            } else if (votosDoCandidato == maiorNumeroDeVotos && votosDoCandidato > 0) {
                vencedores.add(candidato);
            }
        }

        System.out.println("\nTotal de votos: " + totalVotos);

        if (totalVotos == 0) {
             System.out.println("Nenhum voto registrado.");
        } else if (vencedores.size() > 1) {
            System.out.print("Vencedor: Empate entre ");
            for (int i = 0; i < vencedores.size(); i++) {
                System.out.print(vencedores.get(i) + (i == vencedores.size() - 1 ? "" : " e "));
            }
            System.out.println();
        } else if (!vencedores.isEmpty()) {
            System.out.println("Vencedor: " + vencedores.get(0));
        } else {
      
             System.out.println("Nenhum vencedor determinado (possível erro lógico ou todos com 0 votos e não houve condição de empate > 0).");
        }

        scanner.close();
    }
}