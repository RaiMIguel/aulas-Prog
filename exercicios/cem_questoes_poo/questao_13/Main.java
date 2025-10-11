package exercicios.cem_questoes_poo.questao_13;

public class Main {
    public static void main(String[] args) {
        // Testa a subclasse JutsuAvancado
        JutsuAvancado rasenshuriken = new JutsuAvancado("Rasenshuriken", "Fuuton", 10);
        
        System.out.println("Nome do Jutsu: " + rasenshuriken.getNome());
        System.out.println("Tipo: " + rasenshuriken.getTipo());
        System.out.println("Nível: " + rasenshuriken.getNivel());
    }
}