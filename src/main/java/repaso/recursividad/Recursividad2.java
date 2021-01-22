package repaso.recursividad;

public class Recursividad2 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1; //Caso Base
        } else {
            return n * factorial(n - 1);  //Fórmula Recursiva
        }
    }
    
    public static void main(String[] args) {
        for(int a=0;a<=10;a++) System.out.println("Factorial de "+a+"="+factorial(a));
    }
    
}
