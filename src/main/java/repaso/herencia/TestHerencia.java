package repaso.herencia;

public class TestHerencia extends ClaseAbstracta{

    public TestHerencia(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void despedir() {
        System.out.println("Chau");
    }
    
    public static void main(String[] args) {
        TestHerencia th=new TestHerencia("Clase Abstracta");
        th.saludar();
        th.despedir();
    }
}
