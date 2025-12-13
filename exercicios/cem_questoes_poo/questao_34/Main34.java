package exercicios.cem_questoes_poo.questao_34;
/**
 * @param args
 *
 * questão: As missões podem ser fracassadas ou bem-sucedidas. Crie a interface StatusMissao com o método exibirStatus(). Implemente as classes MissaoCompleta e MissaoFracassada.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Status: Missão completa! Parabéns ninja! / Status: Missão fracassada. Tente novamente!"
 */
public class Main34 {
    public static void main(String[] args) {
        StatusMissao completa = new MissaoCompleta();
        StatusMissao fracassada = new MissaoFracassada();
        
        completa.exibirStatus();
        fracassada.exibirStatus();
    }
    
}
