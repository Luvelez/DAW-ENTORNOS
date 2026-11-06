package es.tienda.lamparas;

import java.util.Objects;

public final class Lampara {
    public enum TipoInstalacion {
        PARED,
        TECHO
    }

    private final double alto;
    private final double ancho;
    private final double profundidad;
    private final String color;
    private final TipoInstalacion tipoInstalacion;

    public Lampara(double alto, double ancho, double profundidad, String color,
                   TipoInstalacion tipoInstalacion) {
        this.alto = validarDimension(alto, "alto");
        this.ancho = validarDimension(ancho, "ancho");
        this.profundidad = validarDimension(profundidad, "profundidad");
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("El color no puede estar vacío.");
        }
        this.color = color;
        this.tipoInstalacion = Objects.requireNonNull(tipoInstalacion, "tipoInstalacion");
    }

    private static double validarDimension(double dimension, String nombre) {
        if (!Double.isFinite(dimension) || dimension <= 0) {
            throw new IllegalArgumentException("La dimensión " + nombre + " debe ser positiva.");
        }
        return dimension;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public String getColor() {
        return color;
    }

    public TipoInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Lampara otra)) {
            return false;
        }
        return Double.compare(alto, otra.alto) == 0
                && Double.compare(ancho, otra.ancho) == 0
                && Double.compare(profundidad, otra.profundidad) == 0
                && color.equals(otra.color)
                && tipoInstalacion == otra.tipoInstalacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alto, ancho, profundidad, color, tipoInstalacion);
    }

    @Override
    public String toString() {
        return "Lampara{" + "alto=" + alto + ", ancho=" + ancho + ", profundidad="
                + profundidad + ", color='" + color + '\'' + ", tipoInstalacion="
                + tipoInstalacion + '}';
    }
}
