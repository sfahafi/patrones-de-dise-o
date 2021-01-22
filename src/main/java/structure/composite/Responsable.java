package structure.composite;

public class Responsable {
    private String nombre;
    private String telefono;

    public Responsable(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + "\t" + telefono;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

}
