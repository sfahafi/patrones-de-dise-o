package creation.mvc;

import creation.mvc.controlador.ControlConversor;
import creation.mvc.modelo.ConversorEurosPesos;
import creation.mvc.vista.InterfazVista;
import creation.mvc.vista.VentanaConversor;

public class ProgramaCordinador {
    public static void main(String[] args) {
        // el modelo:
        ConversorEurosPesos modelo = new ConversorEurosPesos();
        
        // la vista:
        InterfazVista vista = new VentanaConversor();
        
        // y el control:
        ControlConversor control = new ControlConversor(vista, modelo);
        
        // configura la vista
        vista.setControlador(control);
        
        // y arranca la interfaz (vista):
        vista.arranca();

    }
}
