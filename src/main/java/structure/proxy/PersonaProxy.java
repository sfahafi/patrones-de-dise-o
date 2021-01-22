package structure.proxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class PersonaProxy implements Runnable {

    // PersonaProxy: el cliente trabaja con este objeto de forma local
    // duplica métodos y atributos para que el cliente crea que es el 
    // objeto remoto.
    
    private Thread thread;
    private Socket socket;
    private InputStream in;
    private PrintWriter out;
    private int caracter;
    private boolean permiso = true; //no poner al inicio

    public PersonaProxy() {
        try {
            socket = new Socket("127.0.0.1", 45454);
            System.out.println("Conectando...");
            in = socket.getInputStream();
            out = new PrintWriter(socket.getOutputStream(), true);
            thread = new Thread(this);
            thread.start();
        } catch (IOException e) {
            System.out.println("Error al conectarse: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
        if (socket != null && socket.isConnected()) {
            System.out.println("Conectado!!!");
        }
    }

    @Override
    public void run() {
        try {
            while ((caracter = in.read()) != -1) {
                System.out.print((char) caracter);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void cerrar(){
        out.println("cerrar");
    }

    public void saludar() {
        out.println("saludar");
        //Envia al objeto remoto la cadena y el objeto remoto decide cual método ejecutar
    }

    public void decirEstado() {
        //El objeto PersonaProxy controla el acceso al método
        if (permiso) {
            out.println("decirEstado");
        } else {
            System.out.println("No hay acceso.");
            //Esta linea se ejecutan fuera del hilo, por lo tanto no aparece 
            //sincronizada en consola.(no tuvo que ir hasta la clase Persona 
            //Remota)
        }
    }

    public void despedirse() {
        out.println("despedirse");
    }


}
