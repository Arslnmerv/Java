package practices.enums.EX02;

public class Ex02Main {
    public static void main(String[] args) {

        User kullanici = new User();
        kullanici.name="said";
//        kullanici.role=1;
//        kullanici.status=2;

        kullanici.yetkisi = Role.ADMIN;
        kullanici.durumu=Status.LOGIN;


        User kullanici1 = new User();
        kullanici.name="oner";

        kullanici1.yetkisi = Role.CUSTOMER;
        kullanici1.durumu=Status.ACTIVE;

        if (kullanici.yetkisi==Role.CUSTOMER) {
            System.out.println("Silme yetkisi yok!");
        }
    }

}
