package creation.singleton.connector.injection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private Connection conn = null;
    
    private String driver;
    private String url;
    private String user;
    private String pass;

    public Connector() {
    }

    public Connector(String driver, String url, String user, String pass) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.pass = pass;
    }
    
   
    public Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url, user, pass);
                System.out.println("Se creo el objeto conn. "+conn.hashCode());
            } catch (Exception e) {
                System.err.println("Ocurrio un error ...");
                System.err.println(e);
            }
        }
        System.out.println(conn.hashCode());
        return conn;
    }

    public void close() {
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
