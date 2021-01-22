package structure.composite;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Tarea implements ItemProyecto{

    private String nombre;
    private Responsable responsable;
    private int tiempoRequerido;
    //private ArrayList<ItemProyecto> itemsTarea=new ArrayList<ItemProyecto>();
    private LinkedHashSet<ItemProyecto> itemsTarea = new LinkedHashSet<ItemProyecto>();

    public Tarea(String nombre, Responsable responsable, int tiempoRequerido) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.tiempoRequerido = tiempoRequerido;
    }
    
    public void agregarItemTarea(ItemProyecto ipr){
//        if(!itemsTarea.contains(ipr)){
//            itemsTarea.add(ipr);
//        }
    itemsTarea.add(ipr);
    }
    
    @Override
    public int getTiempo() {
        int tiempoTotal=tiempoRequerido;
        for(ItemProyecto item:itemsTarea){
            tiempoTotal+=item.getTiempo();
        }
        return tiempoTotal;
    }

    @Override
    public void imprimir() {
        System.out.println("\t"+this.nombre+" Horas: "+getTiempo()+" Responsable: "+responsable);
        for(ItemProyecto item:itemsTarea){
            System.out.print("\t\t");
            item.imprimir();
            //lamado recursivo.
        }
    }
    
}
