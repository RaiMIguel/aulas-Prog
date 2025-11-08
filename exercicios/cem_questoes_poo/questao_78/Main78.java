package exercicios.cem_questoes_poo.questao_78;

/**
 * @param args
 * * questão: O sistema deve registrar as transformações de cada ninja. Crie a classe NinjaTransformacoes com nome do ninja e lista de transformações.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Transformações de Naruto: Modo Sábio, Kyuubi"
 */
public class Main78 {
    public static void main(String[] args) {
        NinjaTransformacoes naruto = new NinjaTransformacoes("Naruto");

        naruto.adicionarTransformacao("Modo Sábio");
        naruto.adicionarTransformacao("Kyuubi");

        naruto.mostrarTransformacoes();
    }
}