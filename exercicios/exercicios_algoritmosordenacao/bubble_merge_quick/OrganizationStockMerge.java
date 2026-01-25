package exercicios.exercicios_algoritmosordenacao.bubble_merge_quick;

public class OrganizationStockMerge {
    private int comparisons;
    private int exchanges;

    public void OrderById(Stock[] stocks, int left, int right){
        if (left == 0 && right == stocks.length -1){
            comparisons = 0;
            exchanges = 0;
        }

        if (left < right) {
            int mid = left + (right - left) / 2;

            OrderById(stocks, left, mid);
            OrderById(stocks, mid + 1, right);

            mergeId(stocks, left, mid, right);
        }
    }

    private void mergeId(Stock[] stocks, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Stock [] leftArr =new Stock[n1];
        Stock [] rightArr = new Stock[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = stocks[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = stocks[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2){
            comparisons++;
            if (leftArr[i].id <= rightArr[j].id){
                stocks[k] = leftArr[i];
                i++;
            }else {
                stocks[k] = rightArr[j];
                j++;
            }
            exchanges++;
            k++;
        }
        while (i < n1){
            stocks[k] = leftArr[i];
            i++;
            k++;
            exchanges++;
        }
        while (j < n2){
            stocks[k] = rightArr[j];
            j++;
            exchanges++;
            k++;
        }
    }

    public void orderByValue (Stock[] stocks, int left, int right){
        if(left == 0 && right == stocks.length - 1){
            comparisons = 0;
            exchanges = 0;
        }
        if (left < right){
            int mid = left + (right - left)/2;

            orderByValue(stocks, left, mid);
            orderByValue(stocks, mid + 1, right);

            mergeValue(stocks, left, mid, right);
        }
    }

    private void mergeValue(Stock[] stocks, int left, int  mid, int right){
        int n1 = mid - left +1;
        int n2 = right - mid;

        Stock[] leftArr = new Stock[n1];
        Stock[] rightArr = new Stock[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = stocks[left +i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = stocks[mid + 1 + j];
        }

        int i = 0, j = 0 , k = left;
        while (i < n1 && j < n2){
            comparisons++;
            if (leftArr[i].valueProduct <= rightArr[j].valueProduct){
                stocks[k] = leftArr[i];
                i++;
            }else{
                stocks[k] = rightArr[j];
                j++;
            }
            exchanges++;
            k++;
        }
        while (i < n1){
            stocks[k] = leftArr[i];
            exchanges++;
            i++;
            k++;
        }
        while (j < n2){
            stocks[k] = rightArr[j];
            exchanges++;
            j++;
            k++;
        }
    }

    public void orderByName(Stock[] stocks, int left, int right){
        if (left == 0 && right == stocks.length - 1){
            comparisons = 0;
            exchanges = 0;
        }
        if (left < right){
            int mid = left + (right - left)/2;

            orderByName(stocks, left, mid);
            orderByName(stocks, mid +1 , right);

            mergeName(stocks, left, mid, right);
        }
    }

    private void mergeName(Stock[]stocks, int left, int mid,  int right){
        int n1 = mid - left +1;
        int n2 = right - mid;

        Stock[] leftArr = new Stock[n1];
        Stock[] rightArr = new Stock[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = stocks[left +i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = stocks[mid + 1 + j];
        }

        int i = 0, j = 0 , k = left;

        while (i < n1 && j < n2){
            comparisons++;
            if (leftArr[i].name.compareTo(rightArr[j].name)<=0){
                stocks[k] = leftArr[i];
                i++;
            }else{
                stocks[k] = rightArr[j];
                j++;
            }
            exchanges++;
            k++;
        }
        while (i < n1){
            stocks[k] = leftArr[i];
            exchanges++;
            i++;
            k++;
        }
        while (j < n2){
            stocks[k] = rightArr[j];
            exchanges++;
            j++;
            k++;
        }
    }

    public void showStatistic (){
        System.out.println("\n--- ESTATÍSTICAS (MERGE SORT) ---");
        System.out.println("Comparações: " + this.comparisons);
        System.out.println("Movimentações: " + this.exchanges);
        System.out.println("---------------------------------");
    }
}
