package exercicios.cem_questoes_poo.questao_47;
/**
 * @param args
 *
 * questão: O sistema permite registrar times de ninjas com sensei responsável. Crie a classe TimeNinjaCompleto com lista de ninjas e nome do sensei.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 *
 * @return "Time formado por: Naruto, Sasuke, Sakura / Sensei: Kakashi"
 */
public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Ninjas: [“Naruto”, “Sasuke”, “Sakura”], Sensei: “Kakashi”
        TimeNinjaCompleto time7 = new TimeNinjaCompleto("Kakashi");
        
        time7.adicionarNinja("Naruto");
        time7.adicionarNinja("Sasuke");
        time7.adicionarNinja("Sakura");
        
        time7.mostrarTime();
    }
    
}
