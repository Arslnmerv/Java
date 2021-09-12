package day44_abstract;

public abstract class T1_Insan {
	private String isim;
	private String soyisim;
	
	public T1_Insan(String isim, String soyisim) {

		this.isim = isim;
		this.soyisim = soyisim;
		
		
	}

	private void isimDegistir(String isim, String soyisim) {
       
		this.isim=isim;
		this.soyisim=soyisim;
		
	}

	public void bilgilendirme() {

		System.out.println("isim :" + isim +"soyisim :" + soyisim);
	}

	public abstract void calis();
	
	
}
