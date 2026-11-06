package src;

public class ejercicioExcepciones {
    
    public static void main(String[] args) { // Corregido: 'String' con mayúscula
        try {
            conexionServidor();
        } catch (IllegalStateException e) {
            System.out.println("Error: Ocurrió un problema con la base de datos.");
        }
    } // <-- Aquí se cierra correctamente el main

    public static void conexionServidor() throws IllegalStateException { // Corregido: 'IllegalStateException' con doble 'l'
        System.out.println("Intentando conectar a la base de datos...");
        
        // Si sale un número menor a 0.1 (10% de probabilidad), simulamos el fallo lanzando la excepción
        if (Math.random() < 0.1) {
            throw new IllegalStateException(); // Corregido: faltaba la acción del if
        }
        
        System.out.println("¡Conexión a la base de datos exitosa!");
    }

} // <-- Aquí se cierra correctamente la clase ejercicioExcepciones