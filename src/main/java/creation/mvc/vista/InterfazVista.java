package creation.mvc.vista;

import creation.mvc.controlador.ControlConversor;

public interface InterfazVista {
    void setControlador(ControlConversor c);
    void arranca(); // comienza la visualización
    double getCantidad(); // cantidad a convertir
    void escribeCambio(String s); //texto con la conversión
    // Constantes que definen las posibles operaciones:
    static final String AEUROS="Pesos a Euros";
    static final String APESOS="Euros a Pesos";
}
