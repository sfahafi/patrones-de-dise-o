package repaso.interfaces;

public interface Interface {

    // En las interfaces solo puede haber atributos finales.
    // Todos los miembros de una interface son publicos. (no es necesario agregar public)
    final String miNombre = "Soy una interface.";
    // En Java 8 se puede poner atributos no final Testeado
    // Debe tener si o si una asignación de valor
    String miNombre2 = "Soy una interface.";
    

    // No se permiten constructores
    // Estos métodos deben obligatoriamente ser implementados por las clases que implementen la interface
    void saludar();

    String getNombre();

    default void metodoDefault() {
        System.out.println("Este es un método default");
    }

    //a partir de Java 8
    static void metodoStatic() {
        System.out.println("Este es un método static");
    }
    /*
    Métodos default en interfaces

    En una interfaz solo podíamos tener constantes y métodos abstractos (cabecera 
    de método), ahora tendremos la posibilidad de declarar métodos con un 
    comportamiento por defecto en una interfaz. Antes de Java 8 podíamos definir 
    que toda clase que implementa a una interfaz debe construir, declarar, dar 
    cuerpo a los distintos métodos que contenga la interfaz. En cambio, en Java 8, 
    toda clase que implemente una interfaz debe declarar los distintos métodos que 
    contenga la interfaz salvo aquellos que estén definidos como métodos por defecto. 
    Estos métodos se caracterizan porque son métodos que están declarados en la 
    propia interfaz y pueden ser utilizados directamente en la clase si nos interesa 
    su comportamiento por defecto. 
     */
}
