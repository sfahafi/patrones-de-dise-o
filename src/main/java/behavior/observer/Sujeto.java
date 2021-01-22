package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observador>observadores;
    private String accion;
    private String lugar;
    
    public Sujeto(){
        observadores=new ArrayList<Observador>();
    }
    
    public void registrarObs(Observador o){
        observadores.add(o);
    }
    
    public void retirarObs(Observador o){
        observadores.remove(o);
    }
    
    public void ejecutarAccion(String accion,String lugar){
        this.accion=accion;
        this.lugar=lugar;
        notificar();
    }
    
    public void notificar(){
        for(Observador o:observadores){
            o.actualizar(accion, lugar);
        }
    }
}
