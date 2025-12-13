import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questoes58 {

    /**
     * @param args
     * Enunciado: Implemente busca por elemento em ArrayList. Retorne todas as posições
     * onde o elemento aparece.
     *
     * Objetivos:
     * - Buscar elemento específico
     * - Retornar múltiplas posições
     * - Lidar com caso não encontrado
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Java", "Python", "Java", "C++", "Java"));
        
        System.out.println("Lista: " + lista);
        System.out.print("Digite o elemento a buscar: ");
        String elemento = scanner.nextLine();
        
        System.out.println("\nBuscando \"" + elemento + "\" na lista...");
        ArrayList<Integer> posicoes = buscarOcorrencias(lista, elemento);
        
        if (posicoes.isEmpty()) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("Elemento encontrado nas posições: " + posicoes);
            System.out.println("Total de ocorrências: " + posicoes.size());
        }
        
        scanner.close();
    }

    /**
     * Busca por todas as ocorrências de um elemento em um ArrayList de strings.
     * @param lista A lista a ser pesquisada.
     * @param elemento O elemento a ser buscado.
     * @return Um ArrayList de inteiros contendo os índices onde o elemento foi encontrado.
     */
    public static ArrayList<Integer> buscarOcorrencias(ArrayList<String> lista, String elemento) {
        ArrayList<Integer> posicoes = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                posicoes.add(i);
            }
        }
        return posicoes;
    }
}