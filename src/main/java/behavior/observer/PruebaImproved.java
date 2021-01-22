package behavior.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PruebaImproved {

    private Sujeto sujeto;
    private Correo correo;
    private Auditor auditor;
    private Informador informador;
    private Map<Integer,Observador>mapa=new HashMap();
    private Map<Integer,String>mapaAcciones=new HashMap();
    private Scanner sc = new Scanner(System.in);

    public void ejecutaPrueba() {
        sujeto = new Sujeto();
        correo = new Correo();
        auditor = new Auditor();
        informador = new Informador();
        mapa.put(1, correo);
        mapa.put(2, auditor);
        mapa.put(3, informador);
        String accion = "", lugar = "";
        int opAccion, opRegistra;
        
        
        mapaAcciones.put(0,"salir");
        mapaAcciones.put(1,"realizarAccion");
        mapaAcciones.put(2,"agregaObservador");
        mapaAcciones.put(3,"retiraObservador");
        //Tuve que igualar todas las firma de parametros de acciones para que
        //funcione.
        do {
            escribeMenu();
            opAccion = sc.nextInt();
            try {
                this.getClass().getMethod(mapaAcciones.get(opAccion), null).invoke(this,null);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Opción Incorrecta!!!");
            }
        } while (opAccion != 0);
    }

    public void salir() {
        System.exit(0);
    }

    public void realizarAccion() {
        String accion;
        String lugar;
        System.out.print("Escribe la acción: ");
        accion = sc.next();
        System.out.print("Escribe el lugar: ");
        lugar = sc.next();
        sujeto.ejecutarAccion(accion, lugar);
        System.out.println("\n");
    }

    public void escribeMenu() {
        System.out.println("***************************");
        System.out.println("* Escoge la opción        *");
        System.out.println("* 1. Realizar la acción.  *");
        System.out.println("* 2. Agregar Observador.  *");
        System.out.println("* 3. Retirar Observador.  *");
        System.out.println("* 0. Salir.               *");
        System.out.println("***************************");
    }

    public void escribeSeleccion() {
        System.out.println("**************************");
        System.out.println("* Escoge la opción       *");
        System.out.println("* 1. Enviar Correo.      *");
        System.out.println("* 2. Registrar Auditoria.*");
        System.out.println("* 3. Informar al jefe.   *");
        System.out.println("**************************");
    }

    public void agregaObservador() {
        escribeSeleccion();
        int o=sc.nextInt();
        try{
            sujeto.registrarObs(mapa.get(o));
            System.out.println("Observador agregado.");
        }catch(Exception e){
            System.out.println("Opcion Incorrecta.");
        }
    }
    
    public void retiraObservador(){
        escribeSeleccion();
        int o=sc.nextInt();
        try {
            sujeto.retirarObs(mapa.get(o));
            System.out.println("Observador retirado.");
        } catch (Exception e) {
            System.out.println("Opcion Incorrecta!!!");
        }
    }
    
    public static void main(String[] args) {
        PruebaImproved p=new PruebaImproved();
        p.ejecutaPrueba();
    }

}
