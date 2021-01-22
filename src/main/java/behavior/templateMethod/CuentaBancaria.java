package behavior.templateMethod;

public abstract class CuentaBancaria {
    private String cuenta;
    private int saldo=0;
    
    private void setCuenta(String cuenta){
        this.cuenta=cuenta;
    }
    
    private void consignar(int saldo){
        System.out.println("Consignando...");
        this.saldo+=saldo;
    }
    
    private void retirar(int saldo){
        System.out.println("Retirando...");
        if(saldo<=this.saldo-10){
            this.saldo-=saldo;
        }else{
            System.out.println("No se puede retirar ese monto.");
        }
    }
    
    private void consultarSaldo(){
        System.out.println("El saldo es: "+this.saldo);
    }
    
    protected void auditoria(){
        System.out.println("Se ha procesador la cuenta: "+this.cuenta);
    }
    
    public abstract void saludar();
    
    public void procesar(String cuenta,int importe, int tipo){
        saludar();
        setCuenta(cuenta);
        //No lo pude factorizar
        switch(tipo){
            case 1: consignar(importe);break;
            case 2: retirar(importe); break;
            default: System.out.println("Opción no valida.");
        }
        consultarSaldo();
        auditoria();
    }
    
}
