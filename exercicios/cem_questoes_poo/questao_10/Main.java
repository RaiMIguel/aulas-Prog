package exercicios.cem_questoes_poo.questao_10;

public class Main {
    public static void main(String[] args) {
        JutsuProibido edoTensei = new JutsuProibido("Edo Tensei", 10);
        System.out.println("Nome: " + edoTensei.getNome());
        System.out.println("Nível de Perigo: " + edoTensei.getNivelPerigo());
    }
}