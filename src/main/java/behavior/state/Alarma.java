package behavior.state;

public class Alarma {
    private Estado miEstado;
    
    public void setEstado(Estado estado){
        this.miEstado=estado;
    }
    
    public void ejecutarAccion(){
        miEstado.ejecutarAccion();
    }
}
