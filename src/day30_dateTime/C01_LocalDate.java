package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now();// tarih isminde obje create ettik/Trick new anahtari kullanilmaz
		System.out.println("bugunun tarihi : " + tarih);

		tarih.plusDays(21);
		System.out.println("bugunden 21 gun sonrasi  : " + tarih.plusDays(21)); // bugunden guncel bugunden 21 gun
																				// sonrasini verecek

		tarih.plusYears(3);
		System.out.println("bugunden 3 yil sonrasi : " + tarih.plusYears(3));// 2024-08-03

		System.out.println("bugunden 3 gun 5 ay ve 2 yil sonrasi : " + tarih.plusDays(3).plusMonths(5).plusYears(2));

		System.out.println("bugunden 40 gun oncesi : " + tarih.minusDays(40));// 2021-06-24

		System.out.println(
				"bugunun 5 yil oncesi 2 ay sonrasi 3 hafta ertesi : " + tarih.minusYears(5).plusMonths(2).plusWeeks(3));

		System.out.println(tarih.getDayOfMonth());// 3 ayin gununu getir
		System.out.println(tarih.getDayOfYear());// 215 yilin 215.gunundeyiz
		System.out.println(tarih.getDayOfWeek());// tuesday
		System.out.println(tarih.getMonthValue());// 8
		System.out.println(tarih.getMonth());// august

		LocalDate dgmGnDate = LocalDate.of(1995, 10, 24);
		System.out.println("dogum tarihi : " + dgmGnDate);// 1995-10-24
		System.out.println("dogum gunu : " + dgmGnDate.getDayOfWeek());// Tuesday
		System.out.println(tarih.isAfter(dgmGnDate));// true
		System.out.println(tarih.isBefore(dgmGnDate));// false

		System.out.println("bugun artik yil mi : " + tarih.isLeapYear());// false

	}

}
