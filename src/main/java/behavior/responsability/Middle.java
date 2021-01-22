package behavior.responsability;

public class Middle implements InterfaceAyuda {

    private final int TIPO_AYUDA = 2;
    private InterfaceAyuda susesor;

    public Middle(InterfaceAyuda susesor) {
        this.susesor = susesor;
    }

    @Override
    public void getAyuda(int tipoAyuda) {
        if (tipoAyuda == TIPO_AYUDA) {
            System.out.println("\t++ Ayuda desde el Middle.");
        } else {
            susesor.getAyuda(tipoAyuda);
        }
    }
}
