//Programa para testar todos conteúdos de uma vez
//
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFinanceiro {
    public static final String CATEGORIA_ALIMENTACAO = "Alimentação";
    public static final String CATEGORIA_TRANSPORTE = "Transporte";
    public static final String CATEGORIA_MORADIA = "Moradia";
    public static final String CATEGORIA_LAZER = "Lazer";
    public static final String CATEGORIA_SAUDE = "Saúde";
    public static final String CATEGORIA_EDUCACAO = "Educação";
    public static final String CATEGORIA_OUTROS = "Outros";

    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        int opcao;
        ArrayList<Gasto> listaGastos = new ArrayList<>();
        //aqui escolhi array pois a quantidade de gastos não é certa, pode ter várias.

        do {
            System.out.println("===MENU FINANCEIRO===");
            System.out.println("1 - Registrar gasto");
            System.out.println("2 - Cadastrar meta");
            System.out.println("3 - Ver relatório");
            System.out.println("4 - Ver por categoria");
            System.out.println("0 - Sair");
            System.out.print("escolha uma opção:");
            opcao = escolha.nextInt();
            escolha.nextLine();

            switch (opcao){
                case 1:
                 registrarGasto(escolha, listaGastos);
                    break;
                case 2:
                    System.out.println("Ainda não concluido");
                    break;
                case 3:
                    System.out.println("Ainda não concluido");
                    break;
                case 4:
                    gastosCategoria(escolha, listaGastos);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao !=0);
        //aqui preferi usar o do while pois ai ele repete pelo menos uma vez o menu e não 
        //precisa criar a opção como -1
        escolha.close();
    }
    public static void registrarGasto (Scanner escolha, ArrayList<Gasto> lista) {
        System.out.println("\nSelecione a categoria:");
        System.out.println("1 - " + CATEGORIA_ALIMENTACAO);
        System.out.println("2 - " + CATEGORIA_TRANSPORTE);
        System.out.println("3 - " + CATEGORIA_MORADIA);
        System.out.println("4 - " + CATEGORIA_LAZER);
        System.out.println("5 - " + CATEGORIA_SAUDE);
        System.out.println("6 - " + CATEGORIA_EDUCACAO);
        System.out.println("7 - " + CATEGORIA_OUTROS);
        System.out.print("Digite o número da categoria: ");

        int opcaoCategoria = escolha.nextInt();
        escolha.nextLine(); 
        String categoria;

        switch (opcaoCategoria) {
            case 1: categoria = CATEGORIA_ALIMENTACAO; break;
            case 2: categoria = CATEGORIA_TRANSPORTE; break;
            case 3: categoria = CATEGORIA_MORADIA; break;
            case 4: categoria = CATEGORIA_LAZER; break;
            case 5: categoria = CATEGORIA_SAUDE; break;
            case 6: categoria = CATEGORIA_EDUCACAO; break;
            case 7: categoria = CATEGORIA_OUTROS; break;
            default:
                System.out.println(" Categoria inválida. Gasto não registrado.");
                return;
             }
        System.out.print("Valor (ex: 50.00): ");
        double valor = escolha.nextDouble();
        escolha.nextLine(); 

        System.out.print("Data (ex: 2025-07-12): ");
        String data = escolha.nextLine();

        System.out.print("Descrição: ");
        String descricao = escolha.nextLine();

        Gasto novo = new Gasto(categoria, valor, data, descricao);
        lista.add(novo);

        System.out.println("✅ Gasto registrado com sucesso!");
    }
     static class Gasto{
        //essa classe foi criada para ser um molde de Gasto para o objeto "new",
        //meio que aidicona os valores nesse molde (poo)
        String categoria;
        double valor;
        String data;
        String descricao;

            public Gasto(String categoriaGasto, double valorGasto, String dataGasto, String descricaoGasto) {
                //qualquer objeto pode usar esse construtor
                this.categoria = categoriaGasto; 
                //esse this é basicamente uma forma de deixar claro que é para usar o atributo
                this.valor = valorGasto;
                this.data = dataGasto;
                this.descricao = descricaoGasto;
    }
    }
      public static void gastosCategoria (Scanner escolha, ArrayList<Gasto> lista) { 
        System.out.println("--- VER GASTOS POR CATEGORIA ---");
        System.out.println("1 - " + CATEGORIA_ALIMENTACAO);
        System.out.println("2 - " + CATEGORIA_TRANSPORTE);
        System.out.println("3 - " + CATEGORIA_MORADIA);
        System.out.println("4 - " + CATEGORIA_LAZER);
        System.out.println("5 - " + CATEGORIA_SAUDE);
        System.out.println("6 - " + CATEGORIA_EDUCACAO);
        System.out.println("7 - " + CATEGORIA_OUTROS);
        System.out.print("Digite o número da categoria: ");

        int opcaoCategoria = escolha.nextInt();
        escolha.nextLine();
        String categoriaFiltrar;

        switch (opcaoCategoria) { // Usa o switch para transformar o número no nome da categoria
            case 1: categoriaFiltrar = CATEGORIA_ALIMENTACAO; break;
            case 2: categoriaFiltrar = CATEGORIA_TRANSPORTE; break;
            case 3: categoriaFiltrar = CATEGORIA_MORADIA; break;
            case 4: categoriaFiltrar = CATEGORIA_LAZER; break;
            case 5: categoriaFiltrar = CATEGORIA_SAUDE; break;
            case 6: categoriaFiltrar = CATEGORIA_EDUCACAO; break;
            case 7: categoriaFiltrar = CATEGORIA_OUTROS; break;
            default:
                System.out.println(" Categoria inválida. Não foi possível filtrar.");
                return;
         }
        boolean GastoNaCategoria = false; 

        if (lista.isEmpty()) {
            System.out.println("Nenhum gasto registrado ainda.");
        } else {
            
            for (Gasto gasto : lista) {
                
                if (gasto.categoria.equalsIgnoreCase(categoriaFiltrar)) {
                    
                    System.out.println("Categoria: " + gasto.categoria +
                                       ", Valor: R$" + String.format("%.2f", gasto.valor) +
                                       ", Data: " + gasto.data +
                                       ", Descrição: " + gasto.descricao);
                    GastoNaCategoria = true;
                }
            }

            if (!GastoNaCategoria) {
                System.out.println("Nenhum gasto encontrado para a categoria '" + categoriaFiltrar + "'.");
            }
        }
        System.out.println("--------------------------------");
        

    }
}