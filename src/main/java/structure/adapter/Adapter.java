package structure.adapter;

public class Adapter {
    private Nombre objetoNombre;
    private String nombre;
    private String apellido;
    
    public Adapter(Nombre n){
        this.objetoNombre=n;
        setNombre(objetoNombre.getNombreCompuesto().split(" ")[0]);
        setApellido(objetoNombre.getNombreCompuesto().split(" ")[1]);
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
    
}
