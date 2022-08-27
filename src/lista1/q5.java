package lista1;

import java.util.Scanner;

public class q5 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner (System.in);
		
		int a;
		
		System.out.println("digite um numero:");
		a = pedido.nextInt();
		
		
		if (a % 2 == 0) {
			System.out.println("o numero é par");
		} else {
			System.out.println("o numero é impar");
		}
		
		
	}

}
