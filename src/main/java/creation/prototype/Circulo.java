package creation.prototype;

public class Circulo implements Figura{
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
        System.out.println("Circulo en x:"+posicionX);
        System.out.println("Circulo en y:"+posicionY);
    }

    @Override
    public Figura clonar() {
        /*
        El método clonar, crea un objeto nuevo y copia el estado del objeto actual
        */
        
        Figura figura=new Circulo();
        figura.setNombre(nombre);
        figura.mover(posicionX, posicionY);
        return figura;
    }
  
}
