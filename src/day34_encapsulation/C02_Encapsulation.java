package day34_encapsulation;

public class C02_Encapsulation {

	public static void main(String[] args) {

		C01_Encapsulation01 insan1 = new C01_Encapsulation01();
		// c1den insan objesi create ettik

		// insan1.age = -47;
		insan1.name = "onur";
		insan1.surName = "enes";
		insan1.setAge(-47);
		System.out.println(insan1.name);
		System.out.println(insan1.surName);
		System.out.println(insan1.getAge());
	}
}
