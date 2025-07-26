import java.util.ArrayList;
import java.util.Scanner;

// Classe Livro auxiliar (deve estar no mesmo arquivo ou em um arquivo Livro.java separado)
class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" - " + autor;
    }
}

public class Questoes60 {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Buscar por título");
            System.out.println("3 - Listar todos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    biblioteca.add(new Livro(titulo, autor));
                    System.out.println("Livro adicionado: \"" + titulo + "\" por " + autor);
                    break;
                case 2:
                    System.out.print("Digite o título para buscar: ");
                    String buscaTitulo = scanner.nextLine();
                    boolean encontrado = false;
                    System.out.println("=== RESULTADOS DA BUSCA ===");
                    for (Livro livro : biblioteca) {
                        if (livro.titulo.toLowerCase().contains(buscaTitulo.toLowerCase())) {
                            System.out.println(livro.toString());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Nenhum livro encontrado com esse título.");
                    }
                    break;
                case 3:
                    System.out.println("=== BIBLIOTECA ===");
                    if (biblioteca.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (int i = 0; i < biblioteca.size(); i++) {
                            System.out.println((i + 1) + ". " + biblioteca.get(i).toString());
                        }
                        System.out.println("Total: " + biblioteca.size() + " livro(s)");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema da biblioteca. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}