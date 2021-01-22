package creation.builder.aop.robots;

import creation.builder.aop.Robot;
import java.util.List;

public class RobotHotDog extends Robot {

    //Lista de acciones a realizar
    private List<String> acciones;

    public RobotHotDog() {
    }

    //Inicia el proceso
    //Standarice los nombres de los procesos a fin de que puedan ser invocados desde el mapa
    //al usuario
    public void iniciar() {
        System.out.println("Iniciando el HotDog");
    }

    //Busca los ingredientes
    public void getIngredientes() {
        System.out.println("Buscando: Pan, Salchicha, Salsas");
    }

    //Arma el HotDog
    public void armar() {
        System.out.println("Armando el HotDog");
    }

    //Revisa el proceso
    public void revisar() {
        System.out.println("Revisando el proceso");
    }

    //Termina el proceso
    public void terminar() {
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
        System.out.println("Trabajando ....");
    }
}
