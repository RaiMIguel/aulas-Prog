package exercicios.cem_questoes_poo.questao_42;

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
