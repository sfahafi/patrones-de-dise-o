package creation.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        //Singleton miSingleton=new Singleton();
        Singleton miSingleton1=Singleton.getSingleton();
        Singleton miSingleton2=Singleton.getSingleton();
        Singleton miSingleton3=Singleton.getSingleton();
        Singleton miSingleton4=Singleton.getSingleton();
        Singleton miSingleton5=Singleton.getSingleton();

        Singleton.cantidad();
        
        System.out.println(miSingleton1.hashCode());
        System.out.println(miSingleton2.hashCode());
        System.out.println(miSingleton3.hashCode());
        System.out.println(miSingleton4.hashCode());
        System.out.println(miSingleton5.hashCode());
        
        System.out.println("He terminado de construir los objetos");
        
    }
}
