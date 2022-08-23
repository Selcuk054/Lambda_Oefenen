package lambdaOefenen_01;

import java.util.ArrayList;
import java.util.List;

public class Oefenen_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        System.out.println(list);
        listElemanlariniYazdir(list);
        System.out.println();
        ciftElamanlariYazdir(list);
        System.out.println();
        tekElemanlarinKaresiYazdir(list);
        System.out.println();
        tekrarsizTekElemanlarinkupleri(list);
        System.out.println();
        tekrarsizCiftlerinKareleriniToplayanMethod(list);

    }

    // Vraag 1-) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    //           bir method oluşturun.(Functional)
    public static void listElemanlariniYazdir (List<Integer> list){
        list.stream().forEach(t-> System.out.print(t +" "));
    }
    //Vraag 2-) Cift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void ciftElamanlariYazdir(List<Integer>list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t +" "));
    }
    //vraag 3-) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekElemanlarinKaresiYazdir (List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t +" "));
    }
    //Vraag 4-) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinkupleri (List <Integer>list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //Vraag 5-)Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftlerinKareleriniToplayanMethod (List <Integer> list){
        Integer toplam =list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println("Toplam "+toplam);
    }






}
