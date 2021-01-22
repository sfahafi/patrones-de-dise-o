package repaso.polimorfismo;

import java.util.Scanner;

public class TestFormas {

    public static void main(String[] args) throws Exception{
        Forma forma;
        //forma = new Rectangulo();
        //forma = new Circulo();
        
        System.out.print("Ingrese 1-'Circulo' o 2-'Rectangulo': ");
        int o=new Scanner(System.in).nextInt();
        String clase=(o==1)?"repaso.polimorfismo.Circulo":"repaso.polimorfismo.Rectangulo";
        System.out.println(clase);
        forma=(Forma) Class.forName(clase).newInstance();
        forma.mover(5, 8);
        forma.dondeEstoy();
        forma.dibujar();
        forma.redimensionar();
        
    }
}
