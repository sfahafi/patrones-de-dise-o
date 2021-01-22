package creation.builder;

import java.util.List;

public class RobotHamburguesa implements Robot{
    //Lista de acciones a realizara
    private List<Integer> acciones;

    //Constructor vacio
    public RobotHamburguesa(){
    }
    
    //Estos métodos son privados con el fin de que nadie los ejecute. solo el builder
    //Los unicos métodos que el cliente no controla, son iniciar() y terminar()
    //Inicia el proceso
    private void iniciar(){
        System.out.println("Iniciando la Hamburguesa");
    }
    
    //Busca los ingredientes
    private void getIngredientes(){
        System.out.println("Buscando: Pan, Hamburguesa, Salsas");
    }
    
    //Arma la hamburguesa
    private void armar(){
        System.out.println("Armando la Hamburguesa");
    }
    
    //Revisa el proceso
    private void revisar(){
        System.out.println("Revisando el proceso");
    }
    
    //Termina el proceso
    private void terminar(){
        System.out.println("Proceso Terminado");
    }
    
    @Override
    public void trabajar() {
        iniciar();
        for(Integer i:acciones){
            switch(i){
                case 1: getIngredientes(); break;
                case 2: armar(); break;
                case 3: revisar(); break;
                default: System.out.println("Esta acción no la puedo hacer");
            }
        }
        terminar();
    }

    @Override
    public void cargarAcciones(List<Integer> acciones) {
        this.acciones=acciones;
    }
    
}
