package structure.proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class PersonaRemota implements Runnable {

    // PersonaRemota: Objeto Server alojado en forma remota.
    private Thread thread;
    private ServerSocket socket;
    private PrintWriter out;
    private Socket communicationSocket;
    private List<String> lista = new ArrayList(); //no poner al inicio

    public PersonaRemota() {
        try {
            cargarLista(); //no poner al inicio
            socket = new ServerSocket(45454);
            System.out.println("Servidor de Persona Remota, onLine.");
            communicationSocket = socket.accept();
            out = new PrintWriter(communicationSocket.getOutputStream(), true);
            thread = new Thread(this);
            thread.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        String textoEntrada;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
            while ((textoEntrada = in.readLine()) != null) {
//                if(textoEntrada.equals("saludar")){
//                    saludar();
//                }else if(textoEntrada.equals("decirEstado")){
//                    decirEstado();
//                }else if(textoEntrada.equals("despedirse")){
//                    despedirse();
//                }

                //Una forma más elegante...
                if (lista.contains(textoEntrada)) {
                    this.getClass().getDeclaredMethod(textoEntrada, null).invoke(this, null);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void cargarLista() {
        lista.add("saludar");
        lista.add("decirEstado");
        lista.add("despedirse");
        lista.add("cerrar");
    }

    public void cerrar() {
        out.println("cerrar");
        try {
            out.close();
            socket.close();
            communicationSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saludar() {
        out.println("Hola!!!");
    }

    public void decirEstado() {
        out.println("Estoy contento.");
    }

    public void despedirse() {
        out.println("Chauu!!");
    }

    public static void main(String[] args) {
        PersonaRemota pr = new PersonaRemota();
    }
}
