package creation.factory;

public class Factory {
    
    //Nombre del tipo de conexión
    protected String tipo;

    // Para agregar una nueva conexión se pone en el mapa y ya esta disponible para todo el soft
    public Factory(String tipo) {
        this.tipo = tipo;
    }
    
    public Connection getConnection() throws Exception{
        //El el patron original se usa if o switch
        return (Connection)Class.forName(MapaConexiones.getMap().get(tipo)).newInstance();
    }
    
}
