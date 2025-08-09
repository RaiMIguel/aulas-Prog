package exercicio_estoque;

import java.text.NumberFormat.Style;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Não pode usar orientação a objetos, é pra ser dificil mesmo
    // crie seu proprio estoque de loja, para isso ele deve permitir listar as
    // camisas,
    // atualizar os atributos da camisa como preço, tamanho, cor, valor etc,
    // precisa registrar novas camisas
    // precisa deletar as camisas já existentes
    // CRUD -> CREATE , READ, UPDATE e DELETE

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String escolha = "";

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> tamanhos = new ArrayList<>();
        ArrayList<String> cores = new ArrayList<>();
        ArrayList<Long> ids = new ArrayList<>();
        ArrayList<Double> valoresVenda = new ArrayList<>();
        ArrayList<Double> valoresCompra = new ArrayList<>();
        ArrayList<String> marcas = new ArrayList<>();
        ArrayList<Integer> descontos = new ArrayList<>();
        ArrayList<Boolean> controleVendidos = new ArrayList<>();
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Sistema de estoque para camisas do rai");
            System.out.println("---------------------------------------------");

            System.out.println("1 - Cadastrar camisa");
            System.out.println("2 - Listar camisas");
            System.out.println("3 - Procurar camisa por ID");
            System.out.println("4 - Modificar ou atualizar uma camisa");
            System.out.println("5 - Deletar camisa");
            System.out.println("0 - Sair do Sistema");
            escolha = scanner.nextLine();

            if (escolha.equals("1")) {
                System.out.println("---------------------------------------------");
                System.out.println("Você escolheu cadastrar uma camisa");
                System.out.println("---------------------------------------------");

                while (true) {
                    System.out.println("Digite o nome: "); // se já existir um nome desse registrado você precisa dizer
                                                           // a
                                                           // pessoa e impedir ela de cadastrar dois nomes iguais
                                                           // pedindo
                                                           // para ela digitar outro nome
                    String nome = scanner.nextLine();
                    boolean temIgual = false;
                    for (String nomeLista : nomes) {
                        if (nomeLista.equals(nome)) {
                            temIgual = !temIgual;
                        }
                    }
                    if (temIgual) {
                        System.out.println("Este Nome já está registrado, digite outro");
                    } else {
                        nomes.add(nome);
                        break;
                    }
                }
                while (true) {
                    System.out.println("Digite o tamanho: (P,M,G,GG)");
                    String tamanho = scanner.nextLine();
                    if (tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G") || tamanho.equals("GG")) {
                        tamanhos.add(tamanho);
                        break;
                    } else {
                        System.out.println("Tamanho invalido!");
                    }
                }

                System.out.println("Digite a cor: ");
                String cor = scanner.nextLine();
                cores.add(cor);
                while (true) {
                    System.out.println("Digite o valor de compra");
                    Double valorCompra = scanner.nextDouble();

                    if (valorCompra > 0) {
                        valoresCompra.add(valorCompra);
                        break;
                    } else {
                        System.out.println("Valor invalido");
                    }
                }
                while (true) {
                    System.out.println("Digite o Valor de venda");
                    Double valorVenda = scanner.nextDouble();

                    if (valorVenda > 0) {
                        valoresCompra.add(valorVenda);
                        break;
                    } else {
                        System.out.println("Valor invalido");
                    }
                }

                System.out.println("Digite a marca");
                         System.out.println("Digite a marca: ");
                String marca = scanner.nextLine();
                marcas.add(marca);
                while (true) {
                      System.out.println("Tem algum desconto?\ns - sim\nn - não");
                      String temDesconto = scanner.nextLine();

                      if (temDesconto.equals("s")) {
                        System.out.println("Digite o desconto");
                        Integer desconto = scanner.nextInt();
                        descontos.add(desconto);
                        break;

                      }
                      if (temDesconto.equals("n")) {
                        descontos.add(0);
                      }
                      else {
                        System.out.println("Valor invalido");
                      }
                }

                controleVendidos.add(false);

              ids.add(ids.isEmpty() ? 1 : (ids.get(ids.size() - 1) + 1));
              System.out.println("Conferindo se todos os valores foram preenchidos...");

              // logica para saber se todos os valores foram preenchidos



              // mostrarValores()  trazer valor do que acabou de ser cadastrado
                
            } else if (escolha.equals("2")) {

            } else if (escolha.equals("3")) {

            } else if (escolha.equals("4")) {

            } else if (escolha.equals("5")) {

            } else if (escolha.equals("0")) {
                break;
            } else {
                System.out.println("Valor Invalido!!!!!");
            }
        }
    }

}
