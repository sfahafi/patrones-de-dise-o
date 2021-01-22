package repaso.socket;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(4444);
            while(true){
                System.out.println("Esperando Cliente.");
                Socket so=ss.accept();
                OutputStream out=so.getOutputStream();
                out.write("Mensaje".getBytes());
                out.close();
            }
        } catch (Exception e) {
            System.err.println("Ocurrio un error.");
            System.err.println(e);
        }
    }

}
