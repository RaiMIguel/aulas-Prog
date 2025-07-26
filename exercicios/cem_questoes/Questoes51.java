import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questoes51 {
    public static void main(String[] args) {
        int[] original = {1, 3, 2, 3, 4, 2, 5, 1};
        
        System.out.println("Array original: " + Arrays.toString(original));
        System.out.println("Removendo duplicatas...");

        List<Integer> semDuplicatasList = new ArrayList<>();
        int duplicatasRemovidas = 0;

        for (int i = 0; i < original.length; i++) {
            boolean jaExiste = false;
            for (int j = 0; j < semDuplicatasList.size(); j++) {
                if (semDuplicatasList.get(j) == original[i]) {
                    jaExiste = true;
                    break;
                }
            }
            if (!jaExiste) {
                semDuplicatasList.add(original[i]);
            } else {
                duplicatasRemovidas++;
            }
        }
        
        System.out.println("Array sem duplicatas: " + semDuplicatasList.toString());
        System.out.println("Elementos removidos: " + duplicatasRemovidas + " duplicatas");
    }
}