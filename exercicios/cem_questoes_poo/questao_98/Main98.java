package exercicios.cem_questoes_poo.questao_98;

/**
 * @param args
 * * questão: O sistema deve registrar os senseis que participaram da guerra ninja. Crie a classe GuerraNinjaSenseis com lista de senseis.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Senseis que participaram da guerra ninja: Kakashi, Guy, Orochimaru"
 */
public class Main98 {
    public static void main(String[] args) {
        GuerraNinjaSenseis senseis = new GuerraNinjaSenseis();

        senseis.adicionarSensei("Kakashi");
        senseis.adicionarSensei("Guy");
        senseis.adicionarSensei("Orochimaru");

        senseis.mostrarSenseis();
    }
}