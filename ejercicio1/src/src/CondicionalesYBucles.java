package src;

import java.util.Scanner;

public class CondicionalesYBucles {
	
	public static void main(String[] args) {
		condicionalSwitchCascada();
		bucleFor();
	}
	
	//Código de una condicional if simple.
	//Por ejemplo permitimos el acceso si el usuario es mayor de edad.
    public static void condicionalSimple() {
    	System.out.println("Ingresa la edad del usuario:");

        // Declaramos la variale input tipo Scanner para leer datos de la consola
        Scanner input = new Scanner(System.in);

        // Leemos el input de la consola y almacenamos la edad del usuario
        int edad = input.nextInt();

        // Validamos si el usuario es mayor de edad para permitir el acceso.
        if(edad >= 18) {
            System.out.println("Acceso permitido.");
        }
    }
    
    /*Código de una condicional if else.
  	Por ejemplo permitimos el acceso si el usuario es mayor de edad. 
  	Y si no lo rechazamos*/
    public static void condicional() {
	    // Declaramos la variable input tipo Scanner para leer datos de la consola
	    Scanner input = new Scanner(System.in);
	
	    // Leemos el input de la consola y almacenamos la edad del usuario
	    int edad = input.nextInt();
	
	    // Validamos si el usuario es mayor de edad para permitir el acceso; de lo contrario se le denegará.
	    if(edad >= 18) {
	        System.out.println("Acceso permitido.");
	    } else {
	        System.out.println("Acceso denegado. Eres menor de edad.");
	    }
    }
    
    /*Código de una condicional if else anidado.
  	Por ejemplo permitimos el acceso si el usuario es mayor de edad. 
  	Y si no lo rechazamos Y además comprobamos que no se haya introducido
  	una edad negativa*/
    public static void condicionalAnidado() {
    	 System.out.println("Ingresa la edad del usuario:");

         // Declaramos la variable input tipo Scanner para leer datos de la consola
         Scanner input = new Scanner(System.in);

         // Leemos el input de la consola y almacenamos la edad del usuario
         int edad = input.nextInt();

         // Validamos si el usuario es mayor de edad para permitir el acceso; de lo contrario se le denegará. También validaremos que la edad ingresada no sea un valor negativo.
         if(edad >= 18) {
             System.out.println("Acceso permitido.");
         } else if(edad < 18 && edad >= 0) {
             System.out.println("Acceso denegado. Eres menor de edad.");
         } else {
             System.out.println("La edad no puede ser negativo");
         }
    }
    
    /*
     * Código de una condicional switch que nos permite seleccionar
     * el personaje de un videojuego.
     */
    public static void condicionalSwitch() {
    	System.out.println("Ingresa el código del personaje a crear:\n1. Mago\n2. Guerrero\n3. Demonio");

        // Declaramos la variale input tipo Scanner para leer datos de la consola
        Scanner input = new Scanner(System.in);

        // Leemos el input de la consola y almacenamos la edad del usuario
        int tipo = input.nextInt();

        /*
        Si es 1 crearemos un Mago
        Si es 2 crearemos un Guerrero
        Si es 3 crearemos un Demonio
        Si otro valor es ingresado, indicaremos que la opción no es válida.
        */
        switch(tipo) {
            case 1 : System.out.println("Mago creado");
                break;
            case 2 : System.out.println("Guerrero creado");
                break;
            case 3 : System.out.println("Demonio creado");
                break;
            default : System.out.println("Opción inválida. Sólo existe 1, 2 y 3");
                break;
        }
    }
    
    /*Código de una condicional switch agrupado en el que varios casos
      se comportan igual.*/
    public static void condicionalSwitchAgrupado() {
	    int i = 2;
	
	    switch(i) {
	      case 0:
	      case 1:
	      case 2:
	      case 3:
	      case 4:
	        System.out.println("i es menor que cinco");
	        break;
	      case 5:
	        System.out.println("i es cinco");
	        break;
	      case 6:
	      case 7:
	      case 8:
	      case 9:
	        System.out.println("i es menor que diez y mayor a cinco");
	        break;
	      default:
	        System.out.println("i es diez o mayor a diez");
	    }
    }
    
    //Evaluación de switch case en cascada ERRONEA
    public static void condicionalSwitchCascada() {
    	int numeroMes = 4;
    	String estacion = "", mes = "";

    	switch (numeroMes) {
    	  case 12:
    	    mes = "Diciembre";
    	  case 1:
    	    mes = "Enero";
    	  case 2:
    	    mes = "Febrero";
    	    estacion = "Invierno";
    	    break;
    	  case 3:
    	    mes = "Marzo";
    	  case 4:
    	    mes = "Abril";
    	  case 5:
    	    mes = "Mayo";
    	    estacion = "Primavera";
    	    break;
    	  case 6:
    	    mes = "Junio";
    	  case 7:
    	    mes = "Julio";
    	  case 8:
    	    mes = "Agosto";
    	    estacion = "Verano";
    	    break;
    	  case 9:
    	    mes = "Septiembre";
    	  case 10:
    	    mes = "Octubre";
    	  case 11:
    	    mes = "Noviembre";
    	    estacion = "Otoño";
    	    break;
    	}

    	System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
    }
    
    //Bucle for para sumar los primeros 100 números
    public static void bucleFor() {
    	//Definimos la variable suma y la inicializamos a 0
    	int suma = 0;
    	
    	//Recorremos los números del 1 al 100 y los sumamos
    	for(int i=1; i<=100; i++){
    		suma +=i;
    	}
    	
    	//Imprimimos por pantalla el resultado
    	System.out.println("El resultado de sumar los 100 primeros números es: "+suma);
    }
}

