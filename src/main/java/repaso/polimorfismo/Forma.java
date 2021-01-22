package repaso.polimorfismo;

public abstract class Forma {
    protected int posicionX;
    protected int posicionY;

    protected Forma() {
    }

    protected Forma(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    protected void mover(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    protected void dondeEstoy(){
        System.out.println("Estoy en \tx="+posicionX+"\ty="+posicionY);
    }
    
    protected abstract void dibujar();
    protected abstract void redimensionar();
    
}
