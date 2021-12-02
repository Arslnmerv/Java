package practices.enums.EX03;

import java.util.ArrayList;

public class Ex03Main {
 // 1- Bir Kitap class'i create ediniz, fields : name ve kategori(Enum)
// 2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
// 3- 2 kitap tanımlayınız bir ArrayList e atınız.
// 4- bir kategoriye gore listeleyiniz.

    public static void main(String[] args) {

        Kitap ktp = new Kitap();
        ktp.name="Leyla Ile Mecnun";
        ktp.kategori = KitapKategori.ROMAN;
       // ktp.kitapKategori="Roman";

        Kitap ktp1 = new Kitap();
        ktp1.name="Koy Meydani";
        ktp1.kategori = KitapKategori.ROMAN;
       // ktp1.kitapKategori="roman";

        ArrayList <Kitap> kutuphane = new ArrayList<>();
        kutuphane.add(ktp);
        kutuphane.add(ktp1);

//        for (Kitap k: kutuphane) {
//            if (k.kitapKategori.equals("roman")) {
//                System.out.println(k.name);
//            }
//        }

        for (Kitap k:kutuphane) {

            if (k.kategori== KitapKategori.ROMAN) {
                System.out.println("Kutuphanenin romanlari " + k.name);
            }
        }
    }
}
