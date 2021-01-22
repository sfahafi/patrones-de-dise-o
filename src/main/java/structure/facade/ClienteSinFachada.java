package structure.facade;

public class ClienteSinFachada {
    Cpu miCpu;
    
    public ClienteSinFachada(){
        miCpu=new Cpu();
    }
    
    public void encenderCpu(){
        miCpu.enviaVoltaje(220);
        miCpu.enviaEnergiaDispositivos();
        miCpu.reseteaContadores();
        miCpu.revisaBios();
        miCpu.revisaHardware();
        miCpu.asignaCanales();
        miCpu.revisaMemoria();
        miCpu.buscaSectorArranque();
        miCpu.cargaBoot();
        miCpu.cargaSistemaOperativo();
        if(miCpu.cpuLista()){
            System.out.println("CPU Encendida Lista para Trabajar!!!");
        }
    }
    
    public void trabajar(){
        System.out.println("Comienzo a trabajar!!!");
    }
    
    public static void main(String[] args) {
        /*
        Este cliente sin sin chada debe conocer todos los procedimientos para
        encender la CPU.
        */
        ClienteSinFachada csf =new ClienteSinFachada();
        csf.encenderCpu();
        csf.trabajar();

    }
}
