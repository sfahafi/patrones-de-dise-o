package creation.mvc.modelo;

public class ConversorEurosPesos extends ConversorEuros {
    
    // Adaptador de clase
    public ConversorEurosPesos(double valorCambio) {
        super(valorCambio);
    }
    
    public ConversorEurosPesos() {
        super(18.50);
    }

    public double eurosAPesos(double cantidad) {
        return eurosAmoneda(cantidad);
    }

    public double pesosAEuros(double cantidad) {
        return monedaAeuros(cantidad);
    }
            
}
