package behavior.responsability.improved;

import java.util.Scanner;

public class PruebaCadena {

    public static void main(String[] args) {
        /*
            Manejo de Ayuda
        
            |- FrontEnd
            |- Middle
            v- Aplicacion
        */
        
        Scanner sc = new Scanner(System.in);
        String opcion = "";

        Aplicacion aplicacion = new Aplicacion();
        Middle intermediario = new Middle(aplicacion);
        FrontEnd presentacion = new FrontEnd(intermediario);

        do {
            System.out.println("*********************************************");
            System.out.println("* SELECCIONE LA AYUDA QUE DESEA VER         *");
            System.out.println("* FrontEnd                                  *");
            System.out.println("* Middle                                    *");
            System.out.println("* Aplicacion                                *");
            System.out.println("* Salir                                     *");
            System.out.println("*********************************************");

            opcion = sc.next();
            if (!opcion.equals("Salir")) {
                presentacion.getAyuda(opcion);
            }
        } while (!opcion.equals("Salir"));
    }
}
