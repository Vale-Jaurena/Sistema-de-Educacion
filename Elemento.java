package Parciales.SistemaDeEducacion;

import java.util.List;

public abstract class Elemento {
    private String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }
    public abstract Double getPrecio();
    public abstract List<String> getPalabrasClave();
    public abstract Double getHorasCatedra();
    public abstract boolean aprobo(Alumno a);
    public abstract Double getPrecioXAlumno(Alumno a);
    public abstract int cantCursos();
    public abstract Curso cursoMasCaro();
    public abstract List<Elemento> buscar(Condicion c);
}
