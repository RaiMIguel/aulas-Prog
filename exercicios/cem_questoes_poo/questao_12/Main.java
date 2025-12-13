package exercicios.cem_questoes_poo.questao_12;

/**
 * @param args
 *
 * questão: Sasuke é um ninja Uchiha com poderes únicos. Crie a classe Ninja e a subclasse NinjaUchiha que contém o atributo privado poderKekkeiGenkai (String). Implemente todos os métodos de acesso necessários.
 * Objetivos**:
 * - Praticar encapsulamento
 * - Implementar herança
 *
 * @return "Nome: Sasuke / Idade: 16 / Poder Kekkei Genkai: Sharingan"
 */

public class Main {
    public static void main(String[] args) {

        NinjaUchiha sasuke = new NinjaUchiha("Sasuke", 16, "Sharingan");
        
        System.out.println("Nome: " + sasuke.getNome());
        System.out.println("Idade: " + sasuke.getIdade());
        System.out.println("Poder Kekkei Genkai: " + sasuke.getPoderKekkeiGenkai());
    }
}