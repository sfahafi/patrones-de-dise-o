package repaso.recursividad;

public class Recursividad1 {

    public static int sumar_dig(int n) {
        if (n == 0) //caso base
        {
            return n;
        } else {
            return sumar_dig(n / 10) + (n % 10);
        }
    }
    
    public static void main(String[] args) {
        /*
        Ejemplo de recursividad:
        Armar un método recursivo que permita sumar los dígitos de un número. 
        Ejemplo: Entrada: 123 Resultado:6
        */
        System.out.println(sumar_dig(123));
    }
}
