package exercicios.cem_questoes_poo.questao_100;

/**
 * @param args
 * * questão: O sistema deve registrar os clãs e aldeias que formaram a aliança para derrotar Kaguya. Crie a classe AliancaContraKaguya com lista de clãs e lista de aldeias.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * - Composição de listas
 * * @return "Clãs que formaram a aliança contra Kaguya: Uchiha, Senju, Hyuga / Aldeias que formaram a aliança contra Kaguya: Konoha, Suna, Kiri"
 */
public class Main100 {
    public static void main(String[] args) {
        AliancaContraKaguya alianca = new AliancaContraKaguya();

        // Clãs
        alianca.adicionarCla("Uchiha");
        alianca.adicionarCla("Senju");
        alianca.adicionarCla("Hyuga");

        // Aldeias
        alianca.adicionarAldeia("Konoha");
        alianca.adicionarAldeia("Suna");
        alianca.adicionarAldeia("Kiri");

        alianca.mostrarAlianca();
    }
}