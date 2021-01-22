package creation.builder;

import java.util.List;

public interface Robot {
    
    //Método que pone a trabajar al robot
    void trabajar();
    
    /*
    Método que cargará las acciones solicitadas por el builder
    en tiempo de ejecución.
    */
    void cargarAcciones(List<Integer> acciones);
}
