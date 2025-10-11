package exercicios.cem_questoes_poo.questao_43;

public class Main {
    public static void main(String[] args) {
        // Entrada Simulada: Participantes: [“Naruto”, “Sasuke”]
        Missao missao = new Missao();
        
        missao.adicionarParticipante("Naruto");
        missao.adicionarParticipante("Sasuke");
        
        missao.listarParticipantes();
    }    
}
