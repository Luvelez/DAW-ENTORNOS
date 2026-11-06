package es.tienda.lamparas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Tienda {
    private final List<Lampara> inventario = new ArrayList<>();

    public void comprarLampara(Lampara lampara) {
        inventario.add(Objects.requireNonNull(lampara, "lampara"));
    }

    public boolean venderLampara(Lampara lampara) {
        return inventario.remove(Objects.requireNonNull(lampara, "lampara"));
    }

    public List<Lampara> getInventario() {
        return List.copyOf(inventario);
    }

    public int getCantidadLamparas() {
        return inventario.size();
    }
}
