package creation.builder.aop;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Builder {
    //Esta Clase arma el robot en tiempo de ejecución
    
    //Robot a construir
    Robot robot;
    
    //Acciones a realizar
    List<String> acciones;
    
    //Constructor que inicializa las acciones (vacias)
    public Builder() {
        acciones=new ArrayList<String>();
    }
    
    //Método que crea el robot
    //dependiendo de lo solicitado por el cliente
    public void setRobot(String tipoRobot,ApplicationContext context) throws Exception{
        //sin aop
        //robot=(Robot)context.getBean(tipo);

        //con aop ServiceProxy
        robot=context.getBean(tipoRobot+"ServiceProxy",Robot.class);
        //this.robot=robot;
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
