package repaso.socket;

public class TestSocket {
    public static void main(String[] args) {
        new Thread(new Server()).start();
        new Thread(new Client()).start();
    }
}
