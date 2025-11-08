package exercicios.cem_questoes_poo.questao_60;

/**
 * @param args
 * * questão: O sistema deve registrar os times vencedores dos torneios. Crie a classe TorneioVencedores com nome do torneio e lista de times vencedores.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Vencedores do Exame Chunin: Time 10, Time 7"
 */
public class Main60 {
    public static void main(String[] args) {
        TorneioVencedores vencedores = new TorneioVencedores("Exame Chunin");

        vencedores.adicionarVencedor("Time 10");
        vencedores.adicionarVencedor("Time 7");

        vencedores.mostrarVencedores();
    }
}