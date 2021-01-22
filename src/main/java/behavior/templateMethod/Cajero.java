package behavior.templateMethod;

public class Cajero extends CuentaBancaria{

    public Cajero(String cuenta, int importe, int tipo){
        procesar(cuenta, importe, tipo);
    }
    
    @Override
    public void saludar() {
        System.out.println("Bienvenido a su banco, en que le puedo ayudar?");
    }
    
    @Override
    public void auditoria(){
       super.auditoria();
        System.out.println("Con mucho gusto, vuelva pronto");
    }
}
