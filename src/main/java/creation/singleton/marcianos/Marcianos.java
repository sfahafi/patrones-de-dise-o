package creation.singleton.marcianos;

public final class Marcianos {
    private final static Marcianos marcianos=new Marcianos();
    private static int cantidad;

    public Marcianos() {
        cantidad=10;
    }

    public static Marcianos getMarcianos() {
        return marcianos;
    }
    
    public static void derribarMarciano(){
        if(cantidad>0){
            System.out.println("-- Derribe un marciano.");
            cantidad--;
        }
    }
    
    public static void crearMarciano(){
        if(cantidad>0){
            System.out.println("-- El enemigo creo un marciano.");
            cantidad++;
        }
    }
    
    public static void cuantosQuedan(){
        if(cantidad>0){
            System.out.println("-- Quedan "+cantidad+" Marciano.");
        }else{
            System.out.println("Felicitaciones usted ha gando.");
        }
    }
    
}
