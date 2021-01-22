package structure.decorator;

import java.util.Scanner;

public class PruebaDecorador {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("***************************");
        System.out.println("Bienvenido a Comidas Rapida");
        System.out.println("***************************");
        System.out.println();
        
        Hamburguesa hamburguesa=new Hamburguesa();
        int opcion=0;
        do{
            System.out.println("Con su haburguesa, seleccione su adición:");
            System.out.println("1=Lechuga, 2=Tomate, 3=Queso, 0=Terminar");
            System.out.println("Se pueden repetir los ingredientes.");
            opcion=sc.nextInt();
            switch(opcion){
                case 0: break;
                case 1: hamburguesa=new Lechuga(hamburguesa);   break;
                case 2: hamburguesa=new Tomate(hamburguesa);    break;
                case 3: hamburguesa=new Queso(hamburguesa);     break;
                default:    System.out.println("Opción no valida.");
            }
        }while(opcion!=0);
        
        System.out.println();
        System.out.println("Entregado....");
        System.out.println(hamburguesa.getDescripcion());
        System.out.println("Disfrute su pedido!!!!");
    }
}
