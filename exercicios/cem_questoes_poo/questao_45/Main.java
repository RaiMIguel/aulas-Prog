package exercicios.cem_questoes_poo.questao_45;

public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Jutsus: [“Rasengan”, “Kage Bunshin”]
        NinjaJutsus naruto = new NinjaJutsus();
        
        naruto.aprenderJutsu("Rasengan");
        naruto.aprenderJutsu("Kage Bunshin");
        
        naruto.listarJutsus();
    }
    
}
