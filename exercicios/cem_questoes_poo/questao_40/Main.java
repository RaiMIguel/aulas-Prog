package exercicios.cem_questoes_poo.questao_40;
/**
 * @param args
 *
 * questão: O sistema deve permitir promover ninjas para cargos de liderança. Crie a interface Promovivel com método promover(). Implemente a classe NinjaPromovido que registra nome, cargo anterior e novo cargo.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Naruto promovido de Genin para Hokage!"
 */
public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Nome: “Naruto”, Cargo anterior: “Genin”, Novo cargo: “Hokage”
        Promovivel naruto = new NinjaPromovido("Naruto", "Genin", "Hokage");
        
        naruto.promover();
    }
    
}
