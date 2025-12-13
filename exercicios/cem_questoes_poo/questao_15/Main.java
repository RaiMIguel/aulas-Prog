package exercicios.cem_questoes_poo.questao_15;

/**
 * @param args
 *
 * questão: Kakashi é um sensei com alunos especiais. Crie a classe Sensei e a subclasse SenseiJounin, que possui o atributo alunoFavorito (String).
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 *
 * @return "Sensei: Kakashi / Especialidade: Sharingan / Aluno Favorito: Naruto"
 */

public class    Main {
    public static void main(String[] args) {
        SenseiJounin kakashi = new SenseiJounin("Kakashi", "Sharingan", "Naruto");
        
        System.out.println("Sensei: " + kakashi.getNome());
        System.out.println("Especialidade: " + kakashi.getEspecialidade());
        System.out.println("Aluno Favorito: " + kakashi.getAlunoFavorito());
    }
}