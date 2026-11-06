package es.tienda.lamparas;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Lampara lamparaTecho = new Lampara(
                30, 20, 15, "blanco", Lampara.TipoInstalacion.TECHO);
        Lampara lamparaPared = new Lampara(
                25, 18, 12, "negro", Lampara.TipoInstalacion.PARED);

        tienda.comprarLampara(lamparaTecho);
        tienda.comprarLampara(lamparaPared);
        tienda.venderLampara(lamparaPared);

        System.out.println("Lámparas en inventario: " + tienda.getCantidadLamparas());
        System.out.printf("Superficie de la lámpara: %.2f cm²%n",
                Libreria.calcularSuperficie(lamparaTecho));
    }
}
