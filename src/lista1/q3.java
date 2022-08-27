package lista1;

import java.util.Scanner;

public class q3 {
	
	public static void main(String[] args) {
		
		Scanner medidas = new Scanner (System.in);
		
		float altura;
		float base_maior;
		float base_menor;
		float area;
		
		System.out.println("digite a altura do trapezio:");
		altura = medidas.nextFloat();
		
		System.out.println("digite a base maior:");
		base_maior = medidas.nextFloat();
		
		System.out.println("digite a base menor:");
		base_menor = medidas.nextFloat();
		
		area = (base_maior + base_menor) * altura / 2;
		
		System.out.println("a area do trapezio é:" + area);
		
		
	}

}
