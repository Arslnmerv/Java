package day45_Interface;

public interface DisDonanim {
public void ayna();
public void kapi();
public void kaporta();
String RENK="metalik";
public default String sisLamp() {// bu method bildigin bodyli concrete
	return "sisli hava dikkat!";
	
	
}
public static String boya() {// bu method bildigin bodyli concrete
	return "koyu renk boya gunes yanigi yapar";
	
	
}
}

