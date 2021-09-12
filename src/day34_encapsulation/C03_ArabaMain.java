package day34_encapsulation;

public class C03_ArabaMain {

	public static void main(String[] args) {
		C04_Araba volvo=new C04_Araba("xc90", "beyaz", -2400, -2020);
		C04_Araba audi=new C04_Araba("Q7", "bej", -3000, -2021);
		C04_Araba honda=new C04_Araba();//default parametresiz cons varken calisir

		honda.model="accord";
		honda.renk="gri";
		honda.setYil(1999);
		honda.setMotor(1400);
		System.out.println("honda yil : " +honda.getYil());
		System.out.println("honda motor : " +honda.getMotor());
		System.out.println("volvo motor : "+ volvo.getMotor());
		System.out.println("audi yil :" + audi.getYil());
	}

}
