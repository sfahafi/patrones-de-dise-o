package creation.builder.improved;

import java.util.List;

public interface Robot {

    //Método que pone a trabajar al robot
    void trabajar() throws Exception; 

    /*
    Método que cargará las acciones solicitadas por el builder
    en tiempo de ejecución.
     */
    void cargarAcciones(List<String> acciones);

    List<String> getAcciones();

}
