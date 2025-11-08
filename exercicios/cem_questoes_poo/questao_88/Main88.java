package exercicios.cem_questoes_poo.questao_88;

/**
 * @param args
 * * questão: O sistema deve registrar os ninjas que já foram Kazekage. Crie a classe KazekagesSuna com lista de nomes.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Kazekages de Suna: Rasa, Gaara"
 */
public class Main88 {
    public static void main(String[] args) {
        KazekagesSuna kazekages = new KazekagesSuna();

        kazekages.adicionarKazekage("Rasa");
        kazekages.adicionarKazekage("Gaara");

        kazekages.mostrarKazekages();
    }
}