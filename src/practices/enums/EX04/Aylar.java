package practices.enums.EX04;

public enum Aylar {

    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);

    int days;
    /*
    22-24 komut blogu atama yapildiginda run olur.
     Aylar (int gunMiktari )  {days=gunMiktari;}
     */

    Aylar (int gunMiktari )  {
        days=gunMiktari;
    }

    void getGunMiktari () {
        System.out.println("gun miktari: " + days);

    }
}