package exercicios.cem_questoes_poo.questao_19;
/**
 * @param args
 *
 * questão: Orochimaru é conhecido por jutsus proibidos. Crie a classe Jutsu e uma subclasse JutsuProibido com o atributo motivoProibicao (String).
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 *
 * @return "Nome do Jutsu: Edo Tensei / Tipo: Proibido / Motivo da Proibição: Necromancia"
 */
public class Main {
    public static void main(String[] args) {
        JutsuProibido edoTensei = new JutsuProibido("Edo Tensei", "Proibido", "Necromancia");
        
        System.out.println("Nome do Jutsu: " + edoTensei.getNome());
        System.out.println("Tipo: " + edoTensei.getTipo());
        System.out.println("Motivo da Proibição: " + edoTensei.getMotivoProibicao());
    }
}