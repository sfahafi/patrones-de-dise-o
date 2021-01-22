package behavior.responsability.improved;

public class Middle implements InterfaceAyuda {

    private final int TIPO_AYUDA = 2;
    private InterfaceAyuda susesor;

    public Middle(InterfaceAyuda susesor) {
        this.susesor = susesor;
    }

    @Override
    public void getAyuda(String tipoAyuda) {
        if (tipoAyuda.equals(this.getClass().getSimpleName())) {
            System.out.println("\t++ Ayuda desde el Middle.");
        } else {
            susesor.getAyuda(tipoAyuda);
        }
    }
}
