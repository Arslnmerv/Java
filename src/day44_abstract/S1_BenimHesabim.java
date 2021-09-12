package day44_abstract;

public class S1_BenimHesabim extends S1_Banka {

	@Override
	double paraYatir(double miktar) {
        super.bakiye+=miktar;
		return bakiye;
	}

	@Override
	double paraCek(double miktar) {
		super.bakiye-=miktar;
		return bakiye;
	}
public S1_BenimHesabim(double bakiye) {
	super.bakiye=bakiye;
	System.out.println(bakiye);
}
}
