package repaso.generic.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static Connection conn = null;

    private Connector(){}
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost/colegio", "root", "");
                System.out.println("Se creo el objeto conn. "+conn.hashCode());
            } catch (Exception e) {
                System.err.println("Ocurrio un error ...");
                System.err.println(e);
            }
        }
        System.out.println(conn.hashCode());
        return conn;
    }

    public static void close() {
        if (conn != null) {

            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Ocurrio un error ...");
                System.err.println(e);
            }
        }
    }
}
