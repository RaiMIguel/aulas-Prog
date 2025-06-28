package exercicios.exercicio_repeticao;

// (dicas do naruto) AVALIAÇÃO: 60/100
// (dicas do naruto) Pontos positivos: Uso correto de while e do-while
// (dicas do naruto) Pontos de melhoria: Formatação, nomenclatura de variáveis, lógica redundante e falta de comentários

public class task1 {
    // (dicas do naruto) DICA 1: Use nomes de classes em PascalCase (Task1 ao invés de task1)
    
    public static void main(String[] args) {
        // (dicas do naruto) DICA 2: Use nomes de variáveis mais descritivos (tentativa ao invés de i)
        int i = 1;
        while (i <= 5) {
            // (dicas do naruto) DICA 3: Melhore a formatação e indentação do código
            if (i < 5){
                // (dicas do naruto) DICA 4: Coloque as chaves na mesma linha para melhor legibilidade
                System.out.println("naruto está na tentativa: "+ i); 
                i++; // (dicas do naruto) DICA 5: Evite múltiplas operações na mesma linha
            }
            else {
                System.out.println("naruto conseguiu aprender o jutsu na "+i+" tentativa"); 
                i++;
            }
        }

        // (dicas do naruto) DICA 6: Use camelCase para nomes de variáveis (fomeNaruto ao invés de fome_naruto)
        int fome_naruto = 0; //fomeNaruto
        boolean satisfeito = false;
        do {
            fome_naruto++;
            System.out.println("naruto comeu "+fome_naruto+" lamem");
            // (dicas do naruto) DICA 7: Esta lógica pode ser simplificada: if (fome_naruto == 3) satisfeito = true;
            if (fome_naruto == 3)
                satisfeito = !satisfeito;
            // (dicas do naruto) DICA 8: Esta mensagem deveria estar dentro do if, pois só aparece quando está satisfeito
            System.out.println("naruto tá cheio já");
        } while (!satisfeito);
        
        // (dicas do naruto) DICA 9: Adicione comentários explicando o propósito de cada loop
        // (dicas do naruto) DICA 10: Considere usar enhanced for loops quando apropriado
    }
}
