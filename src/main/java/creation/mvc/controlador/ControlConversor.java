package creation.mvc.controlador;

import creation.mvc.modelo.ConversorEurosPesos;
import creation.mvc.vista.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlConversor implements ActionListener {

    /*
    Interfaz ActionListener
    Se usa para detectar y manejar eventos de acción, osea, los que tienen lugar
    cuando se produce una acción sobre un elemento del programa.
    
    Un evento ActionEvent se produce:

    al pulsar un botón.
    al hacer doble clic en un elemento de lista.
    al pulsar INTRO en una caja de texto.
    al elegir un menú.

    Los distintos elementos del programa están  vigilados por Listeners que 
    detectan las acciones que tienen lugar sobre el elemento vigilado. Cuando 
    ActionListener detecta una acción se genera un evento de acción 
    (ActionEvent) en el elemento. Los ActionEvent invocan el método 
    actionPerformed(ActionEvent e) que realiza las acciones programadas ante ese
    evento.
     */

    private InterfazVista vista;
    private ConversorEurosPesos modelo;

    public ControlConversor(InterfazVista vista, ConversorEurosPesos modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        double cantidad = vista.getCantidad();
        if (evento.getActionCommand().equals(InterfazVista.AEUROS)) {
            vista.escribeCambio(cantidad + " pesos son: " + modelo.pesosAEuros(cantidad) + " euros");
        } else if (evento.getActionCommand().equals(InterfazVista.APESOS)) {
            vista.escribeCambio(cantidad + " euros son: " + modelo.eurosAPesos(cantidad) + " pesos");
        } else {
            vista.escribeCambio("ERROR");
        }
    }

}
