package practices.enums.EX04;

public class Ex04Main {
    public static void main(String[] args) {

        Aylar ay = Aylar.SUBAT;

        ay.getGunMiktari();
        System.out.println("secilen ay gun sayisi : " +ay.days);
        System.out.println("secilen ay : " +ay);

    /*
    Enum olmasaydi bu sekilde switch case yapacaktik

        switch (ay) {
            case SUBAT:
                System.out.println("Bu ay 28 gundur");
                break;   */

        }
    }
