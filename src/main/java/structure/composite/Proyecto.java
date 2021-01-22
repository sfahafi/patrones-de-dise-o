package structure.composite;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Proyecto implements ItemProyecto {

    private String nombre;
    private Responsable responsable;
    //private ArrayList<ItemProyecto> itemsProyecto=new ArrayList<ItemProyecto>();
    private LinkedHashSet<ItemProyecto> itemsProyecto = new LinkedHashSet<ItemProyecto>();
    //la LinkedHashSet mantiene el orden de los elementos como fueron ingresados 
    //y no permite duplicados.

    public Proyecto(String nombre, Responsable responsable) {
        this.nombre = nombre;
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarItemProyecto(ItemProyecto ipr) {
//        if(!itemsProyecto.contains(ipr)){
//            itemsProyecto.add(ipr);
//        }
        itemsProyecto.add(ipr);
    }

    @Override
    public int getTiempo() {
        int tiempoTotal=0;
        for(ItemProyecto item:itemsProyecto){
            tiempoTotal+=item.getTiempo();
        }
        return tiempoTotal;
    }

    @Override
    public void imprimir() {
        System.out.println(getNombre()+" Horas: "+getTiempo()+" Responsable: "+responsable);
        for(ItemProyecto item:itemsProyecto){
            System.out.print("\t");
            item.imprimir(); //Lamado Recursivo!!!
        }
    }

}
