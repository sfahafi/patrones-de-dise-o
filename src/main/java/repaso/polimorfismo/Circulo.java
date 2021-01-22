package repaso.polimorfismo;

public class Circulo extends Forma {

    public Circulo(){
        
    }
    
    public Circulo(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    @Override
    protected void dibujar() {
        System.out.println("Estoy dibujando un circulo.");
    }

    @Override
    protected void redimensionar() {
        System.out.println("Estoy cambiando el tamaño.");
    }
}
