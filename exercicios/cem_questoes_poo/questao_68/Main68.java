package exercicios.cem_questoes_poo.questao_68;
/**
 * @param args
 * * questão: O sistema deve registrar os líderes das aldeias ao longo do tempo. Crie a classe AldeiaLideres com nome da aldeia e lista de líderes.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Líderes da aldeia Konoha: Hashirama, Tobirama, Hiruzen, Minato, Tsunade, Kakashi, Naruto"
 */
public class Main68 {
    public static void main(String[] args) {
        AldeiaLideres konoha = new AldeiaLideres("Konoha");

        konoha.adicionarLider("Hashirama");
        konoha.adicionarLider("Tobirama");
        konoha.adicionarLider("Hiruzen");
        konoha.adicionarLider("Minato");
        konoha.adicionarLider("Tsunade");
        konoha.adicionarLider("Kakashi");
        konoha.adicionarLider("Naruto");

        konoha.mostrarLideres();
    }
}