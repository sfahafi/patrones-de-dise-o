package creation.factory;

public class InheritedFactory extends AbstractFactory{
    //Fabrica Heredada
  
    @Override
    protected Connection getConnection(String tipo) throws Exception{
        //El el patron original se usa if o switch
        return (Connection)Class.forName(MapaConexiones.getMap().get(tipo)).newInstance();
    }
    
}
