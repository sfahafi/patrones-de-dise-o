package creation.builder.improved;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    //Esta Clase arma el robot en tiempo de ejecución
    
    //Robot a construir
    Robot robot;
    
    //Acciones a realizar
    List<String> acciones;
    
    //Constructor que inicializa las acciones (vacias)
    public Builder() {
        acciones=new ArrayList();
    }
    
    //Método que crea el robot
    //dependiendo de lo solicitado por el cliente
    public void setRobot(String tipo) throws Exception{
        robot=(Robot)Class.forName("creation.builder.improved."+tipo).newInstance();
    }
    
    /*
    Métodos que pueden solicitar los clientes en tiempo de ejecución
    y que organizaran los procesos a realizar por el robot.
    */
    public void addItem(String accion){
        acciones.add(accion);
    }
    
    public Robot getRobot(){
        robot.cargarAcciones(acciones);
        return robot;
    }
    
}
