package repaso.lambda;
/*
Java.util.function

Nueva API en Java 1.8 que se conoce como el paquete que contiene interfaces 
funcionales, es decir, interfaces que declaran funciones de uso común . Las 
interfaces en este paquete son anotadas como @FunctionalInterface . Por otro 
lado cabe destacar que dicha anotación, @FunctionalInterface , podemos 
utilizarla en una interfaz que queramos declararla como funcional. Estas 
interfaces funcionales se caracterizan porque pueden ser instanciadas por lambdas.
*/
@FunctionalInterface 
public interface ICalculadoraLambda {
    public int operacion (int x,int y);
}
