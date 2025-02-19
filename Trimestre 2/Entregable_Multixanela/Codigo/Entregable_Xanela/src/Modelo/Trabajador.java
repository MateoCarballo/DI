package Modelo;

public class Trabajador {
    private String dni, nombre, provincia, profesion;

    public Trabajador(String dni, String nombre, String provincia, String profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.provincia = provincia;
        this.profesion = profesion;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getProvincia() { return provincia; }
    public String getProfesion() { return profesion; }
}

