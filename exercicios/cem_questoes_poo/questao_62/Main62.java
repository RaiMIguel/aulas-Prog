package exercicios.cem_questoes_poo.questao_62;

/**
 * @param args
 * * questão: O sistema deve registrar os treinamentos recebidos por cada ninja. Crie a classe NinjaTreinamentos com nome do ninja e lista de treinamentos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Treinamentos de Sakura: Força, Medicina"
 */
public class Main62 {
    public static void main(String[] args) {
        NinjaTreinamentos sakura = new NinjaTreinamentos("Sakura");

        sakura.adicionarTreinamento("Força");
        sakura.adicionarTreinamento("Medicina");

        sakura.mostrarTreinamentos();
    }
}