package exercicios.cem_questoes_poo.questao_22;

public class Main {
    public static void main(String[] args) {
        Jutsu jutsu1 = new KageBunshin();
        Jutsu jutsu2 = new Katon();
        Jutsu jutsu3 = new Suiton();

        jutsu1.executar();
        jutsu2.executar();
        jutsu3.executar();
    }
}
