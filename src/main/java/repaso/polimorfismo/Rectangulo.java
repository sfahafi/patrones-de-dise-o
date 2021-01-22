package repaso.polimorfismo;

public class Rectangulo extends Forma{

    public Rectangulo(){
        
    }
    
    public Rectangulo(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    @Override
    protected void dibujar() {
        System.out.println("Estoy dibujando un rectangulo.");
    }

    @Override
    protected void redimensionar() {
        System.out.println("Estoy cambiando el tamaño.");
    }
    
}
