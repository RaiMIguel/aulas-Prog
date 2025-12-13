package exercicios.cem_questoes_poo.questao_36;
/**
 * @param args
 *
 * questão: Cada jutsu pode ser classificado por poder. Crie a interface Classificavel com método classificarPoder(). Implemente a classe JutsuClassificado que recebe o nome do jutsu e seu nível de poder.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Jutsu Amaterasu classificado como poder 10!"
 */
public class Main36 {
    public static void main(String[] args) {
        Classificavel amaterasu = new JutsuClassificado("Amaterasu", 10);
        
        amaterasu.classificarPoder();
    }    
}
