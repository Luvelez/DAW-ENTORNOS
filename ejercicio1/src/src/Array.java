package src;

import java.util.Scanner;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
	
	//arrayNumeros();
	//arrayDias();
	notasClase();	
		
	}
		public static void arrayNumeros() {	
		
		int[] numeros = {1,2,3};
	
	//Creandolo e indicando cuántos espacios vamos a reservar
	int[] numeros2 = new int[3];
	numeros2[0] = 1;
	numeros2[1] = 2;
	numeros2[2] = 3;

	//Creando el array y posteriormente inicializarlo
	int[] numeros3 = null;
	numeros3 = new int[3];
	numeros3[0] = 1;
	numeros3[1] = 2;
	numeros3[2] = 3;

	System.out.println("longitud del array: "+numeros.length);
	System.out.println("el elemento: "+numeros[0]);

	
	}




 public static void notasClase() {
		 Scanner teclado = new Scanner(System.in);
			System.out.println("¿Cuántos alumnos hay?");
			int cantidad = teclado.nextInt();
			
			while(cantidad <=0) {
				System.out.println("Debe haber al menos un alumno. Inténtalo otra vez:");
				cantidad = teclado.nextInt();
			}
			
			int[] notas = new int[cantidad];
			
			for (int i = 0; i < notas.length; i++) {
				System.out.println("Introduce la nota del alumno " + (i + 1));
				notas[i] = teclado.nextInt();
				
				while (notas[i] < 0 || notas[i] > 10) {
					System.out.println("Nota incorrecta, introduce un entero de 0 a 10:");
					notas[i] = teclado.nextInt();
				}
					
				}
			int suma = 0;
			for (int i = 0; i < notas.length; i++) {
				suma = suma + notas[i];
			}
			
			double media = (double) suma / notas.length;
			
			System.out.println("La media es: " + media);
			
			Arrays.sort(notas);
			double mediana;
			
			int mitad = notas.length / 2;
			
			if (notas.length % 2 != 0) {
				mediana = notas[mitad];
			} else {
				mediana = (notas[mitad - 1] + notas[mitad]) / 2.0;
			}
			
			System.out.println("La mediana es: " + mediana);
			 
			int [] frecuencias = new int[11];
			
			for (int i = 0; i < notas.length; i++) {
				frecuencias [notas[i]]++;
				}
			int mayorFrecuencia = 0;
			for (int i = 0; i < frecuencias.length; i++ ) {
				if (frecuencias[i] > mayorFrecuencia) {
					mayorFrecuencia = frecuencias[i]; 
				}
			}
				
				if (mayorFrecuencia == 1) {
					System.out.println("No hay moda: ninguna nota se repite.");
				}
					else {
						System.out.println("Moda: ");
						
						for (int i = 0; i < frecuencias.length; i++) {
							System.out.println(i + " ");
						}
					}
				
			
			System.out.println();
			}
}	
	
		

			
			//cierra notas clase
			//Cierra la clase array

 
 