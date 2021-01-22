package repaso.interfaces;

public class ImplementaInterface implements Interface{

    public ImplementaInterface() {
        saludar();
    }
  
    @Override
    public void saludar() {
        System.out.println("Hola soy "+getNombre());
    }

    @Override
    public String getNombre() {
      return miNombre;
    }
 
}
