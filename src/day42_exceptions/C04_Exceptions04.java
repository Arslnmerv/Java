package day42_exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Exceptions04 {

	public static void main(String[] args) {               
		    int []arr= {1,2,3,4};
		    System.out.println(arr[1]);//2
		    System.out.println(arr[3]);//4
		   // System.out.println(arr[5]);//ArrayIndexOutOfBoundsException unchecked
  
		    List<String> gzlinsn= new ArrayList<>(Arrays.asList("merve","hakan","firat"));
		    
		    System.out.println(gzlinsn.get(2));//firat
		    System.out.println(gzlinsn.get(0));//merve
		    System.out.println(gzlinsn.get(5));//IndexOutOfBoundsException unchecked array ve listlerde olmayan  bir index ile islem yapilirsa java bu hatayi verir
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
