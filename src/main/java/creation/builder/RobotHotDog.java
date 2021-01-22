package creation.builder;

import java.util.List;

public class RobotHotDog implements Robot{
    //Lista de acciones a realizar
    private List<Integer> acciones;

    public RobotHotDog() {
    }
    
    //Inicia el proceso
    //Internamente los problemas de implementación e idiomas son transparentes
    //al usuario
    private void start(){
        System.out.println("Iniciando el HotDog");
    }
    
    //Busca los ingredientes
    private void getParts(){
        System.out.println("Buscando: Pan, Salchicha, Salsas");
    }
    
    //Arma el HotDog
    private void build(){
        System.out.println("Armando el HotDog");
    }
    
    //Revisa el proceso
    private void check(){
        System.out.println("Revisando el proceso");
    }

    //Termina el proceso
    private void finish(){
        System.out.println("Proceso Terminado");
    }
    
    @Override
    public void trabajar() {
        start();
        for(Integer i:acciones){
            switch(i){
                case 1: getParts(); break;
                case 2: build(); break;
                case 3: check(); break;
                default: System.out.println("Esa Accion no la puedo hacer");
            }
        }
        finish();
    }

    @Override
    public void cargarAcciones(List<Integer> acciones) {
        this.acciones=acciones;
    }
    
}
