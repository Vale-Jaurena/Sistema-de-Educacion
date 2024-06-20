package Parciales.SistemaDeEducacion;

public class Optativa extends Especializacion{
    public Optativa(String nombre) {
        super(nombre);
    }

    @Override
    public boolean aprobo(Alumno a) {
        int cant =0;
        for(Elemento aux:eles){
            if(aux.aprobo(a)){
                cant++;
            }
        }
        return cant >= (eles.size()/2);
    }
}
