package exercicios.cem_questoes_poo.questao_25;
/**
 * @param args
 *
 * questão: As aldeias possuem diferentes rituais de saudação. Crie a classe base Aldeia com o método saudar(). Implemente as subclasses Konoha, Suna e Kiri com saudações diferentes.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 *
 * @return "Bem-vindo à Folha! / Bem-vindo à Areia! / Bem-vindo à Névoa!"
 */
public class Main25 {
    public static void main(String[] args) {
        Aldeia konoha = new Konoha();
        Aldeia suna = new Suna();
        Aldeia kiri = new Kiri();
        
        konoha.saudar();
        suna.saudar();
        kiri.saudar();
    }
}
