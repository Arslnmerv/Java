package day45_Interface;

public class SahinRuuner {

	public static void main(String[] args) {
		Sahin s1 = new Sahin();
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.motor();
		s1.yakit();
		System.out.println(icDonanim.music);
        //s1.kumas="deri";// final veriable assaigment yapilamaz
	   System.out.println(icDonanim.RENK);
	   System.out.println(DisDonanim.RENK);
	   System.out.println(Lastik.RENK);
	   System.out.println(s1.sisLamp());//obj ile parent interfaceden concrete method call edildi.
	   
	   System.out.println(DisDonanim.boya());//interface name ile parent interfaceden concrete method call edildi
	   
	   
	}

}
