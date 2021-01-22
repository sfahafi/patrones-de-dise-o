package creation.builder.aop;

import java.util.List;

public class Robot {

    //Método que pone a trabajar al robot
    public void trabajar() throws Exception{}; 

    /*
    Método que cargará las acciones solicitadas por el builder
    en tiempo de ejecución.
     */
    public void cargarAcciones(List<String> acciones){};

    public List<String> getAcciones(){return null;};

}