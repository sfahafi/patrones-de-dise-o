package structure.decorator;

public class Tomate extends DecoradorHamburguesa{

    public Tomate(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion()+" + Tomate";
    }

}
