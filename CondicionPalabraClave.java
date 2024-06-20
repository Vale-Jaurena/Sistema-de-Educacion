package Parciales.SistemaDeEducacion;

public class CondicionPalabraClave extends  Condicion{
    private String palabra;

    public CondicionPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getPalabrasClave().equals(palabra);
    }
}
