package behavior.observer;

public class Correo implements Observador{

    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Enviando correo, Acción: "+accion+" Lugar: "+lugar);
    }
    
}
