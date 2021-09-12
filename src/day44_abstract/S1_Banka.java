package day44_abstract;



public abstract class S1_Banka {

	double bakiye;
	public S1_Banka(double bakiye) {
		
		this.bakiye = bakiye;
	}
	
	public S1_Banka() {
		System.out.println("hesap hareketleri");
	}
	
	 abstract double paraYatir(double miktar);
	 abstract double paraCek(double miktar);
}
