package exercicios.cem_questoes_poo.questao_14;

/**
 * @param args
 *
 * questão: Sakura realiza missões médicas de alto nível. Crie a classe Missao com descricao e rank. Implemente a subclasse MissaoMedica com o atributo nivelDificuldade (int).
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 *
 * @return "Missão: Salvar aldeia / Rank: A / Nível de Dificuldade: 9"
 */

public class Main {
    public static void main(String[] args) {
        MissaoMedica missaoSakura = new MissaoMedica("Salvar aldeia", 'A', 9);
        
        System.out.println("Missão: " + missaoSakura.getDescricao());
        System.out.println("Rank: " + missaoSakura.getRank());
        System.out.println("Nível de Dificuldade: " + missaoSakura.getNivelDificuldade());
    }
}