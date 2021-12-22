package practices.generic;

import java.util.Arrays;

public class G02GenericMethods {
    public static void main(String[] args) {
        Integer[] intDizi = {1, 2, 3, 4, 5, 6, 7};
        Double[] doubleDizi = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charDizi = {'B', 'A', 'H', 'A', 'R'};
        System.out.println("integer dizi");
        diziYazdir(intDizi);
        System.out.println("double dizi");
        diziYazdir(doubleDizi);
        System.out.println("character dizi");
        diziYazdir(charDizi);

        System.out.println("******** classic methods **********");
        System.out.println(maxBul(3, 5, 11));

        System.out.println("******** generic methods **********");
        System.out.println(maxBulGeneric(3, 5, 7));//int  7
        System.out.println(maxBulGeneric(10.1, 5.3, 7.5));//double 10.1
        System.out.println(maxBulGeneric(3f, 1f, 24f));//float 24
        System.out.println(maxBulGeneric("23", "1", "24"));//String 24
    }
    // - Bir Generic (type özgü)  method tanımlanırken metodun dönüş tipinin önüne < T > (angle brackets) konulur.
    // - E - Element (used extensively by the Java Collections Framework)
    //   K - Key
    //   N - Number
    //   T - Type
    //   V - Value
    //   S,U,V etc. - 2nd, 3rd, 4th types kullanılan parametrik veri tipini göstermektedir
    // - Method'un  parametre listesinde Generic parametre tipleri kullanılır.
    // - Method parametre listeleri bir veya daha fazla olabilir ve virgülle ayrılarak yazılırlar.
    // - çoook önemli : Parametre tipleri non-primitif olmalıdır.
    // - JVM  derleyici, compile aşamasında generic methotu java byte kodlara çevirirken parametre tiplerini
    //   kaldırır ve yerine gerçek parametreleri koyar. Bu prosese erasure denilir.

    //Generic method declaration--> tek parametreli
    private static <T> void diziYazdir(T[] dizi) {
        Arrays.stream(dizi).forEach(System.out::println);
    }

    public static int maxBul(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    //Generic method cretae --> cok parametreli
    // - Generic veri tipleri sadece non-primitif olabilir.
    // - Binary operatörler (+, -,*, / ,<, >) ise non-primitif veri tiplerinde kullanılamazlar.
    // - Dolayısıyla bir generic metotta karşılaştırma için ne kullanılabilir?
    // - CEVAP: Comparable interface’i kullanılmalı.

    public static <T extends Comparable<T>> T maxBulGeneric(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
