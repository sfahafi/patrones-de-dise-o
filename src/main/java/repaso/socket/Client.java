package repaso.socket;

import java.io.InputStream;
import java.net.Socket;

public class Client implements Runnable {

    @Override
    public void run() {
        try {

            for (int a = 1; a <= 100; a++) {
                Socket so = new Socket("localhost", 4444);
                InputStream in = so.getInputStream();
                System.out.println(getString(in));
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
                in.close();
                so.close();
            }
        } catch (Exception e) {
            System.err.println("Ocurrio un error.");
            System.err.println(e);
        }

    }

    private String getString(InputStream in) {
        int car;
        String texto = "";
        try {
            while ((car = in.read()) != -1) {
                texto += (char) car;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return texto;
    }
}
