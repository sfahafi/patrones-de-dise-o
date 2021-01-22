package creation.singleton.marcianos;

public class Jugador {
    private Marcianos marcianos=Marcianos.getMarcianos();

    public void destruirMarciano(){
        Marcianos.derribarMarciano();
    }
    
}
