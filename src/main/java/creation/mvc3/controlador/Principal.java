package creation.mvc3.controlador;

import creation.mvc3.modelo.Logica;
import creation.mvc3.vista.VentanaBuscar;
import creation.mvc3.vista.VentanaPrincipal;
import creation.mvc3.vista.VentanaRegistro;


public class Principal {

    Logica miLogica;
    VentanaPrincipal miVentanaPrincipal;
    VentanaBuscar miVentanaBuscar;
    VentanaRegistro miVentanaRegistro;
    Coordinador miCoordinador;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Principal miPrincipal = new Principal();
        miPrincipal.iniciar();
    }

    /**
     * Permite instanciar todas las clases con las que trabaja el sistema
     */
    private void iniciar() {
        /*Se instancian las clases*/
        miVentanaPrincipal = new VentanaPrincipal();
        miVentanaRegistro = new VentanaRegistro();
        miVentanaBuscar = new VentanaBuscar();
        miLogica = new Logica();
        miCoordinador = new Coordinador();

        /*Se establecen las relaciones entre clases*/
        miVentanaPrincipal.setCoordinador(miCoordinador);
        miVentanaRegistro.setCoordinador(miCoordinador);
        miVentanaBuscar.setCoordinador(miCoordinador);
        miLogica.setCoordinador(miCoordinador);

        /*Se establecen relaciones con la clase coordinador*/
        miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
        miCoordinador.setMiVentanaRegistro(miVentanaRegistro);
        miCoordinador.setMiVentanaBuscar(miVentanaBuscar);
        miCoordinador.setMiLogica(miLogica);

        miVentanaPrincipal.setVisible(true);
    }

}
