package structure.facade;

public class ClienteConFachada {
    /*
    Este cliente no requiere conocer la complejidad de encender la CPU
    */
    private Fachada miFachada;
    
    public ClienteConFachada(){
        miFachada=new Fachada();
    }
    
    public void encenderCPU(){
        miFachada.encenderCPU();
        System.out.println("Comienzo a trabajar!!!");
    }
    
    public static void main(String[] args) {
        ClienteConFachada ccf=new ClienteConFachada();
        ccf.encenderCPU();
    }
    
}
