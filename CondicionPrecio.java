package Parciales.SistemaDeEducacion;

public class CondicionPrecio extends  Condicion{
    private Double precio;

    public CondicionPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getPrecio()>precio;
    }
}
