package creation.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String[] args) throws Exception{
        
        Scanner sc=new Scanner(System.in);
        int opcion,posX,posY;
        
        Circulo circulo=new Circulo();
        Cuadrado cuadrado=new Cuadrado();
        
        Figura figura;
        
        circulo.setNombre("Mi circulo");
        circulo.mover(12, 34);
        
        cuadrado.setNombre("Mi cuadrado");
        cuadrado.mover(200, 200);
        
        System.out.println("Estas son las figuras originales:");
        System.out.println("Circulo: "+circulo.getNombre());
        circulo.getPosicion();
        System.out.println("Cuadrado: "+cuadrado.getNombre());
        cuadrado.getPosicion();
        
        
        /*
        System.out.println("Digite la opción de que desea clonar:");
        System.out.println("1= Circulo, 2 = Cuadrado");
        opcion=sc.nextInt();
        if(opcion==1){
            figura=circulo.clonar();
        }else{
            figura=cuadrado.clonar();
        }
        */
        
        // Opción más elegante
        Map<String,Figura>mapa =new HashMap();
        mapa.put("Circulo", circulo);
        mapa.put("Cuadrado", cuadrado);
        System.out.println("Digite la opción de que desea clonar: Circulo o Cuadraro :");
        String clazz=sc.nextLine();
        figura=mapa.get(clazz).clonar();
        
        
        figura.setNombre(figura.getNombre()+" clonado");
        System.out.print("Digite la nueva posición en x:");
        posX=sc.nextInt();
        System.out.print("Digite la nueva posición en y:");
        posY=sc.nextInt();
        figura.mover(posX, posY);
        
        System.out.println("Estas son las figuras originales:");
        System.out.println("Figura: "+figura.getNombre());
        figura.getPosicion();
        
        System.out.println("Estas son las figuras originales:");
        System.out.println("Circulo: "+circulo.getNombre());
        circulo.getPosicion();
        System.out.println("Cuadrado: "+cuadrado.getNombre());
        cuadrado.getPosicion();
    }
}
