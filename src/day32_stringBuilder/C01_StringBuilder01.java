package day32_stringBuilder;

public class C01_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();// bos bir sb1 creat ettik. 16 capacty
		// SB e eleman ekleme-->obj.appent(obj);
		sb1.append("faruk");
		System.out.println("sb1 ilk hali : " + sb1);// faruk
		sb1.append(" efehan");
		System.out.println("sb1 efehan eklenmis hali : " + sb1);// faruk efehan
		System.out.println("sb1 uzunluk :" + sb1.length());// 12
		System.out.println("sb1 kapasitesi :" + sb1.capacity());// 16
		System.out.println("sb1 son hali :" + sb1.append(" guzel insan"));
		System.out.println("sb1 son hali. kapasite : " + sb1.capacity());

		// faruk efehan guzel insan
		// Fazladan ayrılan kapasiteyi silme -->obj.trimToSize();
		sb1.trimToSize();
		System.out.println(sb1.capacity());// 24

		// istenen charakterin index ini alma -->obj.indexOf();
		System.out.println(sb1.indexOf("e")); // 6
		System.out.println(sb1.lastIndexOf("e"));// 16

		// İstenen bir characteri index'ine gore alma --> obj.charAt();
		System.out.println("sb 7. karakter : " + sb1.charAt(7));// f

		// belirli bir araliktaki characterleri alma -->obj.subSsequence();

		System.out.println("sb 'nin 7 dahil 12 haric karakterleri :" + sb1.subSequence(7, 12));// fehan
		System.out.println("sb 'nin 5 dahil tum karakterleri :" + sb1.toString().substring(5));// efehan guzel insan
		System.out.println("sb 'nin 5 dahil tum karakterleri :" + sb1.subSequence(5, sb1.length()));// efehan guzel
																									// insan

		// sb dekibelli bir index 'deki karakteri silme --> obj.delete(a,b); a dahil b
		// hariç arası siler. obj.deleteCharAt(a); sadece a karakterini siler
		sb1.delete(3, 7);
		System.out.println("3-7 arası karakter silinmis hali : " + sb1);
		sb1.deleteCharAt(2);
		System.out.println("2. karakter silinmis hali : " + sb1);
		System.out.println("faruk efehan son hali : "+sb1);//fafehan guzel insan
		
		//istenen index istenen karakteri ve karakterleri eklemek--> obj.insert(index,char): insert methodu parametre olarak sadece charaacter almaz obje de alabilir
		
		sb1.insert(2,"r");
		System.out.println("2. indexe r eklenmis hali : "+sb1);
		
		sb1.insert(7,3.14);//sb1 objesi 7.indexine 3.14 value eklendi
		System.out.println(sb1);
		int[]arr= {17,63,21};
		sb1.insert(9, arr);//sb1in 9 karakterinden itibaren arr verileri eklendi
		
		System.out.println("sbye arr eklenmis hali : "+sb1);
		
		//istenen indexteki characterin yerine birden fazla character eklemek--> obj.replace(a,b,"characterler")
		
		StringBuilder sb2= new StringBuilder("Bugun hava cok sicak");
		System.out.println(sb2);
		sb2.replace(3,8, "xxxxxxx");// 3 dahil 8 haric arasina xxxxxxx koyduk
		
		//3 dahil 8 haric index arasina verilen xxxxxx stringi atar
		//ama atanacak string kisa atanacak index uzun olursa kalan indexteki karakterleri siler
		
		
		System.out.println("sb2 son hali : "+sb2 );//sb2 son hali : Bugxxxxxxxva cok sicak
		
		System.out.println("ozel durum : "+sb2.insert(5, "basarili", 2, 4));
		
		/*
		 * 5:sb2 ye basarili ekleme baslangic indexi
		 * basarili : eklenecek string
		 * 2:eklenecek stringin baslangic indexi-->dahil
		 * 4: eklencek stringin bitis indexi --> haric
		 */
		
		//reverse methodu--> obj.reverse();sb elemanlari ters cevirir.
		
		StringBuilder sb3 = new StringBuilder("Bugun hava cok sicak");
		sb3.reverse();
		System.out.println("sb3 ters cevrilmis hali : "+sb3);
		
		
		
		
		
		
		
		
		

	}

}
