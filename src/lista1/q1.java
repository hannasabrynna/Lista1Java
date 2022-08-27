package lista1;

import java.util.Scanner;

public class q1 {
	
	public static void main(String[] args) {
		Scanner pedir = new Scanner(System.in);
		
		int a ;
		System.out.println("digite o numero int:");
		a = pedir.nextInt();
		
		long b;
		System.out.println("digite o numero long:");
		b = pedir.nextLong();
		
		float c;
		System.out.println("digite o numero float:");
		c = pedir.nextFloat();
		
		System.out.printf("o numero inteiro diitado foi, " + a + " ,o numero long digitado foi, " + b + " ,e o numero do tipo float foi, " + c);
		
	
	}

}
