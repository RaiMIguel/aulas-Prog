package exercicios.exercicios_algoritmosordenacao.bubble_merge_quick;

public class OrganizationStockBubble {
    private int exchanges;
    private int comparisons;


    //BubbleSort no estoque
    public void orderByValue (Stock[] stocks){
        int n = stocks.length;
        exchanges = 0;
        comparisons = 0;

        if (n <= 1) return;
        for (int i = 0; i < n - 1; i++) {
            boolean hasChange = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++;

                if (stocks[j].valueProduct > stocks[j+1].valueProduct){
                    Stock temp = stocks[j];
                    stocks[j] = stocks [j+1];
                    stocks[j+1] = temp;

                    exchanges++;
                    hasChange = true;
                }
            }
            if (!hasChange){
                break;
            }
        }
    }
    public void orderByName(Stock[] stocks){
        int n = stocks.length;
        exchanges = 0;
        comparisons = 0;

        for (int i = 0; i < n-1; i++) {
            boolean hasChange = false;
            for (int j = 0; j < n-1 - i; j++) {
                comparisons++;
                if (stocks[j].name.compareTo(stocks[j+1].name)>0){
                    Stock temp = stocks[j];
                    stocks[j] = stocks [j+1];
                    stocks[j+1] = temp;

                    exchanges++;
                    hasChange = true;
                }
            }
            if (!hasChange){
                break;
            }
        }
    }
    public void orderById(Stock[] stocks){
        int n = stocks.length;
        exchanges = 0;
        comparisons = 0;

        for (int i = 0; i < n-1; i++) {
            boolean hasChange = false;
            for (int j = 0; j < n-1-i; j++) {
                comparisons++;
                if (stocks[j].id > stocks[j+1].id){
                    Stock temp = stocks[j];
                    stocks[j] = stocks [j+1];
                    stocks[j+1] = temp;

                    exchanges++;
                    hasChange = true;
                }
            }
            if (!hasChange) break;
        }
    }
    public void showStatistics() {
        System.out.println("--- ESTATÍSTICAS DO BUBBLE SORT ---");
        System.out.println("Comparações realizadas: " + this.comparisons);
        System.out.println("Trocas realizadas: " + this.exchanges);
        System.out.println("----------------------------------");
    }

    public boolean existsId(Stock[] stocks, long id) {
        for (Stock s : stocks) {
            if (s != null && s.id == id) {
                return true;
            }
        }
        return false;
    }
}
