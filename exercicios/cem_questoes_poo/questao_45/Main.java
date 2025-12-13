package exercicios.cem_questoes_poo.questao_45;
/**
 * @param args
 *
 * questão: Cada ninja pode aprender múltiplos jutsus. Crie a classe NinjaJutsus com lista de jutsus e métodos para adicionar e mostrar todos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 *
 * @return "Jutsus do ninja: Rasengan, Kage Bunshin"
 */
public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Jutsus: [“Rasengan”, “Kage Bunshin”]
        NinjaJutsus naruto = new NinjaJutsus();
        
        naruto.aprenderJutsu("Rasengan");
        naruto.aprenderJutsu("Kage Bunshin");
        
        naruto.listarJutsus();
    }
    
}
