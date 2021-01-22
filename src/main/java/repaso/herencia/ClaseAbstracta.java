package repaso.herencia;

public abstract class ClaseAbstracta {
    public String nombre;
    public void saludar(){
        System.out.println("Hola soy "+nombre);
    }
    
    // Método que sera implementado en una clase hija.
    public abstract void despedir();
}
