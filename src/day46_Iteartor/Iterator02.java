package day46_Iteartor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));
        System.out.println("ilk hali: " + list);
        ListIterator lt1 = list.listIterator();//listıterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi
        while (lt1.hasNext()) {
            String depo = (String) lt1.next();
            lt1.set(depo + ":-)");//list elemnalrini update etti
        }
        System.out.println("uodate hali : " + list);
        List<String> list1 = new ArrayList<>(Arrays.asList("m", "e", "l", "i", "h", "a"));
        //son elemanina :-) ile update ediniz, elemanlarini sondan basa dogru yazdiriniz--> :-) a h i l e m
        System.out.println("ilk hali: " + list1);
        ListIterator lt2 = list1.listIterator();//listıterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi
        while (lt2.hasNext()) {
            String depo = (String) lt2.next();
            if (!lt2.hasNext()) {
                lt2.set(":-)" + depo);
            }
        }
        while (lt2.hasPrevious()) {
            String depo = (String) lt2.previous();//kursorun oncesi elemani return eder. ve cursoru oncesine getirir
            System.out.print(depo + " ");//:-)a h i l e m
        }
/*
ahan da trick --> hasPrevious() ve previous() method'larinin calimasi icin oncesinde
MUTLAKA KESİNLİKLE hasNext() ve next();method'lari calistirilarak cursor(pointer) en sona getirilmeli
"ITERATOR" ve "LISTITERATOR" arasi farklar :
1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir
    "LISTITERATOR"  ise hasNext(), next(),remove() hasPrevius(), Previus(), add(); set()  method'rini içerir.
2) "LISTITERATOR" sadece list'ler cin kullanilir.
    "ITERATOR" ise tum collection(list set map) elemanlari icin kullanilir
3) "ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift yonlu gitmek icin kullanilir.
 */
        System.out.println();
        System.out.println(list1);//[m, e, l, i, h, :-)a]
    }
}
