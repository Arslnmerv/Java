package day46_Iteartor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>(Arrays.asList("z", "e", "h", "r", "a"));

        System.out.println("listin ilk hali " + l1);

        //l1 elemnanlrini for lopp kullanarak yazdiriniz...
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");

        }
        System.out.println();
        System.out.println("*********************");
//l1 elemnanlrini for each kullanarak yazdiriniz...
        for (String w : l1) {
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println("*********************");
//l1 elemnanlrini for lopp kullanarak her elemaninin yanina :-) yazdirip update yapiniz

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ":-)");

        }
        System.out.println();
        System.out.println(":-) sonrasi l1" + l1);//for lopp ile l1 elemanlari :-) concat edildigi halde
        // l1 degismedi update edilmedi


        List<String> l2 = new ArrayList<>(Arrays.asList("s", "a", "i", "d"));
        Iterator it1 = l2.iterator();//Iterator it1 veriable creat edildi it1 obj degildir. interface'den obj olmaz
        while (it1.hasNext()) {
            it1.next();
            it1.remove();
        }
        System.out.println("l2 nin iterator sonrasi:" + l2);//l2 nin iterator sonrasi:[]
    }}
