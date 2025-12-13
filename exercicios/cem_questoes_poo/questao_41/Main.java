package exercicios.cem_questoes_poo.questao_41;
/**
 * @param args
 *
 * questão: Ninjas podem ser classificados por rank. Crie uma enum chamada RankNinja com valores GENIN, CHUNIN, JOUNIN, KAGE. Crie a classe NinjaRank que recebe um nome e um rank.
 * Objetivos**:
 * - Encapsulamento
 * - Enumeração
 *
 * @return "Ninja Shikamaru tem o rank: JOUNIN"
 */
public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Nome: “Shikamaru”, Rank: “JOUNIN”
        NinjaRank shikamaru = new NinjaRank("Shikamaru", RankNinja.JOUNIN);
        
        shikamaru.mostrarRank();
    }    
}
