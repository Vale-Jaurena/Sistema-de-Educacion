package Parciales.SistemaDeEducacion;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Elemento{
    private  Double precio;
    private Double notaMin;
    private Double horasCatedra;
    private List<String> palabrasClave;

   public Curso (String nombre, Double p,Double n,Double h){
       super(nombre);
       precio=p;
       notaMin=n;
       horasCatedra=h;
       palabrasClave= new ArrayList<>();
   }
   public  boolean tienePalabra(String h){
       for (String aux: palabrasClave){
           if(! aux.contains(h)){
               return  false;
           }
       }
       return true;
   }
   public void addPalabra(String g){
       if(!tienePalabra(g)){
           palabrasClave.add(g);
       }
   }

    @Override
    public Curso cursoMasCaro() {
        return this;
    }

    @Override
    public boolean aprobo(Alumno a) {
       return  a.aprobo(this);
    }

    @Override
    public Double getPrecioXAlumno(Alumno a) {
        if(!a.aprobo(this))
            return precio;
        else
            return 0.0;
    }

    @Override
    public int cantCursos() {
        return 1;
    }

    @Override
    public List<Elemento> buscar(Condicion c) {
       List<Elemento> salida=new ArrayList<>();
        if(c.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    @Override
    public Double getHorasCatedra() {
        return horasCatedra;
    }

    public Double getNotaMin() {
        return notaMin;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public List<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }
}
