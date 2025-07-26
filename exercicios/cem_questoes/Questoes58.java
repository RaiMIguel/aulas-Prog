import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questoes58 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Java", "Python", "Java", "C++", "Java"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista: " + lista.toString());
        System.out.print("Digite o elemento a buscar: ");
        String elementoBuscar = scanner.nextLine();

        System.out.println("Buscando \"" + elementoBuscar + "\" na lista...");

        ArrayList<Integer> posicoesEncontradas = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elementoBuscar)) {
                posicoesEncontradas.add(i);
            }
        }

        if (posicoesEncontradas.isEmpty()) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.print("Elemento encontrado nas posições: ");
            for (int i = 0; i < posicoesEncontradas.size(); i++) {
                System.out.print(posicoesEncontradas.get(i) + (i == posicoesEncontradas.size() - 1 ? "" : ", "));
            }
            System.out.println();
            System.out.println("Total de ocorrências: " + posicoesEncontradas.size());
        }

        scanner.close();
    }
}