package behavior.memento;

import java.util.ArrayList;

public class BaseDeDatos {

    private ArrayList<Registro> listado;
    private Memento memento;

    public BaseDeDatos() {
        listado = new ArrayList<Registro>();
        memento = new Memento();
    }

    public void agregarRegistro(String nombre, int edad, boolean esActivo) {
        Registro temp = new Registro(nombre, edad, esActivo);
        listado.add(temp);
    }

    public void limpiarBD() {
        listado = null;
    }

    public void mostrarListado() {
        if (listado != null) {
            for (Registro temp : listado) {
                temp.getRegistro();
            }
        } else {
            System.out.println("Base de datos vacia!!");
        }
    }

    public void generarBackup(){
        memento.setBackup(listado);
    }
    
    public void getBackup(int i){
        listado=new ArrayList<Registro>();
        memento.getBackup(i).forEach(listado::add);
    }
    
    public int getSizeBackup(){
        return memento.getSize();
    }
    
}
