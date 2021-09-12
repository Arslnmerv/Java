package day33_stringBuilder;

public class C04_AccessModifier02 {

	public static void main(String[] args) {
	C03_AccessModifier obj1 = new C03_AccessModifier();
	
    System.out.println( obj1.defaultAge );//15
    System.out.println( obj1.protectedAge );//32
    System.out.println( obj1.publicAge );//61

    C05_AccessModifier02 name=new C05_AccessModifier02();
    System.out.println(name.protectedName);
    System.out.println(name.defaultName);
    System.out.println(name.publicName);
	}

}
