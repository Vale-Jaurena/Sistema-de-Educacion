package Parciales.SistemaDeEducacion;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;

public class Especializacion extends Elemento{
    protected List<Elemento> eles;

    public Especializacion(String nombre) {
        super(nombre);
        eles=new ArrayList<>();
    }
    public boolean tieneElemento(Elemento e){
        for (Elemento aux:eles){
            if(!aux.equals(e)){
                return false;
            }
        }
        return true;
    }
    public void addElemento(Elemento e){
        if(!tieneElemento(e)){
            eles.add(e);
        }
    }

    @Override
    public Double getPrecioXAlumno(Alumno a) {
        Double salida=0.0;
        for (Elemento aux:eles){
            //No tengo que preguntar si el alumno aprobo o no xq si aprobó retorna cero
                salida+=aux.getPrecioXAlumno(a);
        }
        return salida;
    }

    @Override
    public List<Elemento> buscar(Condicion c) {
        List<Elemento> salida=new ArrayList<>();
        for (Elemento aux:eles){
            salida.addAll(aux.buscar(c));
        }
        if(c.cumple(this)){
            salida.add(this);
            return salida;
        }
        else return salida;
    }

    @Override
    public Curso cursoMasCaro() {
        Curso salida=null;
        for (Elemento aux:eles){
            Curso cursoAux= aux.cursoMasCaro();
            if(salida == null){
                salida=cursoAux;
            }
            else {if (salida!=null && cursoAux.getPrecio()> salida.getPrecio())
                    salida= cursoAux;}
        }
        return salida;
    }

    @Override
    public int cantCursos() {
        int salida=0;
        for (Elemento aux:eles){
            salida+= aux.cantCursos();
        }
        return salida;
    }

    @Override
    public boolean aprobo(Alumno a) {
        for(Elemento aux:eles){
            if(!aux.aprobo(a))
                return false;
        }
        return true;
    }

    @Override
    public Double getHorasCatedra() {
        Double salida=0.0;
        for (Elemento aux:eles){
            salida+=aux.getHorasCatedra();
        }
        return salida;
    }

    @Override
    public Double getPrecio() {
        Double salida=0.0;
        for (Elemento aux:eles){
            salida+= aux.getPrecio();
        }
        return salida;
    }

    @Override
    public List<String> getPalabrasClave() {
        List<String> salida= new ArrayList<>();
        for (Elemento aux:eles){
            List<String> copiaPalabras=aux.getPalabrasClave();
            for (String pal:copiaPalabras){
                if(!salida.contains(pal)){
                    salida.add(pal);
                }
            }
        }
        return salida;
    }

}
