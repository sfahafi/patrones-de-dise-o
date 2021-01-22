package creation.mvc.modelo;

public class ConversorEurosPesosAlternativo {
    // Adaptador de objetos

    private ConversorEuros conversor;

    public ConversorEurosPesosAlternativo() {
        conversor = new ConversorEuros(18.5);
    }

    public double eurosAPesos(double cantidad) {
        return conversor.eurosAmoneda(cantidad);
    }

    public double pesosAEuros(double cantidad) {
        return conversor.monedaAeuros(cantidad);
    }
    
}
