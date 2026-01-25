package exercicios.exercicios_algoritmosordenacao.bubble_merge_quick;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        OrganizationStockBubble productStockBubble = new OrganizationStockBubble();
        OrganizationStockMerge productStockMerge = new OrganizationStockMerge();
        OrganizationStockQuick productStockQuick = new OrganizationStockQuick();
        Stock[] stocks = new Stock[100];
        int totalProducts = 0;


        boolean loopingStock = true;
        while (loopingStock){

            System.out.println("\n===== Pratica dos algoritmos de ordenação =====");
            System.out.println("1 - Inserir Produto");
            System.out.println("2 - Listar Produtos (crescente por ID - BubbleSort)");
            System.out.println("3 - Listar Produtos (crescente por valor - Bubblesort )");
            System.out.println("4 - Listar Produtos (Ordem alfabetica - Bubblesort) ");
            System.out.println("=================================================");
            System.out.println("5 - Listar Produtos (crescente por ID - MergeSort)");
            System.out.println("6 - Listar Produtos (crescente por valor - Mergesort )");
            System.out.println("7 - Listar Produtos (Ordem alfabetica - Mergesort) ");
            System.out.println("=================================================");
            System.out.println("8 - Listar Produtos (crescente por ID - QuickSort)");
            System.out.println("9 - Listar Produtos (crescente por valor - Quicksort )");
            System.out.println("10 - Listar Produtos (Ordem alfabetica - Quicksort) ");
            System.out.println("=================================================");
            System.out.println("15 - Sair do Estoque");

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
                        } else if (productStockBubble.existsId( stocks, id)) {
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

                    productStockBubble.orderById(temp);
                    System.out.println("============dados da organização==========");
                    productStockBubble.showStatistics();

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

                    productStockBubble.orderByValue(tempValue);
                    System.out.println("============dados da organização==========");
                    productStockBubble.showStatistics();

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

                    productStockBubble.orderByName(tempName);
                    System.out.println("============dados da organização==========");
                    productStockBubble.showStatistics();

                    System.out.println("\n--- Produtos ordenados por nome (crescente) ---");
                    for (Stock s : tempName) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] tempM = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        tempM[i] = stocks[i];
                    }

                    int left = 0;
                    int right = totalProducts - 1;

                    productStockMerge.OrderById(tempM, left, right);
                    System.out.println("============dados da organização==========");
                    productStockMerge.showStatistic();

                    System.out.println("\n--- Produtos ordenados por ID (crescente) ---");
                    for (Stock s : tempM) {
                        System.out.println(s);
                    }
                    break;

                case 6:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] tempValueM = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        tempValueM[i] = stocks[i];
                    }
                    int leftV = 0;
                    int rightV = totalProducts - 1;

                    productStockMerge.orderByValue(tempValueM, leftV ,rightV);
                    System.out.println("============dados da organização==========");
                    productStockMerge.showStatistic();

                    System.out.println("\n--- Produtos ordenados por valor (crescente) ---");
                    for (Stock s : tempValueM) {
                        System.out.println(s);
                    }
                    break;

                case 7:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] tempNameM = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        tempNameM[i] = stocks[i];
                    }
                    int leftN = 0;
                    int rightN = totalProducts -1;

                    productStockMerge.orderByName(tempNameM,leftN,rightN);
                    System.out.println("============dados da organização==========");
                    productStockMerge.showStatistic();

                    System.out.println("\n--- Produtos ordenados por nome (crescente) ---");
                    for (Stock s : tempNameM) {
                        System.out.println(s);
                    }
                    break;

                case 8:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] tempQ = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        tempQ[i] = stocks[i];
                    }

                    int leftQ = 0;
                    int rightQ = totalProducts - 1;

                    productStockQuick.orderById(tempQ, leftQ, rightQ);
                    System.out.println("============dados da organização==========");
                    productStockQuick.showStatistic();

                    System.out.println("\n--- Produtos ordenados por ID (crescente) ---");
                    for (Stock s : tempQ) {
                        System.out.println(s);
                    }
                    break;

                case 9:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] tempValueQ = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        tempValueQ[i] = stocks[i];
                    }
                    int leftQuick = 0;
                    int rightQuick = totalProducts - 1;

                    productStockQuick.orderByValue(tempValueQ, leftQuick ,rightQuick);
                    System.out.println("============dados da organização==========");
                    productStockQuick.showStatistic();

                    System.out.println("\n--- Produtos ordenados por valor (crescente) ---");
                    for (Stock s : tempValueQ) {
                        System.out.println(s);
                    }
                    break;

                case 10:
                    if (totalProducts == 0) {
                        System.out.println("Estoque vazio!");
                        break;
                    }

                    Stock[] tempNameQ = new Stock[totalProducts];
                    for (int i = 0; i < totalProducts; i++) {
                        tempNameQ[i] = stocks[i];
                    }
                    int leftQuickI = 0;
                    int rightQuickI = totalProducts -1;

                    productStockQuick.orderByName(tempNameQ,leftQuickI,rightQuickI);
                    System.out.println("============dados da organização==========");
                    productStockQuick.showStatistic();

                    System.out.println("\n--- Produtos ordenados por nome (crescente) ---");
                    for (Stock s : tempNameQ) {
                        System.out.println(s);
                    }
                    break;

                case 15:
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
