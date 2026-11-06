package src;

import java.util.Scanner;
import java.util.Random; // <-- 1. Añadimos el import de Random aquí arriba

public class BucleNum {
	
	public static void main(String[] args) {
		// parImpar();
		// sumarCien();
		// actualizarReloj();
		// numeroPrimo();
		devolucionDeMonedas();
		// adivinaElNumero(new Scanner(System.in));
	}
	
	public static void parImpar() {
		Scanner input = new Scanner(System.in);
		System.out.println("introduce un numero");
		int numero = input.nextInt();
		
		for(int i = 2; i <= numero; i++){
			if(i % 2 == 0){
				System.out.println(i + " es par");
			} else { 
				System.out.println(i + " es impar");
			}		
		}
		input.close();
	}
    	
	public static void sumarCien() {
		int suma = 0;
		for(int i = 1; i <= 100; i++){
			suma += i;
		}
		System.out.println("El resultado de sumar los 100 primeros números es: " + suma);
	}

	public static void actualizarReloj() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduce horas (0-23): ");
		int horas = input.nextInt();
		
		System.out.print("Introduce minutos (0-59): ");
		int minutos = input.nextInt();
		
		System.out.print("Introduce segundos (0-59): ");
		int segundos = input.nextInt();
		
		System.out.printf("Hora actual: %02d:%02d:%02d\n", horas, minutos, segundos);
		
		segundos++;
		
		if (segundos == 60) {
			segundos = 0;
			minutos++;
			
			if (minutos == 60) {
				minutos = 0;
				horas++;
				
				if (horas == 24) {
					horas = 0;
				}
			}
		}
		System.out.printf("Hora corregida: %02d:%02d:%02d\n", horas, minutos, segundos);
		input.close();
	}

	public static void diaSemana() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un día de la semana: ");
        String dia = scanner.nextLine();

        boolean esLunesOMartes = dia.equals("lunes") || dia.equals("martes");
        boolean esMiercolesOJueves = dia.equals("miércoles") || dia.equals("miercoles") || dia.equals("jueves");
        boolean esViernes = dia.equals("viernes");
        boolean esFinDeSemana = dia.equals("sábado") || dia.equals("sabado") || dia.equals("domingo");

        if (esLunesOMartes) {
            System.out.println("Comenzando la semana");
        } else if (esMiercolesOJueves) {
            System.out.println("Mitad de semana");
        } else if (esViernes) {
            System.out.println("Casi fin de semana");
        } else if (esFinDeSemana) {
            System.out.println("A disfrutar el fin de semana");
        } else {
            System.out.println("El valor introducido no es correcto");
        }

        scanner.close();
    }
	
	// Programa que dirá la cantidad de monedas mínima en la que se divide un número con decimales
	public static void devolucionDeMonedas() {
		Scanner input = new Scanner(System.in); // <-- 2. Creamos el Scanner faltante
		System.out.print("Introduce la cantidad en euros a devolver (ej. 3,47): ");
        double cantidadEuros = input.nextDouble(); // <-- 3. Usamos 'input.nextDouble()'

        // Se convierte a céntimos enteros (corregido el * 100 y quitado el guion)
        int centimos = (int) Math.round(cantidadEuros * 100); 

        System.out.println("\nDevolución:");

        // Monedas de 2 euros
        int monedas2e = 0;
        while (centimos >= 200) {
            monedas2e++;
            centimos -= 200;
        }
        if (monedas2e > 0) {
            System.out.println(monedas2e + " de 2€");
        }

        // Monedas de 1 euro
        int monedas1e = 0;
        while (centimos >= 100) {
            monedas1e++;
            centimos -= 100;
        }
        if (monedas1e > 0) {
            System.out.println(monedas1e + " de 1€");
        }

        // Monedas de 50 céntimos
        int monedas50c = 0;
        while (centimos >= 50) {
            monedas50c++;
            centimos -= 50;
        }
        if (monedas50c > 0) {
            System.out.println(monedas50c + " de 50cts");
        }

        // Monedas de 20 céntimos
        int monedas20c = 0;
        while (centimos >= 20) {
            monedas20c++;
            centimos -= 20;
        }
        if (monedas20c > 0) {
            System.out.println(monedas20c + " de 20cts");
        }

        // Monedas de 10 céntimos
        int monedas10c = 0;
        while (centimos >= 10) {
            monedas10c++;
            centimos -= 10;
        }
        if (monedas10c > 0) {
            System.out.println(monedas10c + " de 10cts");
        }

        // Monedas de 5 céntimos
        int monedas5c = 0;
        while (centimos >= 5) {
            monedas5c++;
            centimos -= 5;
        }
        if (monedas5c > 0) {
            System.out.println(monedas5c + " de 5cts");
        }

        // Monedas de 2 céntimos
        int monedas2c = 0;
        while (centimos >= 2) {
            monedas2c++;
            centimos -= 2;
        }
        if (monedas2c > 0) {
            System.out.println(monedas2c + " de 2cts");
        }

        // Monedas de 1 céntimo
        int monedas1c = 0;
        while (centimos >= 1) {
            monedas1c++;
            centimos -= 1;
        }
        if (monedas1c > 0) {
            System.out.println(monedas1c + " de 1ct");
        }
        
        input.close(); // Buena práctica cerrar el scanner
	}
	
	// Método que nos permite jugar a adivinar el número
	public static void adivinaElNumero(Scanner scaner) {
		Random random = new Random(); // <-- 4. Declaramos 'Random random' correctamente
        char jugarDeNuevo;
        
        do {
            int numeroSecreto = random.nextInt(100) + 1;
            int intento;

            System.out.println("\nHe pensado un número del 1 al 100. ¡Intenta adivinarlo!");

            do {
                System.out.print("Introduce tu número: ");
                intento = scaner.nextInt();

                if (intento < numeroSecreto) {
                    System.out.println("Pista: El número es mayor.");
                } else if (intento > numeroSecreto) {
                    System.out.println("Pista: El número es menor.");
                } else {
                    System.out.println("¡Correcto! Has adivinado el número secreto.");
                }
            } while (intento != numeroSecreto);

            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            jugarDeNuevo = scaner.next().toLowerCase().charAt(0);
            
        } while (jugarDeNuevo == 's');

        System.out.println("¡Gracias por jugar! Hasta pronto.");
	}
}