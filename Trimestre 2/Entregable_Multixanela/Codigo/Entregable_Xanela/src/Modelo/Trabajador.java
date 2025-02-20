package Modelo;

public class Trabajador {
    private String dni, nombre,apellido1, apellido2, provincia, profesion;

    public Trabajador(String dni, String nombre, String apellido1, String apellido2, String provincia, String profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.provincia = provincia;
        this.profesion = profesion;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getProvincia() { return provincia; }
    public String getProfesion() { return profesion; }
}

