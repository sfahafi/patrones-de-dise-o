package behavior.memento;

import java.util.Scanner;

public class PruebaMemento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        BaseDeDatos bd = new BaseDeDatos();

        bd.agregarRegistro("Alexis Lozada", 33, true);
        bd.agregarRegistro("Laura Salinas", 35, true);
        bd.generarBackup();

        bd.agregarRegistro("Carlos Rios", 43, true);
        bd.agregarRegistro("Leidy Gomez", 23, true);
        bd.generarBackup();

        bd.agregarRegistro("Marina Fernandez", 24, true);
        bd.agregarRegistro("Gerardo Tapia", 27, true);
        bd.generarBackup();

        //No factorice el codigo, ni saque el switch case por que no son 
        //homogenas las opciones.
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    bd.mostrarListado();
                    break;
                case 2:
                    bd.limpiarBD();
                    System.out.println("Base de datos borrada.");
                    break;
                case 3:
                    muestraBackup(bd.getSizeBackup());
                    bd.getBackup(sc.nextInt() - 1);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("No ha ingresado una opción valida");
            }
        } while (opcion != 0);

    }

    public static void mostrarMenu() {
        System.out.println("*************************************************");
        System.out.println("* Selecciones una opcion de la BD               *");
        System.out.println("*1-Listar.  2-Limpiar.  3-Restaura BD.  0-Salir.*");
        System.out.println("*************************************************");
    }

    public static void muestraBackup(int t) {
        System.out.format("Existen %s backups.", t);
        System.out.print("\nDigite el backup que desea restaurar: ");
    }
}
