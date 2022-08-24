package mijn_Oefenen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_01 {

    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,-54,9,35,35,34));
    public static void main(String[] args) {
        toplam(numbers);
        carpim(numbers);

    }
    // Listedeki elemanlarin toplamini yazdiriniz.
    public static void toplam(List<Integer>list){
        System.out.println(list.stream().reduce(Integer::sum));
    }
   // List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void carpim(List<Integer>list){
        System.out.println(list.stream().filter(t->t%2==0).reduce(Math::multiplyExact));
    }


}
