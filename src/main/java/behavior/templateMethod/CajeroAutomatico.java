package behavior.templateMethod;

public class CajeroAutomatico extends CuentaBancaria{

    public CajeroAutomatico(String cuenta,int importe, int tipo) {
        procesar(cuenta,importe,tipo);
    }
 
    @Override
    public void saludar() {
        System.out.println("Por favor ingrese los datos...");
    }
    
}
