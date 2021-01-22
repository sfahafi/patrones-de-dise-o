package creation.factory;

import java.util.HashMap;
import java.util.Map;

public class MapaConexiones {
    public static Map<String,String> getMap(){
        Map<String,String>mapaConexiones;
        mapaConexiones=new HashMap();
        mapaConexiones.put("Generic", "creation.factory.GenericConnection");
        mapaConexiones.put("Oracle", "creation.factory.OracleConnection");
        mapaConexiones.put("SQLServer", "creation.factory.SQLServerConnection");
        mapaConexiones.put("MySQL", "creation.factory.MySQLConnection");
        mapaConexiones.put("PostgreSQL", "creation.factory.PostgreSQLConnection");
        return mapaConexiones;
    }
}
