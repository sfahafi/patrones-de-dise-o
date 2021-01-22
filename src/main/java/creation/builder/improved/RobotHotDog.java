package creation.builder.improved;

import java.util.List;

public class RobotHotDog implements Robot {

    //Lista de acciones a realizar
    private List<String> acciones;

    public RobotHotDog() {
    }

    //Inicia el proceso
    //Standarice los nombres de los procesos a fin de que puedan ser invocados desde el mapa
    //al usuario
    private void iniciar() {
        System.out.println("Iniciando el HotDog");
    }

    //Busca los ingredientes
    private void getIngredientes() {
        System.out.println("Buscando: Pan, Salchicha, Salsas");
    }

    //Arma el HotDog
    private void armar() {
        System.out.println("Armando el HotDog");
    }

    //Revisa el proceso
    private void revisar() {
        System.out.println("Revisando el proceso");
    }

    //Termina el proceso
    private void terminar() {
        System.out.println("Proceso Terminado");
    }

    @Override
    public void cargarAcciones(List<String> acciones) {
        this.acciones = acciones;
    }

    @Override
    public List<String> getAcciones() {
        return acciones;
    }
    
    @Override
    public void trabajar() throws Exception {
        this.getClass().getDeclaredMethod("iniciar", null).invoke(this, null);
        getAcciones().forEach(item -> {
            try {
                //System.out.println(item);
                this.getClass().getDeclaredMethod(MapaAcciones.getMap().get(item), null).invoke(this, null);
            } catch (Exception e) {
                System.out.println("Esta Acción no la puedo realizar");
            }
        });
        this.getClass().getDeclaredMethod("terminar", null).invoke(this, null);
    }
}
