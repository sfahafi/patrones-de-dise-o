package creation.mvc3.modelo.dao;

import creation.mvc3.modelo.conexion.Connector;
import creation.mvc3.modelo.vo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PersonaDao {

    public void registrarPersona(Persona miPersona) {
        Connector conex = new Connector();

        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getIdPersona() + "', '"
                    + miPersona.getNombrePersona() + "', '" + miPersona.getEdadPersona() + "', '"
                    + miPersona.getProfesionPersona() + "', '" + miPersona.getTelefonoPersona() + "')");
            JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }

    public Persona buscarPersona(int codigo) {
        Connector conex = new Connector();
        Persona persona = new Persona();
        boolean existe = false;
        try {
            //Statement estatuto = conex.getConnection().createStatement();
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ? ");
            consulta.setInt(1, codigo);
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                persona.setIdPersona(Integer.parseInt(res.getString("id")));
                persona.setNombrePersona(res.getString("nombre"));
                persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
                persona.setProfesionPersona(res.getString("profesion"));
                persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
            }
            res.close();
            conex.desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }

        if (existe) {
            return persona;
        } else {
            return null;
        }
    }

    public void modificarPersona(Persona miPersona) {

        Connector conex = new Connector();
        try {
            String consulta = "UPDATE persona SET id= ? ,nombre = ? , edad=? , profesion=? , telefono= ? WHERE id= ? ";
            PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

            estatuto.setInt(1, miPersona.getIdPersona());
            estatuto.setString(2, miPersona.getNombrePersona());
            estatuto.setInt(3, miPersona.getEdadPersona());
            estatuto.setString(4, miPersona.getProfesionPersona());
            estatuto.setInt(5, miPersona.getTelefonoPersona());
            estatuto.setInt(6, miPersona.getIdPersona());
            estatuto.executeUpdate();

            JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ", "Confirmación", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void eliminarPersona(String codigo) {
        Connector conex = new Connector();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("DELETE FROM persona WHERE id='" + codigo + "'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Elimino");
        }
    }

}
