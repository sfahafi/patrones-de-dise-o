package behavior.responsability.improved;

public class Aplicacion implements InterfaceAyuda{
    private InterfaceAyuda susesor;

    public Aplicacion() {
    }
    
    @Override
    public void getAyuda(String tipoAyuda) {
        if(tipoAyuda.equals(this.getClass().getSimpleName())){
            System.out.println("\t-- Ayuda desde la Aplicación.");
        }else{
            susesor.getAyuda(tipoAyuda);
        }
    }
}
