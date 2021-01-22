package creation.mvc3.modelo.conexion;

import java.sql.*;

public class Connector {

    static String bd = "mvc";
    static String user = "root";
    static String pass = "";
    static String url = "jdbc:mysql://localhost/" + bd;

    Connection conn = null;

    public Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn=DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                System.err.println("Ocurrio un error ...");
                System.err.println(e);
            }
        }
        return conn;
    }

    public void desconectar() {
        conn = null;
    }

}
