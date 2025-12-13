package exercicios.cem_questoes_poo.questao_59;

public class NinjaPontuacao {
    private String nome;
    private int pontuacao;

    public NinjaPontuacao(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public void mostrarPontuacao() {
        System.out.println(nome + " tem pontuação " + pontuacao + " no torneio");
    }
}