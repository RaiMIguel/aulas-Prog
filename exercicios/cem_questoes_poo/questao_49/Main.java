package exercicios.cem_questoes_poo.questao_49;
/**
 * @param args
 *
 * questão: O sistema permite registrar jutsus proibidos com quem os criou. Crie a classe JutsuProibidoCriador com nome do jutsu e nome do criador.
 * Objetivos**:
 * - Encapsulamento
 *
 * @return "Jutsu proibido: Edo Tensei / Criador: Orochimaru"
 */
public class Main{
    public static void main(String[] args) {
        // Entrada Simulada: Jutsu: “Edo Tensei”, Criador: “Orochimaru”
        JutsuProibidoCriador edoTensei = new JutsuProibidoCriador("Edo Tensei", "Orochimaru");
        
        edoTensei.mostrarInfo();
    }    
}
