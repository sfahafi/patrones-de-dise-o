package structure.decorator;

public class Queso extends DecoradorHamburguesa{

    public Queso(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion()+" + Queso";
    }
   
}
