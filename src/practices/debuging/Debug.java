package practices.debuging;

import java.util.*;
import java.util.stream.*;

public class Debug {
    public static void main(String[] args) {

        ebikGabik();

    }

    private static void ebikGabik() {
        List<Integer> sonuc= Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(i->i%2==0)  .map(i->i*3)

                .collect(Collectors.toList());
        System.out.println(sonuc);
    }
}
