package structure.facade;

public class Fachada {
    private Cpu miCpu;
    
    public Fachada(){
        miCpu=new Cpu();
    }
    
    public void encenderCPU(){
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
    
}
