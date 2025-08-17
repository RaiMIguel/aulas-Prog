package exercicio_estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Não pode usar orientação a objetos, é pra ser dificil mesmo
    // crie seu proprio estoque de loja, para isso ele deve permitir listar as
    // camisas,
    // atualizar os atributos da camisa como preço, tamanho, cor, valor etc,
    // precisa registrar novas camisas
    // precisa deletar as camisas já existentes
    // CRUD -> CREATE , READ, UPDATE e DELETE

    /**
     * @param args
     * Tudo que tiver Indice nesse código se refere a posição no ARRAY
     */ 


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
        ArrayList<Double> descontos = new ArrayList<>();
        ArrayList<Boolean> controleVendidos = new ArrayList<>();
        ArrayList<Double> valoresVendasComDescontos = new ArrayList<>();
        
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Sistema de estoque para camisas do rai");
            System.out.println("---------------------------------------------");

            System.out.println("1 - Cadastrar camisa");
            System.out.println("2 - Listar camisas");
            System.out.println("3 - Procurar camisa por ID");
            System.out.println("4 - Modificar ou atualizar uma camisa pelo ID");
            System.out.println("5 - Deletar camisa pelo ID");
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
                        System.out.println("Este Nome já está registrado, digite outro: ");
                        nome = scanner.nextLine(); // adicionei para receber o outro nome

                    } else {
                        nomes.add(nome);
                        break;
                    }
                }

                System.out.println("Digite a marca: ");
                String marca = scanner.nextLine().toUpperCase();
                marcas.add(marca);

                while (true) {
                    System.out.println("Digite o tamanho: (P,M,G,GG)");
                    String tamanho = scanner.nextLine().toUpperCase();
                    if (tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G") || tamanho.equals("GG")) {
                        tamanhos.add(tamanho);
                        break;
                    } else {
                        System.out.println("Tamanho invalido!");
                    }
                }

                System.out.println("Digite a cor: ");
                String cor = scanner.nextLine().toUpperCase();
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
                    scanner.nextLine();

                    if (valorVenda > 0) {
                        valoresVenda.add(valorVenda);
                        break;
                    } else {
                        System.out.println("Valor invalido");
                    }
                }
                
                while (true) {
                      System.out.println("Tem algum desconto?\ns - sim\nn - não");
                      String temDesconto = scanner.nextLine().toLowerCase();

                      if (temDesconto.equals("s")) {
                        System.out.println("Digite o desconto");
                        Double desconto = scanner.nextDouble();
                        scanner.nextLine();
                        descontos.add(desconto);
                        break;
                      }
                      else if (temDesconto.equals("n")) { 
                        Double desconto = 0.0;
                        descontos.add(desconto);
                        break;
                      }
                       else {
                        System.out.println("Valor invalido");
                        }
                }

                Double valorVendaNovo = valoresVenda.get(valoresVenda.size() - 1);
                Double valorDescNovo = descontos.get(descontos.size() - 1);

                Double valorVendaDesconto = valorVendaNovo - valorDescNovo;
                valoresVendasComDescontos.add(valorVendaDesconto);
                
                controleVendidos.add(false);

                ids.add(ids.isEmpty() ? 1 : (ids.get(ids.size() - 1) + 1));
                System.out.println("Cadastrando camisa no estoque...");

            } else if (escolha.equals("2")) {

                if (nomes.isEmpty()) {
                    System.out.println("Nenhuma camisa cadastrada no estoque.");
                }
                else {
                    System.out.println("---------------------------------------------");
                    System.out.println("Listando camisas cadastradas...");
                    System.out.println("---------------------------------------------");
                    
                    for (int listaCamisas = 0; listaCamisas < nomes.size(); listaCamisas++) {
                        modeloListaDeCamisa(listaCamisas, nomes, ids, tamanhos, cores, marcas, descontos, valoresCompra, valoresVenda, valoresVendasComDescontos, controleVendidos);
                    }
                }
            } else if (escolha.equals("3")) {

                if (ids.isEmpty()){
                    System.out.println("Nenhuma camisa cadastrada para buscar.");
                }
                else {
                    System.out.println("---------------------------------------------");
                    System.out.println("Procurar camisa por ID");
                    System.out.println("---------------------------------------------");
                    System.out.println("Digite o id da camisa que deseja procurar: ");
                    Long idBusca = scanner.nextLong();
                    scanner.nextLine(); 

                    int indiceDoId = buscarDadosCamisaPorId(idBusca, ids);
                   
                    if (indiceDoId != -1) {
                        modeloListaDeCamisa(indiceDoId, nomes, ids, tamanhos, cores, marcas, descontos, valoresCompra, valoresVenda, valoresVendasComDescontos, controleVendidos);
                    }
                    else {
                        System.out.println("Id não encontrado!");
                    }
                  
                }      
            } else if (escolha.equals("4")) {

                if (ids.isEmpty()){
                    System.out.println("Nenhuma camisa cadastrada para buscar.");   
                }
                else {
                    System.out.println("---------------------------------------------");
                    System.out.println("Modificar/atualizar camisa por ID");
                    System.out.println("---------------------------------------------");
                    System.out.println("Digite o id da camisa que deseja Modificar/atualizar: ");
                    Long idBusca = scanner.nextLong();
                    scanner.nextLine(); 
                    
                    int indiceDoId = buscarDadosCamisaPorId(idBusca, ids);

                    if (indiceDoId != -1) {
                        modeloListaDeCamisa(indiceDoId, nomes, ids, tamanhos, cores, marcas, descontos, valoresCompra, valoresVenda, valoresVendasComDescontos, controleVendidos);
                        
                        System.out.println("Deseja trocar o nome?\ns - sim\nn - não ");
                        String desejoTrocar = scanner.nextLine().toLowerCase();
                        if (desejoTrocar.equals("s")){
                            System.out.println("Digite o novo nome: ");
                            String novoNome = scanner.nextLine();

                            nomes.set(indiceDoId, novoNome);
                            System.out.println("Nome atualizado com sucesso! ");
                        }
                        else if (desejoTrocar.equals("n")) {
                            System.out.println("Item não modificado! ");
                        }
                        System.out.println("Deseja trocar o tamanho?\ns - sim\nn - não ");
                        desejoTrocar = scanner.nextLine();
                        if (desejoTrocar.equals("s")){
                            System.out.println("Digite o novo tamanho: ");
                            String novoTamanho = scanner.nextLine();

                            tamanhos.set(indiceDoId, novoTamanho);
                            System.out.println("Tamanho atualizado com sucesso! ");
                        }
                        else if (desejoTrocar.equals("n")) {
                            System.out.println("Item não modificado! ");
                        }
                        System.out.println("Deseja trocar a cor?\ns - sim\nn - não ");
                        desejoTrocar = scanner.nextLine();
                        if (desejoTrocar.equals("s")){
                            System.out.println("Digite a nova cor: ");
                            String novaCor = scanner.nextLine();

                            cores.set(indiceDoId, novaCor);
                            System.out.println("Cor atualizada com sucesso! ");
                        }
                        else if (desejoTrocar.equals("n")) {
                            System.out.println("Item não modificado! ");
                        }
                        System.out.println("Deseja trocar a marca?\ns - sim\nn - não ");
                        desejoTrocar = scanner.nextLine();
                        if (desejoTrocar.equals("s")){
                            System.out.println("Digite a nova marca: ");
                            String novaMarca = scanner.nextLine();

                            marcas.set(indiceDoId, novaMarca);
                            System.out.println("Marca atualizada com sucesso! ");
                        }
                        else if (desejoTrocar.equals("n")) {
                            System.out.println("Item não modificado! ");
                        }
                        System.out.println("Deseja trocar o desconto?\ns - sim\nn - não ");
                        desejoTrocar = scanner.nextLine();
                        if (desejoTrocar.equals("s")){
                            System.out.println("Digite o novo desconto: ");
                            Double novoDesconto = scanner.nextDouble();
                            scanner.nextLine();

                            descontos.set(indiceDoId, novoDesconto);
                            System.out.println("Desconto atualizado com sucesso! ");
                        }
                        else if (desejoTrocar.equals("n")) {
                            System.out.println("Item não modificado! ");
                        }
                        System.out.println("Deseja trocar o valor de aquisição?\ns - sim\nn - não ");
                        desejoTrocar = scanner.nextLine();
                        if (desejoTrocar.equals("s")){
                            System.out.println("Digite o novo valor de aquisição: ");
                            Double novoValorCompra = scanner.nextDouble();
                            scanner.nextLine();

                            valoresCompra.set(indiceDoId, novoValorCompra);
                            System.out.println("Valor de compra atualizado com sucesso! ");
                        }
                        else if (desejoTrocar.equals("n")) {
                            System.out.println("Item não modificado! ");
                        }
                        System.out.println("Deseja trocar o valor de venda?\ns - sim\nn - não ");
                        desejoTrocar = scanner.nextLine();
                        if (desejoTrocar.equals("s")){
                            System.out.println("Digite o novo valor de venda: ");
                            Double novoValorVenda = scanner.nextDouble();
                            scanner.nextLine();

                            valoresVenda.set(indiceDoId, novoValorVenda);
                            System.out.println("Valor de venda atualizado com sucesso! ");
                        }
                        else if (desejoTrocar.equals("n")) {
                            System.out.println("Item não modificado! ");
                        }

                        Double valorVendaAtualizado = valoresVenda.get(indiceDoId);
                        Double valorDescAtualizado = descontos.get(indiceDoId);

                        Double valorVendaDesconto = valorVendaAtualizado - valorDescAtualizado;
                        valoresVendasComDescontos.set(indiceDoId, valorVendaDesconto);

                        System.out.println("Deseja trocar o Status: VENDIDO/NÃO VENDIDO?\ns - sim\nn - não ");
                        desejoTrocar = scanner.nextLine();

                        if (desejoTrocar.equals("s")){
                            System.out.println("Digite o novo Status: \nV - VENDIDO\nN - NÃO VENDIDO ");
                            String novoStatusVenda = scanner.nextLine().toUpperCase();
                            
                            if(novoStatusVenda.equals("V")){ 
                                controleVendidos.set(indiceDoId, true);
                                System.out.println("Camisa atualizada com sucesso para VENDIDO!");
                                }
                            else if (desejoTrocar.equals("N")){
                                controleVendidos.set(indiceDoId, false);
                                 System.out.println("Camisa atualizada com sucesso para NÃO VENDIDO!");

                                }
                            else{
                                System.out.println("Status inválido. A camisa não foi atualizada.");
                                }
                            }
                        else if (desejoTrocar.equals("n")) {
                            System.out.println("Item não modificado! ");
                        }
                    
                    else if (indiceDoId != idBusca){
                        System.out.println("Id não encontrado!");
                        break;
                    }
                }
             }
            } else if (escolha.equals("5")) {
            
                if (ids.isEmpty()){
                    System.out.println("Nenhuma camisa cadastrada para buscar.");   
                }
                    else {
                        System.out.println("---------------------------------------------");
                        System.out.println("Deletar camisa por ID");
                        System.out.println("---------------------------------------------");
                        System.out.println("Digite o id da camisa que deseja Deletar: ");
                        Long idBusca = scanner.nextLong();
                        scanner.nextLine(); 
                    
                        int indiceDoId = buscarDadosCamisaPorId(idBusca, ids);

                            if (idBusca != -1) {
                                modeloListaDeCamisa(indiceDoId, nomes, ids, tamanhos, cores, marcas, descontos, valoresCompra, valoresVenda, valoresVendasComDescontos, controleVendidos);
                                ids.remove(indiceDoId);
                                nomes.remove(indiceDoId);
                                tamanhos.remove(indiceDoId);
                                cores.remove(indiceDoId);
                                marcas.remove(indiceDoId);
                                descontos.remove(indiceDoId);
                                valoresCompra.remove(indiceDoId);
                                valoresVenda.remove(indiceDoId);
                                valoresVendasComDescontos.remove(indiceDoId);
                                controleVendidos.remove(indiceDoId);

                                System.out.println("Camisa removida com sucesso!");

                            }

                            else{
                                System.out.println("ID inválido! Camisa não atualizada! ");
                            }
                    }
            } else if (escolha.equals("0")) {
                break;
            } else {
            
            }
            //
            System.out.println("Você deseja voltar ao menú?\ns - sim\nn - não");
            String opcaoMenu = scanner.nextLine().toLowerCase();
                if (opcaoMenu.equals("s")){
                    System.out.println();
                }
                else if (opcaoMenu.equals("n")) {
                    break;
                }
                else {
                    System.out.println("Opção inválida");
                }
            //
        }
    
        scanner.close();
    }
    public static void modeloListaDeCamisa(int indice, ArrayList<String> nomes, ArrayList<Long> ids,
    ArrayList<String> tamanhos, ArrayList<String> cores, ArrayList<String> marcas, 
    ArrayList<Double> descontos, ArrayList<Double> valoresCompra, ArrayList<Double> valoresVenda,
    ArrayList<Double> valoresVendasComDescontos, ArrayList<Boolean> controleVendidos) {

        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("Nome: " + nomes.get(indice));
        System.out.println("Id da Camisa: " + ids.get(indice));
        System.out.println("Tamanho: " + tamanhos.get(indice));
        System.out.println("Cor: " + cores.get(indice));
        System.out.println("Marca: " + marcas.get(indice));
        System.out.println("Descontos: " + descontos.get(indice));
        System.out.println("Valor de aquisição: " + valoresCompra.get(indice));
        System.out.println("Valor de venda: " + valoresVenda.get(indice));
        System.out.println("Valor de venda com Desconto: " + valoresVendasComDescontos.get(indice));
        System.out.println("Status de venda: " + (controleVendidos.get(indice) ? "VENDIDO" : "NÃO VENDIDO"));
        System.out.println();
        System.out.println("---------------------------------------------");
        }
        
    public static int buscarDadosCamisaPorId (long idBusca, ArrayList <Long> ids){
        for (int i = 0; i < ids.size(); i++) {
            if (ids.get(i) == idBusca) {
                return i;
            }
        }

        return -1;
    }
}
