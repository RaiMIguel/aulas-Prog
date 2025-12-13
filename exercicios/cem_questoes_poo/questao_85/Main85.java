package exercicios.cem_questoes_poo.questao_85;

/**
 * @param args
 * * questão: O sistema deve registrar as alianças entre aldeias. Crie a classe AliançasAldeias com nome da aldeia e lista de aldeias aliadas.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Aldeias aliadas de Konoha: Suna, Kiri"
 */
public class Main85 {
    public static void main(String[] args) {
        AliancasAldeias konoha = new AliancasAldeias("Konoha");

        konoha.adicionarAliada("Suna");
        konoha.adicionarAliada("Kiri");

        konoha.mostrarAliadas();
    }
}