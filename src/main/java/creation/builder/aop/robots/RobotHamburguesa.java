package creation.builder.aop.robots;

import creation.builder.aop.Robot;
import java.util.List;

public class RobotHamburguesa extends Robot{
    //Lista de acciones a realizar
    private List<String> acciones;

    //Constructor vacio
    public RobotHamburguesa(){
    }
    
    //Estos métodos son privados con el fin de que nadie los ejecute. solo el builder
    //Los unicos métodos que el cliente no controla, son iniciar() y terminar()
    //Inicia el proceso
    public void iniciar(){
        System.out.println("Iniciando la Hamburguesa");
    }
    
    //Busca los ingredientes
    public void getIngredientes(){
        System.out.println("Buscando: Pan, Hamburguesa, Salsas");
    }
    
    //Arma la hamburguesa
    public void armar(){
        System.out.println("Armando la Hamburguesa");
    }
    
    //Revisa el proceso
    public void revisar(){
        System.out.println("Revisando el proceso");
    }
    
    //Termina el proceso
    public void terminar(){
        System.out.println("Proceso Terminado");
    }
    
    @Override
    public void trabajar() throws Exception {
        System.out.println("Trabajando ....");
        //getAcciones().forEach(System.out::println);
    }

    @Override
    public void cargarAcciones(List<String> acciones) {
        this.acciones=acciones;
    }

    @Override
    public List<String> getAcciones() {
        return acciones;
    }
    
    
}
