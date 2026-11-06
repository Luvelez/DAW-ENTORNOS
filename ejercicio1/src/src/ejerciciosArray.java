package src;

import java.util.Scanner;

public class ejerciciosArray {
	
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
		
		int posicion = 0;
		
		while (posicion < letras1.length && posicion < letras2.length 
				&& letras1[posicion] == letras2[posicion]) {
			posicion++;
		}
		
		if (posicion == letras1.length && posicion == letras2.length) {
			System.out.println("Los textos son iguales: ninguno va antes. ");
		}
		
		else if (posicion == letras1.length) {
			System.out.println(texto1 + " va antes que " + texto2);
		}
		
		else if (posicion == letras2.length) {
			System.out.println(texto2 + " va antes que " + texto1);
		}
		
		else if (letras1[posicion] < letras2[posicion]) {
			System.out.println(texto1 + " va antes que " + texto2);
		}
		
		else {
			System.out.println(texto2 + " va antes que " + texto1);
		}
	
	
		System.out.println();
	
	System.out.println("Escribe un texto para invertir:");
	String texto = sc.nextLine();
	
	char[] letras = texto.toUpperCase().toCharArray();
	
	System.out.println("Texto invertido en mayúsculas: ");
		
		for (int i = letras.length - 1; i >= 0; i--) {
			System.out.print(letras[i]);
		}
	System.out.println();
	
	System.out.println("Escribe una palabra para comprobar si es palíndroma:");
	String palabra = sc.nextLine();
	
	char[] letrasPalabra = palabra.toCharArray();
	boolean esPalindromo = true;
	
	for (int i = 0; i < letrasPalabra.length / 2; i++) {
		if (letrasPalabra[i] != letrasPalabra[letrasPalabra.length - 1 - i]) {
		esPalindromo = false;
		break;
		}
	}
	
	if (esPalindromo) {
		System.out.println("La palabra es palíndroma ");
		} else {
			System.out.println("La palabra NO es palíndroma ");
	}
	
	System.out.println();
		
	System.out.println("Escribe un texto para contar sus vocales:");
	String textoVocales = sc.nextLine();
	contarVocales(textoVocales);
	
	sc.close();
	
		}	// ciera main

	public static void contarVocales(String texto) {
	
		int contador = 0;
		texto = texto.toLowerCase();
		
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;
			}
		}
			
			System.out.println("Cantidad total de vocales: " + contador);	
	}
	
}	
