package exercicios.exercicios_algoritmosordenacao.bubble_merge_quick;

public class OrganizationStockQuick {
    private int comparisons;
    private int exchanges;

    public void orderById(Stock[] stocks, int left, int right){
        if (left == 0 && right == stocks.length - 1) {
            this.comparisons = 0;
            this.exchanges = 0;
        }

        if (left < right){

            int pivotIndex = partitionId(stocks, left, right);

            orderById(stocks,left, pivotIndex -1);
            orderById(stocks, pivotIndex + 1,right);
        }
    }
    private int partitionId(Stock[] stocks,int left,int right){
        Stock pivot = stocks[right];

        int i = left -1;
        for (int j = left; j < right; j++) {
            comparisons++;

            if (stocks[j].id <= pivot.id){
                i++;
                swap(stocks,i,j);
            }
        }
        swap(stocks, i + 1, right);
        return i +1;
    }

    public void orderByValue(Stock[]stocks, int left, int right){
        if (left == 0 && right == stocks.length - 1) {
            this.comparisons = 0;
            this.exchanges = 0;
        }

        if (left < right){
            int pivotIndex = partitionValue(stocks, left, right);

            orderByValue(stocks,left, pivotIndex -1);
            orderByValue(stocks, pivotIndex + 1,right);
        }
    }

    private int partitionValue(Stock[] stocks,int left,int right){
        Stock pivot = stocks[right];

        int i = left -1;
        for (int j = left; j < right; j++) {
            comparisons++;

            if (stocks[j].valueProduct <= pivot.valueProduct){
                i++;
                swap(stocks,i,j);
            }
        }
        swap(stocks, i + 1, right);
        return i +1;
    }

    public void orderByName (Stock[] stocks,int left, int right){
        if (left == 0 && right == stocks.length - 1) {
            this.comparisons = 0;
            this.exchanges = 0;
        }

        if (left < right){
            int pivotIndex = partitionName(stocks, left, right);

            orderByName(stocks,left, pivotIndex -1);
            orderByName(stocks, pivotIndex + 1,right);
        }
    }

    private int partitionName(Stock[] stocks,int left,int right){
        Stock pivot = stocks[right];

        int i = left -1;
        for (int j = left; j < right; j++) {
            comparisons++;

            if (stocks[j].name.compareTo(pivot.name) <= 0){
                i++;
                swap(stocks,i,j);
            }
        }
        swap(stocks, i + 1, right);
        return i +1;
    }

    private void swap(Stock[] stocks, int i, int j) {
        if (i != j) {
            Stock temp = stocks[i];
            stocks[i] = stocks[j];
            stocks[j] = temp;
            exchanges++;
        }
    }
    public void showStatistic (){
        System.out.println("\n--- ESTATÍSTICAS (QUICK SORT) ---");
        System.out.println("Comparações: " + this.comparisons);
        System.out.println("Movimentações: " + this.exchanges);
        System.out.println("---------------------------------");
    }
}
