package exercicios.cem_questoes_poo.questao_87;

/**
 * @param args
 * * questão: O sistema deve registrar os ninjas que já foram Hokage. Crie a classe HokagesKonoha com lista de nomes.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Hokages de Konoha: Hashirama, Tobirama, Hiruzen, Minato, Tsunade, Kakashi, Naruto"
 */
public class Main87 {
    public static void main(String[] args) {
        HokagesKonoha hokages = new HokagesKonoha();

        hokages.adicionarHokage("Hashirama");
        hokages.adicionarHokage("Tobirama");
        hokages.adicionarHokage("Hiruzen");
        hokages.adicionarHokage("Minato");
        hokages.adicionarHokage("Tsunade");
        hokages.adicionarHokage("Kakashi");
        hokages.adicionarHokage("Naruto");

        hokages.mostrarHokages();
    }
}