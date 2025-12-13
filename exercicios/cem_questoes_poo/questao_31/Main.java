package exercicios.cem_questoes_poo.questao_31;
/**
 * @param args
 *
 * questão: No universo ninja, existem diferentes tipos de times. Crie a interface TimeNinja com o método formarTime(). Implemente as classes TimeSete e TimeDez, que formam times com diferentes ninjas.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 * - Polimorfismo
 * - Abstração (interface)
 *
 * @return "Time 7 formado por Naruto, Sasuke, Sakura e Kakashi! / Time 10 formado por Shikamaru, Ino, Choji e Asuma!"
 */
public class Main {
    public static void main(String[] args) {
        TimeNinja time7 = new TimeSete();
        TimeNinja time10 = new TimeDez();
        
        time7.formarTime();
        time10.formarTime();
    }
    
}
