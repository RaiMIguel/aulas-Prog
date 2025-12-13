package exercicios.cem_questoes_poo.questao_96;

/**
 * @param args
 * * questão: O sistema deve registrar as técnicas de fuga usadas por ninjas em missões. Crie a classe MissaoTecnicasFuga com nome da missão e lista de técnicas de fuga.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Técnicas de fuga na missão Espionar Akatsuki: Henge no Jutsu, Shunshin"
 */
public class Main96 {
    public static void main(String[] args) {
        MissaoTecnicasFuga missao = new MissaoTecnicasFuga("Espionar Akatsuki");

        missao.adicionarTecnica("Henge no Jutsu");
        missao.adicionarTecnica("Shunshin");

        missao.mostrarTecnicas();
    }
}