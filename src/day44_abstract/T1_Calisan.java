package day44_abstract;

public class T1_Calisan extends T1_Insan {

	private int calisanId;

	public T1_Calisan(String isim, String soyisim, int calisanId) {
		super(isim, soyisim);
		this.calisanId = calisanId;
	}

	@Override
	public void calis() {
		
		if (calisanId==0) {
			System.out.println("Bu sahis sirket calisani degildir");
			System.out.println("sahsin idsi : "+calisanId);
		}else {
			System.out.println("Bu sahis bizim gundi :)");
			System.out.println("sahsin idsi : "+calisanId);
		} 
	}public static <Calisan> void main(String[] args) {
		T1_Calisan ITManager= new T1_Calisan("Merve","Arslan",0);
		T1_Calisan QAtester= new T1_Calisan("Omer","Faruk",1453);
		T1_Calisan Developer= new T1_Calisan("Oguzhan","Akkafa",1905);
		
		ITManager.bilgilendirme();
		ITManager.calis();
		
		QAtester.bilgilendirme();
		QAtester.calis();
		
		Developer.bilgilendirme();
		Developer.calis();
			}


}
