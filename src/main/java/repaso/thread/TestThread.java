package repaso.thread;

public class TestThread {
    public static void main(String[] args) {
        new Thread(new Hilo("Hilo 1")).start();
        new Thread(new Hilo("Hilo 2")).start();
        new Thread(new Hilo("Hilo 3")).start();
        new Thread(new Hilo("Hilo 4")).start();
    }
}
