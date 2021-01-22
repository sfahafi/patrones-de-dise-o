package structure.adapter;

import java.util.Scanner;

public class PruebaNombre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Nombre objetoNombre=new Nombre();
        
        System.out.println("Digite su nombre y apellido:");
        objetoNombre.setNombreCompuesto(sc.nextLine());
        
        System.out.println("Tu Nombre Compuesto es: "+objetoNombre.getNombreCompuesto());
        
    }
}
