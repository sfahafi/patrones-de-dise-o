package creation.factory;

public abstract class AbstractFactory {

    public AbstractFactory() {
    }
    /*
    Fabrica de fabricas: La diferencia es que el método getConnection recibe como
    parametro el tipo y no se hace por constructor.
    */    
    //Metodo que sea implementado por las clases hijas
    protected abstract Connection getConnection(String tipo) throws Exception;
}
