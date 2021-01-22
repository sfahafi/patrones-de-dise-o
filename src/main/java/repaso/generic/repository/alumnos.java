package repaso.generic.repository;

public class alumnos{
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int curso;

    public alumnos() {
    }

    public alumnos(String nombre, String apellido, int edad, int curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }

    public alumnos(int id, String nombre, String apellido, int edad, int curso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + apellido + "," + edad + "," + curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
}
