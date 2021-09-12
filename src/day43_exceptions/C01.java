package day43_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01 {

	public static void main(String[] args) throws IOException {
		
	try {
		// TODO: handle finally clause
				FileInputStream fis = new FileInputStream (  "/Users/yeni/eclipse-workspace/javaSummer2021Tr/src/_14_Exceptions/fil");
			        int i = 0;
			        while ((i = fis.read()) != -1) {
			            System.out.print((char) (i));
			        }
	} finally {
		System.out.println("devamkee okuduysan code yeni sahillere yelken aciyor");
	        }
	/*
	 * thorws keyword'u sadece declaration'dir. 
	 * Throws kullanilan methodda exception olusursa CODE BLOCK olur.
	 * Exceptions arasinda pranet-child iliskisi varsa parent class exception throws'dan sonra yazilmali
	 */
	    }
	

}
