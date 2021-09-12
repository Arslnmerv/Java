package day42_exceptions;

public class C03_Exceotions03 {

	public static void main(String[] args) {

		String str1=" ";
		String str2="";
		String str3=null;//str3 veriableinin hicbir degere esit olmadigini belirten bie belirtec isaretci
	//null bir deger degildir ama consola yazdirilabilir
	System.out.println(str1.length());
	System.out.println(str2.length());
	//System.out.println(str3.length());//NullPointerException unchecked kednimiz ettik kendimiz bulduk exception
	System.out.println(str3 + "erol tas");//nullerol tas
	//System.out.println(str3.concat("erol tas"));--> null olarak atanmis bir obj uygun olmayan bir islem yapilirsa
	// java NullPointerException unchecked hatasi verir
	
	}

}
