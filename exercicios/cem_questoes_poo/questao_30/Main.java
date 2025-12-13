package exercicios.cem_questoes_poo.questao_30;
/**
 * @param args
 *
 * questão: Toda aldeia tem um ritual especial. Crie a classe abstrata Aldeia com método abstrato ritual(). Implemente as classes Konoha e Suna.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (classe abstrata)
 *
 * @return "Konoha faz ritual da Folha! / Suna faz ritual da Areia!"
 */
public class Main {
    public static void main(String[] args) {
        Aldeia konoha = new Konoha();
        Aldeia suna = new Suna();
        
        konoha.ritual();
        suna.ritual();
    }    
}
