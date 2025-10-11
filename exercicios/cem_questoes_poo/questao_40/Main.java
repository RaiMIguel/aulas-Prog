package exercicios.cem_questoes_poo.questao_40;

public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Nome: “Naruto”, Cargo anterior: “Genin”, Novo cargo: “Hokage”
        Promovivel naruto = new NinjaPromovido("Naruto", "Genin", "Hokage");
        
        naruto.promover();
    }
    
}
