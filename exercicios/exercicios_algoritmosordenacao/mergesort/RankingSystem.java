package exercicios.exercicios_algoritmosordenacao.mergesort;

public class RankingSystem {
    private int comparisons = 0;
    private int movements = 0;

    public void orderByPower(Ninja[] ninjas, int left, int right) {
        if (left == 0 && right == ninjas.length - 1) {
            this.comparisons = 0;
            this.movements = 0;
        }

        if (left < right) {
            int mid = left + (right - left) / 2;

            orderByPower(ninjas, left, mid);
            orderByPower(ninjas, mid + 1, right);

            mergePower(ninjas, left, mid, right);
        }
    }

    private void mergePower(Ninja[] ninjas, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Ninja[] leftArr = new Ninja[n1];
        Ninja[] rightArr = new Ninja[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = ninjas[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = ninjas[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            comparisons++;
            if (leftArr[i].powerChakra <= rightArr[j].powerChakra) {
                ninjas[k] = leftArr[i];
                i++;
            } else {
                ninjas[k] = rightArr[j];
                j++;
            }
            movements++;
            k++;
        }

        while (i < n1) { ninjas[k] = leftArr[i]; i++; k++; movements++; }
        while (j < n2) { ninjas[k] = rightArr[j]; j++; k++; movements++; }
    }


    public void orderByName(Ninja[] ninjas, int left, int right) {
        if (left == 0 && right == ninjas.length - 1) {
            this.comparisons = 0;
            this.movements = 0;
        }

        if (left < right) {
            int mid = left + (right - left) / 2;

            orderByName(ninjas, left, mid);
            orderByName(ninjas, mid + 1, right);

            mergeName(ninjas, left, mid, right);
        }
    }

    private void mergeName(Ninja[] ninjas, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Ninja[] leftArr = new Ninja[n1];
        Ninja[] rightArr = new Ninja[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = ninjas[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = ninjas[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            comparisons++;
            if (leftArr[i].name.compareTo(rightArr[j].name) <= 0) {
                ninjas[k] = leftArr[i];
                i++;
            } else {
                ninjas[k] = rightArr[j];
                j++;
            }
            movements++;
            k++;
        }

        while (i < n1) { ninjas[k] = leftArr[i]; i++; k++; movements++; }
        while (j < n2) { ninjas[k] = rightArr[j]; j++; k++; movements++; }
    }

    public void showStatistics() {
        System.out.println("\n--- ESTATÍSTICAS (MERGE SORT) ---");
        System.out.println("Comparações: " + this.comparisons);
        System.out.println("Movimentações: " + this.movements);
        System.out.println("---------------------------------");
    }

    public Ninja[] listTop3(Ninja[] ninjas) {
        orderByPower(ninjas, 0, ninjas.length - 1);
        int n = ninjas.length;
        int size = Math.min(3, n);
        Ninja[] top3 = new Ninja[size];
        for (int i = 0; i < size; i++) {
            top3[i] = ninjas[n - 1 - i];
        }
        return top3;
    }
}