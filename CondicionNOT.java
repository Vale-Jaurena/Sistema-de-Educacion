package Parciales.SistemaDeEducacion;

public class CondicionNOT extends Condicion{
    private Condicion c1;
    public CondicionNOT(Condicion a1){
        c1=a1;
    }

    @Override
    public boolean cumple(Elemento e) {
        return !c1.cumple(e);
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }
}
