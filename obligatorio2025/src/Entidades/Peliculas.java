package Entidades;

import java.util.Date;
import java.util.List;

public class Peliculas {
    private int id;
    private String titulo;
    private String idiomaOriginal;
    private Date estreno;
    private List<String> genero;
    private Sagas idsagas;

    public Peliculas(int id, String titulo, int evaluaciones, String idiomaOriginal, Persona nombre, int claificacion, Date mes, String genero, int id1, String titulo1, String idiomaOriginal1, Date estreno, List<String> genero1, Sagas idsagas) {
        this.setId(id1);
        this.setTitulo(titulo1);
        this.setIdiomaOriginal(idiomaOriginal1);
        this.setEstreno(estreno);
        this.setGenero(genero1);
        this.setIdsagas(idsagas);
    }

        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public String getTitulo () {
            return titulo;
        }

        public void setTitulo (String titulo){
            this.titulo = titulo;
        }

        public String getIdiomaOriginal () {
            return idiomaOriginal;
        }

        public void setIdiomaOriginal (String idiomaOriginal){
            this.idiomaOriginal = idiomaOriginal;
        }

        public Date getEstreno () {
            return estreno;
        }

        public void setEstreno (Date estreno){
            this.estreno = estreno;
        }

        public List<String> getGenero () {
            return genero;
        }

        public void setGenero (List < String > genero) {
            this.genero = genero;
        }

        public Sagas getIdsagas () {
            return idsagas;
        }

        public void setIdsagas (Sagas idsagas){
            this.idsagas = idsagas;
        }
    }