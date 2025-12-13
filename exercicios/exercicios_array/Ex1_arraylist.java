package exercicios.exercicios_array;
import java.util.ArrayList;

// (dicas do naruto) AVALIAÇÃO: 70/100
// (dicas do naruto) Pontos positivos: Uso correto do ArrayList, métodos add(), remove(), size()
// (dicas do naruto) Pontos de melhoria: Nomenclatura de variáveis, formatação e falta de comentários explicativos

public class Ex1_arraylist {
    // (dicas do naruto) DICA 1: Use nomes de classes em PascalCase sem underscore (Ex1ArrayList)
    
    public static void main(String[] args) {
        // (dicas do naruto) DICA 2: Use camelCase para variáveis (timesNinja ao invés de times_Ninja)
        // (dicas do naruto) DICA 3: Adicione espaços para melhor legibilidade: ArrayList<String> timesNinja = new ArrayList<>();
        ArrayList<String>times_Ninja=new ArrayList<>();
        
        // (dicas do naruto) DICA 4: Bom uso do método add()!
        times_Ninja.add("time 7");
        times_Ninja.add("time 8");
        times_Ninja.add("time 10");
        times_Ninja.add("time gaara");
        
        // (dicas do naruto) DICA 5: Adicione comentários explicando cada seção
        // Imprimindo todos os times
        for (int i = 0; i < times_Ninja.size(); i++) {
            System.out.println(times_Ninja.get(i));
        }

        System.out.println("A nova lista é:");
        System.out.println(times_Ninja.size());
        
        // (dicas do naruto) DICA 6: Excelente uso do método remove()!
        times_Ninja.remove(2);
        
        // (dicas do naruto) DICA 7: Considere usar enhanced for loop: for(String time : times_Ninja)
        for (int i = 0; i < times_Ninja.size(); i++) {
            System.out.println(times_Ninja.get(i));
        }
        
        // (dicas do naruto) DICA 8: Adicione mensagens mais descritivas
        System.out.println(times_Ninja.size());
        
        // (dicas do naruto) DICA 9: Considere adicionar mais operações como contains(), indexOf(), clear()
        // (dicas do naruto) DICA 10: Muito bom trabalho com ArrayList! Continue praticando!
    }   
}
