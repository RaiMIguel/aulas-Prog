package exercicios.cem_questoes_poo.questao_42;
/**
 * @param args
 *
 * questão: O sistema ninja deve listar todos os ninjas de uma aldeia. Crie a classe Aldeia que armazena uma lista de nomes de ninjas e um método para exibir todos.
 * Objetivos**:
 * - Encapsulamento
 * - Uso de coleções
 *
 * @return "Ninjas da aldeia: Naruto, Sasuke, Sakura"
 */
public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Ninjas: [“Naruto”, “Sasuke”, “Sakura”]
        Aldeia konoha = new Aldeia();
        
        konoha.adicionarNinja("Naruto");
        konoha.adicionarNinja("Sasuke");
        konoha.adicionarNinja("Sakura");
        
        konoha.listarNinjas();
    }
    
}
