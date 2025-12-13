package exercicios.cem_questoes_poo.questao_33;
/**
 * @param args
 *
 * questão: Os ninjas podem possuir mais de uma habilidade especial. Crie a interface MultiHabilidade com o método listarHabilidades(). Implemente a classe NinjaMulti, que armazena uma lista de habilidades especiais.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 * - Uso de coleções (ArrayList)
 *
 * @return "Habilidades do ninja Naruto: Rasengan, Modo Sábio, Kyuubi"
 */
public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Nome: “Naruto”, Habilidades: [“Rasengan”, “Modo Sábio”, “Kyuubi”]
        NinjaMulti naruto = new NinjaMulti("Naruto");
        naruto.addHabilidade("Rasengan");
        naruto.addHabilidade("Modo Sábio");
        naruto.addHabilidade("Kyuubi");
        
        naruto.listarHabilidades();
    }
    
}
