package day32_stringBuilder;

import java.time.LocalTime;

public class C02_StringBuilder02 {

	public static void main(String[] args) {
		// 1000 kere donecek bir loop yazalim
	      // loop'da String ve StringBuilder kullanip 
	      // oncesinde ve sonrasinda zaman alalim
	      // hizlarini karsilastiralim
	
		String s="";
		StringBuilder sb =new StringBuilder();
		LocalTime lt=LocalTime.now();
		
		System.out.println("string oncesi zaman : "+lt);
		
		for (int i = 0; i <=1000; i++) {
			s+=i;
		}System.out.print(s);
		System.out.println();
		LocalTime lt2=LocalTime.now();
		System.out.println("string sonrasi SB oncesi zaman : "+lt2);
	
		for (int i = 0; i <=1000; i++) {
			sb.append(i);
			
		}
	System.out.print(sb);
	System.out.println();
	LocalTime lt3=LocalTime.now();
	System.out.println("string sonrasi SB sonrasi zaman : "+lt3);

	}

}
