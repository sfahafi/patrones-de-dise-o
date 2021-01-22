package repaso.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        ImplementaInterface ii=new ImplementaInterface();
        System.out.println(ii.miNombre);
        System.out.println(ii.miNombre2);
        ii.saludar();
        ii.metodoDefault();
        Interface.metodoStatic();
    }
}
