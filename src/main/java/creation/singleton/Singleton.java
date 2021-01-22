package creation.singleton;
public final class Singleton {
    private static final Singleton singleton=new Singleton();
    private static int cantidad=0;
    
    private Singleton(){
        //constructor privado para que solo pueda ser instanciado desde la clase.
        System.out.println("Hola he sido creado una sola vez!!!");
    }
    
    public static Singleton getSingleton(){
        cantidad++;
        return singleton;
    }
    
    public static void cantidad(){
        System.out.println("Se ha llamado al metodo "+cantidad+" veces.");
    }
    
}

/*
class Clase2 extends Singleton{
    //No se puede crear una clase hijas de una clase final
}
*/