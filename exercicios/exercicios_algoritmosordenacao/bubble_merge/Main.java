package exercicios.exercicios_algoritmosordenacao.bubble_merge;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        OrganizationStock productStock = new OrganizationStock();
        Stock[] stocks = new Stock[100];
        int totalProducts = 0;


        boolean loopingStock = true;
        while (loopingStock){

            System.out.println("\n===== Pratica dos algoritmos de ordenação =====");
            System.out.println("1 - Inserir Produto");
            System.out.println("2 - Listar Produtos (crescente por ID - BubbleSort)");
            System.out.println("3 - Listar Produtos (crescente por valor - Bubblesort )");
            System.out.println("4 - Listar Produtos (Ordem alfabetica - Bubblesort) ");
            System.out.println("5 - Sair do Estoque");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1:

                    long id;
                    boolean idsearch = true;

                    while (idsearch){
                        System.out.print("ID: ");
                        id = scan.nextLong();
                        scan.nextLine();

                        if (id <= 0) {
                            System.out.println("ID inválido! Use um número maior que 0.");
                        } else if (productStock.existsId( stocks, id)) {
                            System.out.println("ID JÁ EXISTE!");
                        }
                        else {
                            System.out.print("Nome: ");
                            String name = scan.nextLine();

                            System.out.print("Valor do produto: ");
                            double value = scan.nextDouble();
                            scan.nextLine();


                            stocks[totalProducts] = new Stock(name, id, value);
                            totalProducts++;

                            System.out.println("Produto cadastrado com sucesso!");
                            idsearch = false;
                        }
                    }
                    break;
                case 2:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] temp = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        temp[i] = stocks[i];
                    }

                    productStock.orderById(temp);
                    System.out.println("============dados da organização==========");
                    productStock.showStatistics();

                    System.out.println("\n--- Produtos ordenados por ID (crescente) ---");
                    for (Stock s : temp) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] tempValue = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        tempValue[i] = stocks[i];
                    }

                    productStock.orderByValue(tempValue);
                    System.out.println("============dados da organização==========");
                    productStock.showStatistics();

                    System.out.println("\n--- Produtos ordenados por valor (crescente) ---");
                    for (Stock s : tempValue) {
                        System.out.println(s);
                    }
                    break;
                case 4:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] tempName = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        tempName[i] = stocks[i];
                    }

                    productStock.orderByName(tempName);
                    System.out.println("============dados da organização==========");
                    productStock.showStatistics();

                    System.out.println("\n--- Produtos ordenados por nome (crescente) ---");
                    for (Stock s : tempName) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    System.out.println("=====================");
                    System.out.println("fechando o estoque...");
                    loopingStock = false;
                    break;
                default:
                    System.out.println("opção inválida!");
            }
        }
    }
}
