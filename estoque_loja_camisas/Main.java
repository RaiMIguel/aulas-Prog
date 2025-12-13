package estoque_loja_camisas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Camisa> estoque = new ArrayList<>();
        String escolha = "";
        
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Sistema de estoque para camisas do rai");
            System.out.println("---------------------------------------------");
            System.out.println("1 - Cadastrar camisa");
            System.out.println("2 - Listar todas camisas cadastradas");
            System.out.println("3 - Procurar camisa por ID");
            System.out.println("4 - Modificar ou atualizar uma camisa pelo ID");
            System.out.println("5 - Deletar camisa pelo ID");
            System.out.println("6 - Listar camisas por atributos especificos");
            System.out.println("7 - Conferir todos Lucros até o Momento");
            System.out.println("0 - Sair do Sistema");
            
            escolha = scanner.nextLine();

            if (escolha.equals("1")) {
                cadastrarCamisa(scanner, estoque);
            } else if (escolha.equals("2")) {
                listarCamisas(estoque);
            } else if (escolha.equals("3")) {
                procurarCamisaPorId(scanner, estoque);
            } else if (escolha.equals("4")) {
                modificarCamisa(scanner, estoque);
            } else if (escolha.equals("5")) {
                deletarCamisa(scanner, estoque);
            } else if (escolha.equals("6")) {
                listarPorAtributo(scanner, estoque);
            } else if (escolha.equals("7")) {
                conferirLucros(estoque);
            } else if (escolha.equals("0")) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
            
            System.out.println("Você deseja voltar ao menú?\ns - sim\nn - não");
            String opcaoMenu = scanner.nextLine().toLowerCase();
            if (opcaoMenu.equals("n")) {
                break;
            }
        }
        
        scanner.close();
    }
        
    public static void cadastrarCamisa(Scanner scanner, ArrayList<Camisa> estoque) {
        System.out.println("---------------------------------------------");
        System.out.println("Você escolheu cadastrar uma camisa");
        System.out.println("---------------------------------------------");
        
        String nome = pedirNomeUnico(scanner, estoque);
        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine().toUpperCase();
        System.out.print("Digite o tamanho: (P,M,G,GG)");
        String tamanho = scanner.nextLine().toUpperCase();
        System.out.print("Digite a cor: ");
        String cor = scanner.nextLine().toUpperCase();
        
        double valorCompra = pedirValorNumerico(scanner, "compra");
        double valorVenda = pedirValorNumerico(scanner, "venda");
        double desconto = pedirValorNumerico(scanner, "desconto (em porcentagem)");
        
        Camisa novaCamisa = new Camisa(nome, tamanho, cor, valorCompra, valorVenda, marca, desconto);
        estoque.add(novaCamisa);
        
        System.out.println("Cadastrando camisa no estoque...");
        System.out.println("Camisa cadastrada com sucesso com o ID: " + novaCamisa.getId());
    }
    
    public static void listarCamisas(ArrayList<Camisa> estoque) {
        if (estoque.isEmpty()) {
            System.out.println("Nenhuma camisa cadastrada no estoque.");
            return;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Listando camisas cadastradas...");
        System.out.println("---------------------------------------------");
        
        for (Camisa camisa : estoque) {
            camisa.exibirDetalhes();
        }
    }
    
    public static void procurarCamisaPorId(Scanner scanner, ArrayList<Camisa> estoque) {
        if (estoque.isEmpty()) {
            System.out.println("Nenhuma camisa cadastrada para buscar.");
            return;
        }
        System.out.print("Digite o id da camisa que deseja procurar: ");
        long idBusca = scanner.nextLong();
        scanner.nextLine();
        
        Camisa camisaEncontrada = buscarCamisaPorId(estoque, idBusca);
        if (camisaEncontrada != null) {
            System.out.println("Camisa encontrada!");
            camisaEncontrada.exibirDetalhes();
        } else {
            System.out.println("Id não encontrado!");
        }
    }
    
    public static Camisa buscarCamisaPorId(ArrayList<Camisa> estoque, long id) {
        for (Camisa camisa : estoque) {
            if (camisa.getId() == id) {
                return camisa;
            }
        }
        return null;
    }

    public static String pedirNomeUnico(Scanner scanner, ArrayList<Camisa> estoque) {
        String nome;
        while (true) {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();
            boolean temIgual = false;
            for (Camisa camisa : estoque) {
                if (camisa.getNome().equals(nome)) {
                    temIgual = true;
                    System.out.println("Este Nome já está registrado, digite outro!\n ");
                    break;
                }
            }
            if (!temIgual) {
                return nome;
            }
        }
    }
    
    public static double pedirValorNumerico(Scanner scanner, String tipoValor) {
        while (true) {
            try {
                System.out.print("Digite o valor de " + tipoValor + ": ");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Valor inválido. Deve ser maior que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um valor numérico.");
                scanner.nextLine();
            }
        }
    }

    public static void modificarCamisa(Scanner scanner, ArrayList<Camisa> estoque) {
    }
    
    public static void deletarCamisa(Scanner scanner, ArrayList<Camisa> estoque) {
    }

    public static void listarPorAtributo(Scanner scanner, ArrayList<Camisa> estoque) {
    }

    public static void conferirLucros(ArrayList<Camisa> estoque) {
    }
}