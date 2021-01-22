package creation.mvc3.modelo;

import creation.mvc3.controlador.Coordinador;
import creation.mvc3.modelo.dao.PersonaDao;
import creation.mvc3.modelo.vo.Persona;
import javax.swing.JOptionPane;

public class Logica {

    private Coordinador miCoordinador;
    public static boolean consultaPersona = false;
    public static boolean modificaPersona = false;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;

    }

    public void validarRegistro(Persona miPersona) {
        PersonaDao miPersonaDao;
        if (miPersona.getIdPersona() > 99) {
            miPersonaDao = new PersonaDao();
            miPersonaDao.registrarPersona(miPersona);
        } else {
            JOptionPane.showMessageDialog(null, "El documento de la persona debe ser mas de 3 digitos", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }

    public Persona validarConsulta(String codigoPersona) {
        PersonaDao miPersonaDao;

        try {
            int codigo = Integer.parseInt(codigoPersona);
            if (codigo > 99) {
                miPersonaDao = new PersonaDao();
                consultaPersona = true;
                return miPersonaDao.buscarPersona(codigo);
            } else {
                JOptionPane.showMessageDialog(null, "El documento de la persona debe ser mas de 3 digitos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                consultaPersona = false;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
            consultaPersona = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
            consultaPersona = false;
        }

        return null;
    }

    public void validarModificacion(Persona miPersona) {
        PersonaDao miPersonaDao;
        if (miPersona.getNombrePersona().length() > 5) {
            miPersonaDao = new PersonaDao();
            miPersonaDao.modificarPersona(miPersona);
            modificaPersona = true;
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de la persona debe ser mayor a 5 digitos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            modificaPersona = false;
        }
    }

    public void validarEliminacion(String codigo) {
        PersonaDao miPersonaDao = new PersonaDao();
        miPersonaDao.eliminarPersona(codigo);
    }

}
