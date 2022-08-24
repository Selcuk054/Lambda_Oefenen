package mijn_Oefenen_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class P_01 {
    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,-54,9,35,35,34));
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih","Ersin","Mevlit"));

    public static void main(String[] args) {
        toplam(numbers);
        carpim(numbers);
        tekSayilarinKaresiniBuyuktenKucuge(numbers);

    }
    // Listedeki elemanlarin toplamini yazdiriniz.
    public static void toplam(List<Integer>list){
        System.out.println(list.stream().reduce(Integer::sum));
    }
   // List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void carpim(List<Integer>list){
        System.out.println(list.stream().filter(t->t%2==0).reduce(Math::multiplyExact));
    }
    //tek sayilarin lerin karesini buyukten kucuge yazdiriniz.

    public static void tekSayilarinKaresiniBuyuktenKucuge(List<Integer>list){
       // System.out.println(list.stream().filter(t -> t % 2 != 0).map(t -> t * t).sorted(Comparator.reverseOrder())); //java.util.stream.SortedOps$OfRef@8efb846
        //Burada baska bir yerde yazdir methodu ile yapilirsa referans degeri alinmayabilir. Asagida hemen yazdir methodu olusturuldu.
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(P_01::yazdir);
    }
    public static void yazdir(Object obj){
        System.out.print(obj+ " ");
    }
    // List elemanlarini alfabetik buyuk harf ve tekrarsiz print ediniz.

    public static void alfabetikBuyukHarfTekrarsizYazdir(List<Integer>list){
        list.stream();
    }



}
