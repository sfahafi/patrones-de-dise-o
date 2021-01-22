package repaso.lambda;

public class TestLambda {

    public static void main(String[] args) {
        ICalculadoraLambda iSuma = (x, y) -> x + y;
        System.out.println(iSuma.operacion(4, 5));

        ICalculadoraLambda iMultiplicacion = (x, y) -> x * y;
        System.out.println(iMultiplicacion.operacion(4, 5));
        
        ICalculadoraLambda iResta = (x, y) -> x - y;
        System.out.println(iResta.operacion(4, 5));
        
    }
}
