package creation.singleton.marcianos;

public class Computadora {
    private Marcianos marcianos=Marcianos.getMarcianos();

    
    public void crearMarciano(){
        Marcianos.crearMarciano();
    }
    
}
