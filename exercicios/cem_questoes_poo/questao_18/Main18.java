package exercicios.cem_questoes_poo.questao_18;

public class Main18 {
    public static void main(String[] args) {
        NinjaHyuga hinata = new NinjaHyuga("Hinata", 16, "Hyuga");
        
        System.out.println("Nome: " + hinata.getNome());
        System.out.println("Idade: " + hinata.getIdade());
        System.out.println("Clã: " + hinata.getClan());
    }
}