package behavior.memento;

public class Registro {
    private String nombre;
    private int edad;
    private boolean esActivo;

    public Registro(String nombre, int edad, boolean esActivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.esActivo = esActivo;
    }
    
    public void getRegistro(){
        System.out.print("Nombre: "+nombre);
        System.out.print(", Edad: "+edad);
        System.out.println(", Activo: "+esActivo);
    }
}
