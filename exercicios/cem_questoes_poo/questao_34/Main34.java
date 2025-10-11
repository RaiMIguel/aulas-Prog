package exercicios.cem_questoes_poo.questao_34;

public class Main34 {
    public static void main(String[] args) {
        StatusMissao completa = new MissaoCompleta();
        StatusMissao fracassada = new MissaoFracassada();
        
        completa.exibirStatus();
        fracassada.exibirStatus();
    }
    
}
