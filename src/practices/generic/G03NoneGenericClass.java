package practices.generic;

import java.util.*;

public class G03NoneGenericClass {
    public static void main(String[] args) {

        List liste = new ArrayList(); //java 5 öncesiolan raw list...
        liste.add("yagmur hanım");
        liste.add(571622);

        System.out.println(liste);//[yagmur hanım, 571622]

        String devName = (String) liste.get(0); //casting
        Integer tel = (Integer) liste.get(1);//casting
        System.out.println(devName + " " + tel);//yagmur hanım 571622

        liste.add(7.4);
        System.out.println((Integer) liste.get(2)); //ClassCastException

        List<Object> objList = new ArrayList<>();
        objList.add("bahar hanım");
        objList.add(2021);
        String uzman = (String) liste.get(0);
        Integer trh = (Integer) liste.get(1); //casting

        for (Object each : objList) {
            String yazi = (String) each;
            System.out.println(yazi); //RTE  ClassCastException
        }

    }
}
