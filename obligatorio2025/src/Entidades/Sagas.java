package Entidades;

import java.util.List;

public class Sagas {
    private int idSaga;
    private String nombreColeccion;
    private List<Peliculas> peliculas;
    private double ingresos;

    public Sagas(int idSaga, String nombreColeccion, List<Peliculas> peliculas, double ingresos) {
        this.setIdSaga(idSaga);
        this.setNombreColeccion(nombreColeccion);
        this.setPeliculas(peliculas);
        this.setIngresos(ingresos);
    }

    public int getIdSaga() {
        return idSaga;
    }

    public void setIdSaga(int idSaga) {
        this.idSaga = idSaga;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public List<Peliculas> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
}
