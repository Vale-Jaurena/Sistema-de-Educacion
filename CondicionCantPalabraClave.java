package Parciales.SistemaDeEducacion;

public class CondicionCantPalabraClave extends Condicion{
    private int cantPalbras;

    public CondicionCantPalabraClave(int cantPalbras) {
        this.cantPalbras = cantPalbras;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getPalabrasClave().size() <= cantPalbras;
    }
}
