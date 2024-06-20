package Parciales.SistemaDeEducacion;

public class CondicionOR extends Condicion{
    private Condicion c1;
    private Condicion c2;
    public  CondicionOR(Condicion a1,Condicion a2){
        c1=a1;
        c2=a2;
    }

    @Override
    public boolean cumple(Elemento e) {
        return c1.cumple(e) || c2.cumple(e);
    }

    public Condicion getC2() {
        return c2;
    }

    public void setC2(Condicion c2) {
        this.c2 = c2;
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }
}
