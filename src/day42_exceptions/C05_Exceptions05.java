package day42_exceptions;

public class C05_Exceptions05 {

	public static void main(String[] args) {

		int sayi = 34;
		
		String str="1453";
		
		//String str1=sayi;//CTE--> checked exception ClassCast
		
		int okulNo = Integer.parseInt(str);
		System.out.println(okulNo);
		System.out.println(str +35);//145335
		System.out.println(okulNo+35);//1488
		
		
		String str1="14a3";
		int strSsayisi=Integer.parseInt(str1);//NumberFormatException unchecked run edildiginde ortaya cikar (r)unchecked
		Object sayi3=45;// object data type javanin tum classlarinin parenti
		
		String strSayi2=(String)sayi3;//data type Class casting buyuk veri kucuk konteynira atandi
		//data turlerini casting yaparken uygun olmayan islem
//ClassCastException unchecked verir
	}

}
