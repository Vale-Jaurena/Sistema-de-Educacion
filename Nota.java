package Parciales.SistemaDeEducacion;

import java.time.LocalDate;

public class Nota {
    private Curso curso;
    private LocalDate fecha;
    private Double nota;
    private Alumno alumno;

    public Nota(Curso c, LocalDate f,Double n,Alumno a){
        curso=c;
        fecha=f;
        nota=n;
        alumno=a;
    }

    public Double getNota() {
        return nota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Curso getCurso() {
        return curso;
    }
}
