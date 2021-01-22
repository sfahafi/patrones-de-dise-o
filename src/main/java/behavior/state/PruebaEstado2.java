package behavior.state;

import java.util.Scanner;

public class PruebaEstado2 {
    public static void main(String[] args) {
        Alarma alarma=new Alarma();
        String opcion="Salir";
        Scanner sc=new Scanner(System.in);
        do{
            muestraMenu();
            opcion=sc.nextLine();
            try {
                alarma.setEstado((Estado)Class.forName("behavior.state."+opcion).newInstance());
                alarma.ejecutarAccion();
            } catch (Exception e) {
                //System.out.println(e);
                System.out.println((opcion.equalsIgnoreCase("Salir"))?"":"Opción incorrecta.");
            }
            
        }while(!opcion.equalsIgnoreCase("Salir"));
    }
    
    private static void muestraMenu(){
        StringBuffer menu=new StringBuffer();
        menu.append("********************************************\n");
        menu.append("* SELECCIONE EL ESTADO DE LA ALARMA        *\n");
        menu.append("* Activa - Mantenimiento - Salir           *\n");
        menu.append("********************************************\n");
        System.out.println(menu);   
    }
}
