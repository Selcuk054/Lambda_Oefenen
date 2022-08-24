package lambda_Functional_Programming;

import java.util.ArrayList;
import java.util.Comparator;
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
        tekrarsizCiftlerinKupununCarpimi(list);
        enBuyukDegeriBul(list);
        enKucukDegeriBul(list);

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
    //Vraag 6-) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftlerinKupununCarpimi (List <Integer> list){
        Integer carpim =list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println("Carpim :"+carpim);
    }
    //Vraag 7-) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void enBuyukDegeriBul (List<Integer>list){
        //1.yol
        Integer max =list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
        //2.yol
        Integer max2=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u );
        System.out.println("Maximum :" +max);
    }
    //Vraag 8-) List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    public static void enKucukDegeriBul (List<Integer>list){
        Integer min=list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("min = " + min);
    }






}
