package Parciales.SistemaDeEducacion;

public class CondicionHoraCatedra extends Condicion{
    private Double horas;

    public CondicionHoraCatedra(Double horas) {
        this.horas = horas;
    }

    @Override
    public boolean cumple(Elemento e) {
        return  e.getHorasCatedra() >= horas;
    }
}
