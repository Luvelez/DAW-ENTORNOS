package src;

import java.util.Scanner;

public class metodos {
	
	// Metodos
	
	public static double calcularArea(double lado) {
		return lado * lado;
	}
	
   	public static double calcularPerimetro(double lado) {
		return lado * 4;	
	}
	
	public static boolean esPositivo(int numero) {
		return numero >= 0;
	}

    public static double CentigradosAFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32; 
    }

    public static double FarenheitACentigrados(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }



	
	// Ejercicio 1: Cuadrado
	public static void ejercicioCuadrado() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número para el lado del cuadrado: ");
		double lado = teclado.nextDouble();
		double area = calcularArea(lado);
		double perimetro = calcularPerimetro(lado);
		
		System.out.println("Área: " + area);
		System.out.println("Perimetro: " + perimetro);
		
	}
	
	// Ejercicio 2: Positivo o negativo
	public static void positivoNegativo() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = teclado.nextInt();
		
		if (esPositivo(numero)) {
			System.out.println("El número es positivo");
		} else {
			System.out.println("El número es negativo");
		}
	}
	
	// Ejercicio 3: Conversor de Temperatura
	public static void conversorTemperatura() {
		Scanner teclado = new Scanner(System.in);

        System.out.println("\n--- BIENVENIDO AL CONVERSOR DE TEMPERATURA ---");
        System.out.println("1. Convertir de Celcius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.print("Elige una opción (1 o 2): ");
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.print("Ingresa los grados Centígrados: ");
            double celsius = teclado.nextDouble();
            double fahrenheit = CentigradosAFarenheit(celsius); 
            System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F");
        } 
        else if (opcion == 2) {
            System.out.print("Ingresa los grados Fahrenheit: ");
            double fahrenheit = teclado.nextDouble();
            double celsius = FarenheitACentigrados(fahrenheit);
            System.out.println(fahrenheit + "°F equivalen a " + celsius + "°C");
        } 
        else {
            System.out.println("Opción no válida.");
        }
	}


	// ---------- EL ÚNICO MÉTODO PRINCIPAL ----------
	

	
		public static void main(String[] args){
			
			// ejercicioCuadrado();
			// positivoNegativo();
			// conversorTemperatura();
			int resultado = factorial(5);
			System.out.println("Factorial: " + resultado);
		}

		// Método factorial recursivo corregido
		private static int factorial(int numero) {
			if (numero <= 1) {
				return 1;
			}
			return numero * factorial(numero - 1);
		}
		
}		
	


