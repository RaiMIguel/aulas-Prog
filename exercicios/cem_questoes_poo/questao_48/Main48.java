package exercicios.cem_questoes_poo.questao_48;
/**
 * @param args
 *
 * questão: O sistema permite registrar aldeias com líder e número de ninjas. Crie a classe AldeiaInfo com nome, líder e quantidade de ninjas.
 * Objetivos**:
 * - Encapsulamento
 *
 * @return "Aldeia: Konoha / Líder: Hokage / Quantidade de ninjas: 100"
 */
public class Main48 {
    public static void main(String[] args) {
        // Entrada Simulada: Nome: “Konoha”, Líder: “Hokage”, Ninjas: 100
        AldeiaInfo konoha = new AldeiaInfo("Konoha", "Hokage", 100);
        
        konoha.mostrarInfo();
    }    
}
