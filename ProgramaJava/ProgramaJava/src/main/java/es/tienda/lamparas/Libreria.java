package es.tienda.lamparas;

import java.util.Objects;

public final class Libreria {
    private Libreria() {
    }

    public static double calcularSuperficie(Lampara lampara) {
        Objects.requireNonNull(lampara, "lampara");
        double alto = lampara.getAlto();
        double ancho = lampara.getAncho();
        double profundidad = lampara.getProfundidad();
        return 2 * (alto * ancho + alto * profundidad + ancho * profundidad);
    }
}
