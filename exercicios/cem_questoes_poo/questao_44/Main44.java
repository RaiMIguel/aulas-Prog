package exercicios.cem_questoes_poo.questao_44;
/**
 * @param args
 *
 * questão: O sistema deve permitir registrar e consultar senseis de uma aldeia. Crie a classe AldeiaSenseis que armazena uma lista de senseis e métodos para adicionar e listar.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 *
 * @return "Senseis da aldeia: Kakashi, Asuma"
 */
public class Main44 {
    public static void main(String[] args) {
        // Entrada Simulada: Senseis: [“Kakashi”, “Asuma”]
        AldeiaSenseis aldeia = new AldeiaSenseis();
        
        aldeia.adicionarSensei("Kakashi");
        aldeia.adicionarSensei("Asuma");
        
        aldeia.listarSenseis();
    }
    
}
