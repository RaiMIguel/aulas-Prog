package exercicios.cem_questoes_poo.questao_47;

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
