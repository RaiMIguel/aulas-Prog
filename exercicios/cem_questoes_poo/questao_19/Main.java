package exercicios.cem_questoes_poo.questao_19;

public class Main {
    public static void main(String[] args) {
        JutsuProibido edoTensei = new JutsuProibido("Edo Tensei", "Proibido", "Necromancia");
        
        System.out.println("Nome do Jutsu: " + edoTensei.getNome());
        System.out.println("Tipo: " + edoTensei.getTipo());
        System.out.println("Motivo da Proibição: " + edoTensei.getMotivoProibicao());
    }
}