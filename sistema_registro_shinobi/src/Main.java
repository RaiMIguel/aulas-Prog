import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Arrays;
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

                System.out.print("quantas habilidades você possui?: ");
                int amount = scan.nextInt();
                scan.nextLine();
                String[] allAbilities = new String[amount];
                for (int i = 0; i < amount; i++) {
                    System.out.println("digite sua habilidade:"+(i+1));
                    String abilitie = scan.nextLine();
                    allAbilities[i] = abilitie;
                }
                List<String> abilities = Arrays.asList(allAbilities);
                Shinobi newShinobi = new Shinobi(name,email,password,abilities);

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
            if (option.equals("3")){
                System.out.println("\n--- Buscar Shinobi por ID ---");
                System.out.println("digite o id que você deseja buscar: ");
                long idSearch = scan.nextLong();
                scan.nextLine();
                System.out.println("buscando...");

                Shinobi searchResult = REPOSITORY.toSearchUserId(idSearch);

                if (searchResult == null){
                    System.out.println("Shinobi não encontrado! ");
                }
                else{
                    System.out.println(searchResult);
                }
            }
            if (option.equals("4")){
                System.out.println("\n--- Buscar editar Shinobi por ID ---");
                System.out.println("digite o id do Shinobi que você deseja editar: ");
                long idSearch = scan.nextLong();
                scan.nextLine();

                Shinobi original = REPOSITORY.toSearchUserId(idSearch);

                if (original == null) {
                    System.out.println("⚠️ Shinobi ID " + idSearch + " não encontrado para edição.");
                    return;
                }
                System.out.printf("qual item deseja editar?\n 1-nome\n2-email\n3-senha\n4-habilidades");
                int optionUpdate = scan.nextInt();
                scan.nextLine();

                switch (optionUpdate){
                    case 1:
                        System.out.print("Digite o novo nome: ");
                        String newName = scan.nextLine();
                        original.setName(newName); // Aplica Setter

                        if (REPOSITORY.toUpdate(original)) {
                            System.out.println("Nome atualizado com sucesso!");
                        } else {
                            System.out.println(" Falha ao persistir a mudança.");
                        }
                        break;
                    case 2:
                        System.out.print("Digite o novo email: ");
                        String newEmail = scan.nextLine();
                        original.setEmail(newEmail);

                        if (REPOSITORY.toUpdate(original)) {
                            System.out.println("Email atualizado com sucesso!");
                        } else {
                            System.out.println("Falha ao persistir a mudança.");
                        }
                        break;
                    case 3:
                        System.out.print("Digite a nova senha: ");
                        String newPassword = scan.nextLine();
                        original.setPassword(newPassword);

                        if (REPOSITORY.toUpdate(original)) {
                            System.out.println("Senha atualizada com sucesso!");
                        } else {
                            System.out.println("Falha ao persistir a mudança.");
                        }
                        break;
                    case 4:
                        System.out.print("Quantas NOVAS habilidades serão cadastradas? ");
                        int amount = scan.nextInt();
                        scan.nextLine();

                        String[] newAllAbilities = new String[amount];
                        for (int i = 0; i < amount; i++) {
                            System.out.print("Digite a Habilidade #" + (i + 1) + ": ");
                            String newAbilitie = scan.nextLine();
                            newAllAbilities[i] = newAbilitie;
                        }
                        List<String> newAbilities = Arrays.asList(newAllAbilities);
                        original.setabilities(newAbilities);

                        if (REPOSITORY.toUpdate(original)) {
                            System.out.println("Habilidades atualizadas com sucesso!");
                        } else {
                            System.out.println("Falha ao persistir a mudança.");
                        }
                        break;

                    default:
                        System.out.println("Opção de edição inválida.");
                        break;
                }
            }
             if (option.equals("5")){
                System.out.println("\n--- DISPENSAR SHINOBI ---");
                System.out.print("Digite o ID do Shinobi que você deseja excluir: ");
                long idSearch = scan.nextLong();
                scan.nextLine();
                System.out.println("Buscando e Excluindo...");

                if (REPOSITORY.toDelete(idSearch)) {
                    System.out.println("Shinobi ID " + idSearch + " dispensado com sucesso.");
                } else {
                    System.out.println("falha: Shinobi ID " + idSearch + " não encontrado.");
                }
            }
             if (option.equals("0")){
                break;
            }
            else {
                System.out.println("opção inválida!");
            }
        }
    }
}