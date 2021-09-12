package day43_exceptions;

public class C05_Exceptions05 {

	public static void main(String[] args) {
		/*
		 * 'ortalama' isminde bir method oluşturun ve int v - int f isminde 2 adet
		 * parametresi olsun. int v = vize int f = final Eğer vize 100 den büyük, veya
		 * final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
		 * Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı"
		 * mesajını döndürsün. Diğer durumlarda ise, vizenin yüzde 40 ını, finalin yüzde
		 * 60 ını alsın ve toplasın.(ortalama =) vizeye 120, finale 80 girin. Programın
		 * çalışmasını sağlayın. (handle edin)
		 */

		try {
			ortalama(120, 80);

		} catch (Exception e) {
			System.out.println(e);
		}

		int v = 120;
		int f = 80;
		ortalama(v, f);
	}

	private static void ortalama(int v, int f) {

		if (v > 100 || f > 100 || v < 0 || f < 0) {
			throw new ArithmeticException("Notlar 0-100 arasında olmalı");
		} else {
			System.out.println("ortalama " + ((v * 4) / 10) + ((f * 6) / 10));
		}

	}
}
