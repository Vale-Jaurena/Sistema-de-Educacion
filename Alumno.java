package Parciales.SistemaDeEducacion;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Nota> cursos;
    public Alumno(String n,String a){
        nombre=n;
        apellido=a;
        cursos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public boolean aprobo(Curso c){
        for (Nota aux:cursos){
            if(aux.getCurso().equals(c) && aux.getNota() >= c.getNotaMin())
                return true;

        }
        return false;
    }
}
