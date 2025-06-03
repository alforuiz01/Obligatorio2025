package Entidades;

public class Usuario {
    private String nombre;
    private Persona dni;

    public Usuario(String nombre, Persona dni) {
        this.setNombre(nombre);
        this.setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDni() {
        return dni;
    }

    public void setDni(Persona dni) {
        this.dni = dni;
    }
}
