package exercicios.exercicios_array;
import java.util.ArrayList;
public class Ex1_arraylist {
    public static void main(String[] args) {
        ArrayList<String>times_Ninja=new ArrayList<>();
        times_Ninja.add("time 7");
        times_Ninja.add("time 8");
        times_Ninja.add("time 10");
        times_Ninja.add("time gaara");
        
    for (int i = 0; i < times_Ninja.size(); i++) {
    System.out.println(times_Ninja.get(i));

}
    System.out.println("A nova lista é:");
    System.out.println(times_Ninja.size());
    times_Ninja.remove(2);
    
    for (int i = 0; i < times_Ninja.size(); i++) {
    System.out.println(times_Ninja.get(i));
    }
    System.out.println(times_Ninja.size());
  }   
}
