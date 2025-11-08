package exercicios.cem_questoes_poo.questao_13;

/**
 * @param args
 *
 * questão: Crie a classe base Jutsu com atributos privados nome e tipo. Implemente a subclasse JutsuAvancado, que adiciona o atributo nivel (int). Implemente todos os métodos de acesso.
 * Objetivos**:
 * - Encapsulamento
 * - Herança
 *
 * @return "Nome do Jutsu: Rasenshuriken / Tipo: Fuuton / Nível: 10"
 */

public class Main {
    public static void main(String[] args) {
        // Testa a subclasse JutsuAvancado
        JutsuAvancado rasenshuriken = new JutsuAvancado("Rasenshuriken", "Fuuton", 10);
        
        System.out.println("Nome do Jutsu: " + rasenshuriken.getNome());
        System.out.println("Tipo: " + rasenshuriken.getTipo());
        System.out.println("Nível: " + rasenshuriken.getNivel());
    }
}