package behavior.responsability;

public class FrontEnd implements InterfaceAyuda{

    private final int TIPO_AYUDA=1;
    private InterfaceAyuda susesor;

    public FrontEnd(InterfaceAyuda susesor) {
        this.susesor = susesor;
    }
    
    @Override
    public void getAyuda(int tipoAyuda) {
        if(tipoAyuda==TIPO_AYUDA){
            System.out.println("\t== Ayuda desde el FrontEnd.");
        }else{
            susesor.getAyuda(tipoAyuda);
        }
    }
    
}
