package exercicios.cem_questoes_poo.questao_97;

/**
 * @param args
 * * questão: O sistema deve registrar os times que derrotaram a Akatsuki. Crie a classe AkatsukiDerrotadaPor com lista de times.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Times que derrotaram a Akatsuki: Time 7, Time Sannin"
 */
public class Main97 {
    public static void main(String[] args) {
        AkatsukiDerrotadaPor registro = new AkatsukiDerrotadaPor();

        registro.adicionarTime("Time 7");
        registro.adicionarTime("Time Sannin");

        registro.mostrarTimes();
    }
}