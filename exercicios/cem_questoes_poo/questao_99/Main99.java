package exercicios.cem_questoes_poo.questao_99;

/**
 * @param args
 * * questão: O sistema deve registrar os ninjas que participaram da guerra ninja. Crie a classe GuerraNinjaNinjas com lista de ninjas.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 * * @return "Ninjas que participaram da guerra ninja: Naruto, Sasuke, Sakura"
 */
public class Main99 {
    public static void main(String[] args) {
        GuerraNinjaNinjas ninjas = new GuerraNinjaNinjas();

        ninjas.adicionarNinja("Naruto");
        ninjas.adicionarNinja("Sasuke");
        ninjas.adicionarNinja("Sakura");

        ninjas.mostrarNinjas();
    }
}