package structure.decorator;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class PruebaDecoradorImproved {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("***************************");
        System.out.println("Bienvenido a Comidas Rapida");
        System.out.println("***************************");
        System.out.println();

        Hamburguesa hamburguesa = new Hamburguesa();
        String opcion = "";
        do {
            System.out.println("Con su haburguesa, seleccione su adición:");
            System.out.println("Lechuga, Tomate, Queso, Terminar");
            System.out.println("Se pueden repetir los ingredientes.");
            opcion = sc.nextLine();
            try {
                Constructor c = Class.forName("structure.decorator."+opcion).getConstructor(Hamburguesa.class);
                hamburguesa=(Hamburguesa)c.newInstance(hamburguesa);
                
            } catch (Exception e) {
                //System.out.println(e);
                System.out.println((opcion.equals("Terminar"))?"":"Opción no valida!");
            }
        } while (!opcion.equals("Terminar"));

        System.out.println();
        System.out.println("Entregado....");
        System.out.println(hamburguesa.getDescripcion());
        System.out.println("Disfrute su pedido!!!!");
    }
}
