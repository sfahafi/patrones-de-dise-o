package creation.mvc3.controlador;

import creation.mvc3.modelo.Logica;
import creation.mvc3.modelo.vo.Persona;
import creation.mvc3.vista.VentanaBuscar;
import creation.mvc3.vista.VentanaPrincipal;
import creation.mvc3.vista.VentanaRegistro;

public class Coordinador {

    private Logica miLogica;
    private VentanaPrincipal miVentanaPrincipal;
    private VentanaRegistro miVentanaRegistro;
    private VentanaBuscar miVentanaBuscar;

    public VentanaPrincipal getMiVentanaPrincipal() {
        return miVentanaPrincipal;
    }

    public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
        this.miVentanaPrincipal = miVentanaPrincipal;
    }

    public VentanaRegistro getMiVentanaRegistro() {
        return miVentanaRegistro;
    }

    public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro) {
        this.miVentanaRegistro = miVentanaRegistro;
    }

    public VentanaBuscar getMiVentanaBuscar() {
        return miVentanaBuscar;
    }

    public void setMiVentanaBuscar(VentanaBuscar miVentanaBuscar) {
        this.miVentanaBuscar = miVentanaBuscar;
    }

    public Logica getMiLogica() {
        return miLogica;
    }

    public void setMiLogica(Logica miLogica) {
        this.miLogica = miLogica;
    }

    public void mostrarVentanaRegistro() {
        miVentanaRegistro.setVisible(true);
    }

    public void mostrarVentanaConsulta() {
        miVentanaBuscar.setVisible(true);
    }

    public void registrarPersona(Persona miPersona) {
        miLogica.validarRegistro(miPersona);
    }

    public Persona buscarPersona(String codigoPersona) {
        return miLogica.validarConsulta(codigoPersona);
    }

    public void modificarPersona(Persona miPersona) {
        miLogica.validarModificacion(miPersona);
    }

    public void eliminarPersona(String codigo) {
        miLogica.validarEliminacion(codigo);
    }

}
