package behavior.observer;

public class Informador implements Observador{

    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Informando al jefe, Acción: "+accion+" Lugar: "+lugar);
    }
    
}