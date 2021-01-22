package structure.decorator;

public abstract class DecoradorHamburguesa extends Hamburguesa{
    
    protected Hamburguesa hamburguesa;

    @Override
    public abstract String getDescripcion();
    //El método abstracto no se define en la clase padre, pero obliga a las
    //clases hijas a implementarlo.

}
