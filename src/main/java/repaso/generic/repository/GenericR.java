package repaso.generic.repository;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class GenericR<E> {

    private E e;

    public GenericR() {
    }

    public GenericR(E e) {
        this.e = e;
    }
    
    

    public void save(E e) {
        this.e=e;
        String table = e.getClass().getSimpleName();
        Field[] fields = e.getClass().getDeclaredFields();
        String query = "insert into " + table + " (";
        for (int a = 0; a < fields.length; a++) {
            if (a != 0) {
                query += ",";
            }
            query += fields[a].getName();
        }
        query += ") values (";

        for (int a = 0; a < fields.length; a++) {
            if (a != 0) {
                query += ",";
            }
            query += "?";
        }
        query += ")";

        Connection con = Connector.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(query, 1);
            for (int a = 0; a < fields.length; a++) {
                String method = "get" + fields[a].getName().substring(0, 1).toUpperCase()
                        + fields[a].getName().substring(1, fields[a].getName().length());
                //e.getClass().getMethod(method, null).invoke(e);
                if (a == 0) {
                    ps.setObject(a + 1, null);
                } else {
                    ps.setObject(a + 1, e.getClass().getMethod(method, null).invoke(e));
                }
            }
            ps.execute();
        } catch (Exception ex) {
            System.err.println("Ocurrio un error ...");
            System.err.println(ex);
        }

    }

    public void remove(E e) {
        this.e=e;
        String table;
        Connection con;
        PreparedStatement ps;
        String query;
        if (e != null) {
            table = e.getClass().getSimpleName();
            query = "delete from " + table + " where id=?";
            try {
                con = Connector.getConnection();
                ps = con.prepareStatement(query);
                ps.setObject(1, e.getClass().getMethod("getId", null).invoke(e));
                ps.execute();
            } catch (Exception ex) {
                System.err.println("Ocurrio un error ...");
                System.err.println(ex);
            }
        }
    }

    public List<E> getAll() {
        return get("1=1");
    }

    public List<E> get(String filtro) {
        String clazz = e.getClass().getName();
        List<E> lista = new ArrayList();
        String query = "select * from ";
        Connection con;
        ResultSet rs;
        ResultSetMetaData rsmd;
        String field, method;
        try {
            e = (E) Class.forName(clazz).newInstance();
            query += e.getClass().getSimpleName() + " where " + filtro;
            con = Connector.getConnection();
            rs = con.createStatement().executeQuery(query);
            rsmd = rs.getMetaData();
            while (rs.next()) {
                e = (E) Class.forName(clazz).newInstance();
                for (int a = 1; a <= rsmd.getColumnCount(); a++) {
                    field = rsmd.getColumnName(a);
                    method = "set" + field.substring(0, 1)
                            .toUpperCase() + field.substring(1);
                    if (rsmd.getColumnTypeName(a).equals("INT")) {
                        e.getClass().getMethod(method, int.class)
                                .invoke(e, rs.getInt(field));
                    }
                    if (rsmd.getColumnTypeName(a).equals("VARCHAR")) {
                        e.getClass().getMethod(method, String.class)
                                .invoke(e, rs.getString(field));
                    }
                }
                lista.add(e);

            }
            rs.close();

        } catch (Exception ex) {
            System.err.println("Ocurrio un error ...");
            System.err.println(ex);
        }

        return lista;
    }

    public E getById(int id) {
        
        String clazz = e.getClass().getName();
        String query = "select * from ";
        Connection con = Connector.getConnection();;
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        Field[] fields;
        try {
            e = (E) Class.forName(clazz).newInstance();
            query += e.getClass().getSimpleName() + " where id=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                fields = e.getClass().getDeclaredFields();
                rsmd = rs.getMetaData();
                for (int a = 0; a < fields.length; a++) {
                    String method = "set" + fields[a].getName().substring(0, 1).toUpperCase()
                            + fields[a].getName().substring(1, fields[a].getName().length());
                    if (rsmd.getColumnTypeName(a + 1).equals("INT")) {
                        e.getClass().getMethod(method, int.class).invoke(e, rs.getInt(fields[a].getName()));
                    }
                    if (rsmd.getColumnTypeName(a + 1).equals("VARCHAR")) {
                        e.getClass().getMethod(method, String.class).invoke(e, rs.getString(fields[a].getName()));
                    }
                }
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error ...");
            System.err.println(ex);
        }
        return e;
    }

}
