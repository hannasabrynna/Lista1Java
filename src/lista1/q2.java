package lista1;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner (System.in);
		
		float peso;
		float altura;
		float IMC;
		
		System.out.println("digite seu peso:");
		peso = pedido.nextFloat();
		
		
		System.out.println("digite seu altura:");
	    altura = pedido.nextFloat();
		
		IMC = peso / (altura*altura);
		System.out.println("seu imc é:" + IMC);
		
		
		
		
	
		
		
	}

}
