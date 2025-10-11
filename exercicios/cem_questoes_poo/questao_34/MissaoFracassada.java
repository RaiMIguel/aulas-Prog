package exercicios.cem_questoes_poo.questao_34;

public class MissaoFracassada implements StatusMissao {
    @Override
    public void exibirStatus() {
        System.out.println("Status: Missão fracassada. Tente novamente!");
    }
    
}
