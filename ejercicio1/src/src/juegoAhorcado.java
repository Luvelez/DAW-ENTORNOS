package src;

import java.util.Random;
import java.util.Scanner;

public class juegoAhorcado {

	public static String obtenerPalabraAleatoria() {
		String[] bancoPalabras = {
				"JAVA", "COMPILADOR", "VARIABLE", "INTERFAZ", "STRING", "DESARROLLO", "PROGRAMACION", "ALUMNO", "PALABREJA", "AHORCADO", "LENGUAJE", "SERVIDOR"
		};
	
		Random generador = new Random();
		int indiceAleatorio = generador.nextInt(bancoPalabras.length);
		return bancoPalabras[indiceAleatorio];
	}
	
	// <-- AQUÍ FALTABA ESTE MÉTODO: Es el que dibuja o muestra los errores
	public static void dibujarAhorcado(int errores) {
		System.out.println("\n--- AHORCADO (Errores: " + errores + "/6) ---");
	}
	
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		String palabraSecreta = obtenerPalabraAleatoria();
		int errores = 0;

		char[] solucion = new char[palabraSecreta.length()];
		
		for(int i = 0; i < palabraSecreta.length(); i++) {
			solucion[i] = '_';
		}
		
		boolean victoria = false;
		
		while(errores < 6 && !victoria) {
			dibujarAhorcado(errores); // Ahora sí encontrará este método sin problemas
			
			System.out.print("Palabra actual: ");
			for(int i = 0; i < palabraSecreta.length(); i++) {
				System.out.print(solucion[i] + " ");
			}
			
			System.out.println();
			
			char letra = ' ';
			String entrada = "";
			while(entrada.isEmpty()) {
				System.out.print("Introduce una letra: ");
				entrada = scan.nextLine().toUpperCase();
				if(!entrada.isEmpty()) {
					letra = entrada.charAt(0);
				}
			}
			
			// Comprobar si la letra está en la palabra
			boolean acierto = false;
			for(int i = 0; i < palabraSecreta.length(); i++) {
				if(palabraSecreta.charAt(i) == letra) {
					solucion[i] = letra;
					acierto = true;
				}
			}
			
			if(!acierto) {
				errores++;
				System.out.println("¡La letra no se encuentra en la palabra!");
			} else {
				System.out.println("¡Bien hecho! Has acertado una letra.");
			}
			
			// Comprobar si ya se ha completado la palabra
			victoria = true;
			for(int i = 0; i < palabraSecreta.length(); i++) {
				if(solucion[i] == '_') {
					victoria = false;
					break;
				}
			}
		}
		
		if(victoria) {
			System.out.println("\n¡Felicidades! Has ganado. La palabra era: " + palabraSecreta);
		} else {
			dibujarAhorcado(errores);
			System.out.println("\n¡Game Over! Te has quedado sin intentos. La palabra era: " + palabraSecreta);
		}
		
		scan.close();
	}
}