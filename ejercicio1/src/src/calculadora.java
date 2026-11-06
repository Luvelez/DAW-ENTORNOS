package src;

import java.util.Scanner;
public class calculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("CALCULADORA");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
		System.out.println("Elige una opción: ");
		int opcion = teclado.nextInt();
		System.out.println("has elegido la opción: " + opcion);
		
		switch (opcion) {
		
		case 1:
			System.out.println("Sumar");
			
			System.out.println("Introduce el primer número:");
			int numero1 = teclado.nextInt();
			
			System.out.println("Introduce el segundo número:");
			int numero2 = teclado.nextInt();
			
			int resultado = sumar(numero1, numero2);
			
			System.out.println("El resultado es: " + resultado);
			break;
		
		case 2:
			System.out.println("Restar");
			
			System.out.println("Introduce el primer número:");
			int numero3 = teclado.nextInt();
			
			System.out.println("Introduce el segundo número:");
			int numero4 = teclado.nextInt();
			
			int resultadoResta = restar(numero3, numero4);
			
			System.out.println("El resultado es: " + resultadoResta);
			break;
			
		case 3:
			System.out.println("Multiplicar");
			
			System.out.println("Introduce el primer número:");
			int numero5 = teclado.nextInt();
			
			System.out.println("Introduce el segundo número:");
			int numero6 = teclado.nextInt();
			
			int resultadoMultiplica = multiplicar(numero5, numero6);
			
			System.out.println("El resultado es: " + resultadoMultiplica);
			break;
		
		case 4:
			System.out.println("Dividir");
			
			System.out.println("Introduce el primer número:");
			int numero7 = teclado.nextInt();
			
			System.out.println("Introduce el segundo número:");
			int numero8 = teclado.nextInt();
			
			int resultadoDivide = dividir(numero7, numero8);
			
			System.out.println("El resultado es: " + resultadoDivide);
			break;
		
		case 5:
			System.out.println("Salir");
			break;
			
		default:
			System.out.println("Opción no válida");
			break;
		}
	}	
		
		public static int sumar(int a, int b) {
			int resultado = a + b;
			return resultado;
		}
			public static int restar(int a, int b) {
				int resultado = a - b;
				return resultado;	
		}
			
			public static int multiplicar(int a, int b) {
				int resultado = a * b;
				return resultado;	
		}
			
			public static int dividir(int a, int b) {
				int resultado = a / b;
				return resultado;	
		}	


}
