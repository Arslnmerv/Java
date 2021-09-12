package day31_varargs;

public class C06_StringBuilder02 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder();//bos bir sb1 create ettik.
		//SBe eleman ekleme--->obj.appent(obj);
		
		sb1.append("faruk");
		System.out.println("sb2 ilk hali : "+sb1);//faruk
		sb1.append(" efehan");
		System.out.println("sb1 efehan eklenmis hali : "+sb1);//faruk efehan
        System.out.println("sb1 uzunluk :"+sb1.length());//12
        System.out.println("sb1 kapasitesi :"+sb1.capacity());//16
        System.out.println("sb1 son hali ;" +sb1.append(" guzel insan"));
        System.out.println("sb1 son hali, kapasite : "+sb1.capacity());
        
	}

}
