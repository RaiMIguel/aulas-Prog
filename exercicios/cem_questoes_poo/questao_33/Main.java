package exercicios.cem_questoes_poo.questao_33;

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
