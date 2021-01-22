package structure.composite;

public class Entregable implements ItemProyecto{

    private String nombre;
    
    public Entregable(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public int getTiempo() {
        return 0;
        /*
        El entregable no tiene horas asignadas,
        Las horas asignadas se le asignas a tares o subtareas.
        */
    }

    @Override
    public void imprimir() {
        System.out.println("\tEntregable: "+this.nombre);
    }
    
}
