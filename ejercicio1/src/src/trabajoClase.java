package src;


	import java.util.Scanner;
	
	public class trabajoClase {
	
	static final double IVA_GENERAL = 0.21;
	
	public static void main(String[] args) {
		//precioIva();
		//diasDelMes();
		//saludoPorTurno();
		//conteoCifras();
		//listadoPrimos();
		calculadoraMenu();
	
	}

	//EJERCICIO 1 - CALCULA IVA
	
	public static double CalcularPrecioFinal(double precioBase) {
		return precioBase * (1 + IVA_GENERAL);
	}
	
	public static void precioIva() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio del producto: ");
		double precio = teclado.nextDouble();
		double resultado = CalcularPrecioFinal(precio);
		System.out.println("Precio final con IVA: " + resultado + " euros");
	
		}
	//EJERCICIO 2 - DIAS DEL MES
	
	public static int ObtenerDiasMes(int mes) {
	
		int dias = 0;
		switch (mes) {
			
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			dias = 31;
			break;
		
		case 4:
		case 6:
		case 9:	
		case 11:
			dias = 30;
			break;
			
		case 2:
		dias = 28;
		break;
		}		
		
	return dias;
	
	}
	

	public static void diasDelMes() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un mes del 1 al 12: ");
		int mes = teclado.nextInt();
		int dias = ObtenerDiasMes(mes);
		
		if (dias == 0) {
			System.out.println("Mes no válido");
		}
		
			else {
			System.out.println("El mes tiene " + dias + " días.");	
		
			}
	

	}

	
	
	//EJERCICIO 2 - DIAS DEL MES
	
	public static void Saludo(String nombre, int hora) {
		
		if (hora < 0 || hora > 23) {
			System.out.println("Hora no válida");
			return;
		}
	}	
	public static void saludoPorTurno()	{
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Introduce la hora (0-23); ");
		int hora = teclado.nextInt();
		Saludo(nombre, hora);
		
		
		if (hora >= 6 && hora < 12) {
			System.out.println("Buenos días, " + nombre);
		}
		
		else if (hora >= 12 && hora < 20) {
			System.out.println("Buenas tardes, " + nombre);
		}
		
		else if (hora >= 20 || hora < 6) {
			System.out.println("Buenas noches, " + nombre);
		}
		
		else {
			System.out.println("Hora no válida,");
		}
	
	}	
	
	
	//EJERCICIO 4 - CONTEO DE CIFRAS
	
	public static int ContarCifras(int numero) {
		if (numero >= -9 && numero <=9) {
			return 1;
		}
			
		else if (numero >= -99 && numero <=99) {
			return 2;
		}
		
		else if (numero >= -999 && numero <=999) {
			return 3;
		}
		
		else if (numero >= -9999 && numero <=9999) {
			return 4;
			
		}	
			else if (numero >= -99999 && numero <=99999) {
				return 5;
			}
		
			else if (numero >= -999999 && numero <=999999) {
				return 6;
			}
		
			else if (numero >= -9999999 && numero <=9999999) {
				return 7;
			}
		
			else if (numero >= -99999999 && numero <=99999999) {
				return 8;
			}
		
			else if (numero >= -999999999 && numero <=999999999) {
				return 9;
			}
		
			else {
				return 10;
			}
		}
	
	public static void conteoCifras() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = teclado.nextInt();
		
		int cantidad = ContarCifras(numero);
		System.out.println("El numero tiene: " + cantidad + " cifras.");
		
		}
	
	
	//EJERCICIO 5 - NUMEROS PRIMOS
	
	public static boolean EsPrimo(int numero) {
		
	if (numero < 2) {
		return false;
	}	
	for (int i = 2; i < numero; i++)
		if (numero % i == 0) {
			return false;
		}

	
	return true;
	
	} 	//aqui termina es primo
	
	public static void listadoPrimos() {
	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número limite: ");
		int limite = teclado.nextInt();
		for (int i = 2; i <= limite; i++) {
			if(EsPrimo(i)) {
				System.out.print(i + " ");
			}
			
		}
	
	}
	
	//EJERCICIO 6 - CALCULADORA MODULAR	
	
	public static double sumar(double a, double b) {
		return a+b;
	}
	
	public static double Restar(double a, double b) {
		return a - b;
	}
	
	public static double Multiplicar(double a, double b) {
		return a * b;
	}
	
	public static double Dividir(double a, double b) {
		if (b== 0) {
			System.out.println("Error: no se puede dividir entre cero");
		}
		return Double.NaN;
	}
	
	public static void calculadoraMenu() {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		
	do {
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
		
		System.out.print("Elige una opción: ");
		opcion = teclado.nextInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Has elegido sumar");
				
				System.out.print("Introduce el primer número: ");
				double a = teclado.nextDouble();
				System.out.print("Introduce el segundo número: ");
				double b = teclado.nextDouble();
				double resultado = sumar(a, b);
				System.out.println("El resultado es: " + resultado);
				break;
				
			case 2:
				System.out.println("Has elegido restar");
				System.out.print("Introduce el primer número: ");
				double c = teclado.nextDouble();
				System.out.print("Introduce el segundo número: ");
				double d = teclado.nextDouble();
				double resultadoResta = Restar(c, d);
				System.out.println("El resultado es: " + resultadoResta);
				break;
				
			case 3:
				System.out.println("Has elegido multiplicar");
				System.out.print("Introduce el primer número: ");
				double e = teclado.nextDouble();
				System.out.print("Introduce el segundo número: ");
				double f = teclado.nextDouble();
				double resultadoMultiplica = Multiplicar(e, f);
				System.out.println("El resultado es: " + resultadoMultiplica);
				break;
					
			case 4:
				System.out.println("Has elegido dividir");
				System.out.print("Introduce el primer número: ");
				double g = teclado.nextDouble();
				System.out.print("Introduce el segundo número: ");
				double h = teclado.nextDouble();
				double resultadoDivide = Dividir(g, h);
				System.out.println("El resultado es: " + resultadoDivide);
				break;

			case 5:
				System.out.println("Has elegido salir");
				break;	
		}
	
	} while (opcion != 5);
		
		
	}
	
	
	
		
	
}	
	
	

	
			
	
	
	
	
	
	
	
	
	
	
	
	