import java.util.ArrayList;
import java.util.Scanner;

public class Questoes60 {

    /**
     * Classe para representar um livro com título e autor.
     */
    public static class Livro {
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

    /**
     * @param args
     * Enunciado: Crie um sistema de biblioteca com ArrayList. Cada livro tem
     * título e autor. Permita adicionar, buscar e listar livros.
     *
     * Objetivos:
     * - Trabalhar com objetos em ArrayList
     * - Implementar busca por critério
     * - Criar classe auxiliar
     */
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarLivro(scanner, biblioteca);
                    break;
                case 2:
                    buscarLivro(scanner, biblioteca);
                    break;
                case 3:
                    listarLivros(biblioteca);
                    break;
                case 0:
                    System.out.println("Saindo da biblioteca...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    /**
     * Exibe o menu de opções da biblioteca.
     */
    public static void exibirMenu() {
        System.out.println("\n=== SISTEMA DA BIBLIOTECA ===");
        System.out.println("1 - Adicionar livro");
        System.out.println("2 - Buscar por título");
        System.out.println("3 - Listar todos");
        System.out.println("0 - Sair");
        System.out.println("--------------------------");
    }

    /**
     * Adiciona um novo livro à biblioteca.
     * @param scanner O objeto Scanner para leitura da entrada.
     * @param biblioteca O ArrayList de livros.
     */
    public static void adicionarLivro(Scanner scanner, ArrayList<Livro> biblioteca) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        biblioteca.add(new Livro(titulo, autor));
        System.out.println("Livro adicionado: \"" + titulo + "\" por " + autor);
    }

    /**
     * Busca um livro por título e exibe o resultado.
     * @param scanner O objeto Scanner para leitura da entrada.
     * @param biblioteca O ArrayList de livros.
     */
    public static void buscarLivro(Scanner scanner, ArrayList<Livro> biblioteca) {
        System.out.print("Digite o título para buscar: ");
        String tituloBusca = scanner.nextLine();
        
        System.out.println("\n--- RESULTADOS DA BUSCA ---");
        boolean encontrado = false;
        for (Livro livro : biblioteca) {
            if (livro.titulo.toLowerCase().contains(tituloBusca.toLowerCase())) {
                System.out.println("Encontrado: " + livro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado com o título \"" + tituloBusca + "\".");
        }
    }

    /**
     * Lista todos os livros cadastrados na biblioteca.
     * @param biblioteca O ArrayList de livros.
     */
    public static void listarLivros(ArrayList<Livro> biblioteca) {
        System.out.println("\n=== LISTA DE LIVROS ===");
        if (biblioteca.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            int contador = 1;
            for (Livro livro : biblioteca) {
                System.out.println(contador + ". " + livro);
                contador++;
            }
        }
        System.out.println("Total: " + biblioteca.size() + " livro(s)");
    }
}