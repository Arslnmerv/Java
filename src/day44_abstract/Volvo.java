package day44_abstract;

public abstract class Volvo {//abs class
	
public abstract void kapi ();//abs meth

public abstract void motor ();//abs meth


public void sunroof () { // concrete method yani somut method
	System.out.println("sunroof ile geceleri mehtaba dalip yoldan cikma");
}
public static void main(String[] args) {
	Volvo volvo = new Volvo() {
		
		@Override
		public void motor() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void kapi() {
			// TODO Auto-generated method stub
			
		}
	};
}
	
	

}
