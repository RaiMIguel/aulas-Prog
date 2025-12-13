package exercicios.cem_questoes_poo.questao_93;

/**
 * @param args
 * * questão: O sistema deve registrar os clãs extintos de cada aldeia. Crie a classe AldeiaClasExtintos com nome da aldeia e lista de clãs extintos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Clãs extintos de Konoha: Senju, Kurama"
 */
public class Main93 {
    public static void main(String[] args) {
        AldeiaClasExtintos konoha = new AldeiaClasExtintos("Konoha");

        konoha.adicionarClaExtinto("Senju");
        konoha.adicionarClaExtinto("Kurama");

        konoha.mostrarClasExtintos();
    }
}