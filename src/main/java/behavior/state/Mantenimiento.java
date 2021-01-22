package behavior.state;

public class Mantenimiento implements Estado{

    @Override
    public void ejecutarAccion() {
        System.out.println("Estado en mantenimiento: No Atento");
        System.out.println("Enviar Correo para informar el estado");
    }
    
}
