import java.util.Scanner;
import java.util.List;

public class Main {

    private static final UsuarioRepositorio REPOSITORY = new UsuarioRepositorio();
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    String option;

        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Sistema de Registro Shinobi");
            System.out.println("---------------------------------------------");
            System.out.println("1 - Adicionar novo usuário");
            System.out.println("2 - Listar todos os usuários");
            System.out.println("3 - Buscar usuário");
            System.out.println("4 - Editar usuário");
            System.out.println("5 - Excluir usuário");
            System.out.println("0 - Sair do Sistema");
            option = scan.nextLine();

            if(option.equals("1")){
                System.out.println("digite o nome: ");
                String name = scan.nextLine();
                System.out.println("digite o email: ");
                String email = scan.nextLine();
                System.out.println("digite a senha: ");
                String password = scan.nextLine();

                Shinobi newShinobi = new Shinobi(name,email,password,null, null);
                REPOSITORY.toAdd(newShinobi);
                System.out.println("Usuário registrado!!!");
            }
            if (option.equals("2")){
                System.out.println("\n--- Lista de Todos os Shinobis Registrados ---");
                List<Shinobi> lista = REPOSITORY.listUsers();
                if (lista.isEmpty()) {
                    System.out.println(" Nenhum usuário cadastrado.");
                } else {
                    lista.forEach(System.out::println);
                }
            }
        }
    }
}