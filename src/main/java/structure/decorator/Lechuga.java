package structure.decorator;

public class Lechuga extends DecoradorHamburguesa {
    
    public Lechuga(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }
    
    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion()+" + lechuga";
    }



}
