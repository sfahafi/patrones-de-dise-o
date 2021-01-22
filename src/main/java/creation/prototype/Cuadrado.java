package creation.prototype;

public class Cuadrado implements Figura{
    private String nombre;
    private int posicionX,posicionY;

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void mover(int x, int y) {
        this.posicionX=x;
        this.posicionY=y;
    }

    @Override
    public void getPosicion() {
        System.out.println("Cuadrado en x:"+posicionX);
        System.out.println("Cuadrado en y:"+posicionY);
    }

    @Override
    public Figura clonar() {
        Figura figura=new Cuadrado();
        figura.setNombre(nombre);
        figura.mover(posicionX, posicionY);
        return figura;
    }
 
}
