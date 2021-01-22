package behavior.observer;

public class Auditor implements Observador {

    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Guardando en la BD, Acción: " + accion + " Lugar: " + lugar);
    }

}
