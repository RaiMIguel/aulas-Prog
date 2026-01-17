package exercicios.exercicios_algoritmosordenacao.bubblesort;

public class RankingSystem {
    private int exchanges = 0;
    private int comparisons = 0;

    private int convertRankToValue(String rank) {
        switch (rank) {
            case "S":
                return 5;
            case "A":
                return 4;
            case "B":
                return 3;
            case "C":
                return 2;
            case "D":
                return 1;
            default:
                return 0;
        }
    }

    public void orderByPower(Ninja[] ninjas) {
        int n = ninjas.length;
        this.exchanges = 0;
        this.comparisons = 0;

        if (n <= 1) return;

        for (int i = 0; i < n - 1; i++) {
            boolean hasChange = false;

            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++;

                if (ninjas[j].powerChakra > ninjas[j + 1].powerChakra) {

                    Ninja temp = ninjas[j];   //um lugarzinho para por a caixa durante a mudança deixando o espaço livre
                    ninjas[j] = ninjas[j + 1];
                    ninjas[j + 1] = temp;

                    exchanges++;
                    hasChange = true;
                }
            }

            if (!hasChange) break;
        }
    }

    public void orderByName(Ninja[] ninjas) {
        int n = ninjas.length;
        this.exchanges = 0;
        this.comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean hasChange = false;

            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++;

                if (ninjas[j].name.compareTo(ninjas[j + 1].name) > 0) {

                    Ninja temp = ninjas[j];
                    ninjas[j] = ninjas[j + 1];
                    ninjas[j + 1] = temp;

                    exchanges++;
                    hasChange = true;
                }
            }
            if (!hasChange) break;
        }
    }

    public void orderByRank(Ninja[] ninjas) {
        this.exchanges = 0;

        int n = ninjas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                int valueJ = convertRankToValue(ninjas[j].rank);
                int valueNext = convertRankToValue(ninjas[j + 1].rank);

                if (valueJ < valueNext) {
                    Ninja temp = ninjas[j];
                    ninjas[j] = ninjas[j + 1];
                    ninjas[j + 1] = temp;
                }
            }
        }
    }

    public void showStatistics() {
        System.out.println("--- ESTATÍSTICAS DO BUBBLE SORT ---");
        System.out.println("Comparações realizadas: " + this.comparisons);
        System.out.println("Trocas realizadas: " + this.exchanges);
        System.out.println("----------------------------------");
    }

    public Ninja[] listTop3(Ninja[] ninjas) {
        orderByPower(ninjas);
        int n = ninjas.length;
        int size = Math.min(3, n);
        Ninja[] top3 = new Ninja[size];

        for (int i = 0; i < size; i++) {
            //for para pegar apenas os últimos que seriam os mais fortes no array
            top3[i] = ninjas[n - 1 - i];
        }
        return top3;
    }
}