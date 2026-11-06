package src;

import java.util.Scanner;

public class longitudPalabras {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el primer texto:");
		String texto1 = sc.nextLine();
		
		System.out.println("Escribe el segundo texto:");
		String texto2 = sc.nextLine();
		
		if (texto1.equals(texto2)) {
			System.out.println("Los textos son iguales.");
		}
		else {
			System.out.println("Los textos son diferentes.");
		}
		
		if (texto1.length() == texto2.length()) {
			System.out.println("Los textos tienen la misma longitud.");
		}
		
		else {
			System.out.println("Los textos tienen distinta longitud.");
		}
		
		char[] letras1 = texto1.toCharArray();
		char[] letras2 = texto2.toCharArray();
		
		int resultado = letras1.length - letras2.length;
		
		for (int i = 0; i < letras1.length)
		
	}	
	
}	