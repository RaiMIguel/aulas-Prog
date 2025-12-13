package exercicios.cem_questoes_poo.questao_74;

/**
 * @param args
 * * questão: O sistema deve registrar as técnicas proibidas de cada aldeia. Crie a classe AldeiaTecnicasProibidas com nome da aldeia e lista de técnicas proibidas.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Técnicas proibidas de Konoha: Edo Tensei, Kuchiyose"
 */
public class Main74 {
    public static void main(String[] args) {
        AldeiaTecnicasProibidas konoha = new AldeiaTecnicasProibidas("Konoha");

        konoha.adicionarTecnica("Edo Tensei");
        konoha.adicionarTecnica("Kuchiyose");

        konoha.mostrarTecnicas();
    }
}