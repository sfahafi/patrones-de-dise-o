package behavior.responsability.improved;

public class FrontEnd implements InterfaceAyuda{

    private InterfaceAyuda susesor;

    public FrontEnd(InterfaceAyuda susesor) {
        this.susesor = susesor;
    }
    
    @Override
    public void getAyuda(String tipoAyuda) {
        if(tipoAyuda.equals(this.getClass().getSimpleName())){
            System.out.println("\t== Ayuda desde el FrontEnd.");
        }else{
            susesor.getAyuda(tipoAyuda);
        }
    }
    
}
