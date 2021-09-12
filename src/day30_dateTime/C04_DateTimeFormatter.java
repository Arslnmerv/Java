package day30_dateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {

		LocalDate tarih=LocalDate.now();
		LocalDate date=LocalDate.of(2020, 5, 15);
		
		 /*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : yılın tamamını
         * y : yılın tamamını
         * M : ay sırasını verir TEMMUZ için : 7
         * MM:  ay sırasını veriri TEMMUZ için : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamamını verir
         */
        
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");//03/8/21
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yy");//15/05/20
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yy");//03/Aug/21
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd$M$yy");//15$5$20
	
	   System.out.println(dtf.format(tarih));
	   System.out.println(dtf1.format(date));
	   System.out.println(dtf2.format(tarih));
	   System.out.println(dtf3.format(date));
	
	   //kac yasindasiniz
	   
	   LocalDate dt=LocalDate.of(2005, 5, 27);
	  // System.out.println("Bugunun tarihi : "+bugun);
	   
	   
	   
	   
	   
	
	
	
	
	
	
	}

}
