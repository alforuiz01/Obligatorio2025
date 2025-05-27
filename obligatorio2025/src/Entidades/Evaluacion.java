package Entidades;

import java.util.Date;

public class Evaluacion {
    private Usuario idUsuario;
    private Peliculas id;
    private double calificacion;
    private Date timestamp;

    public Evaluacion(Usuario idUsuario, Peliculas id, double calificacion, Date timestamp) {
        this.idUsuario = idUsuario;
        this.id = id;
        this.calificacion = calificacion;
        this.timestamp = timestamp;
    }
}
