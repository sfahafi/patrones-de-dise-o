package creation.builder.improved;

import java.util.List;

public class RobotHamburguesa implements Robot{
    //Lista de acciones a realizar
    private List<String> acciones;

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

    @Override
    public void cargarAcciones(List<String> acciones) {
        this.acciones=acciones;
    }

    @Override
    public List<String> getAcciones() {
        return acciones;
    }
    
    
}
