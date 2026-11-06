package src;


import java.util.Scanner; 

 

public class OlgaLuciaVelez { 

 

    public static void main(String[] args) { 

 

        Scanner teclado = new Scanner(System.in); 

 

        // MISION 1: COMUNICACION CON LA TIERRA 

 

        int codigoComunicacion = (int) (Math.random() * 10) + 1; 

        int codigoCentral = 3; 

 

        do { 

            System.out.println("Introduce un numero del 1 al 10:"); 

 

            codigoCentral = teclado.nextInt(); 
            

        } while (codigoCentral != codigoComunicacion); 

 

        System.out.println("Comunicacion establecida"); 

 

        teclado.close(); 
        
        System.out.println("Comunicación establecida");
        int bateria = 100;
        
        for (int crateres = 3; crateres <=12; crateres +=3) {
        	int rocas = 8;
        	
        	System.out.println("Cráteres explorados: " + crateres);
        	
        	while (rocas > 0) {
        		rocas = rocas - 2;
        		
        		bateria = bateria - 10;
        		System.out.println("Rocas pendientes: " + rocas);
        		
        		if (bateria <= 30) {
        		System.out.println("Bateria baja. Recargando... ");
        		bateria = 100;
        		} //cierra while 

        	} // cierra el for

        }	        
    }

}