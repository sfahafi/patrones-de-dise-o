package behavior.responsability;

public class Aplicacion implements InterfaceAyuda{
    private final int TIPO_AYUDA=3;
    private InterfaceAyuda susesor;

    public Aplicacion() {
    }
    
    @Override
    public void getAyuda(int tipoAyuda) {
        if(tipoAyuda==TIPO_AYUDA){
            System.out.println("\t-- Ayuda desde la Aplicación.");
        }else{
            susesor.getAyuda(tipoAyuda);
        }
    }
}
