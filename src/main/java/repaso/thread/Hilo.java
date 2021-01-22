package repaso.thread;

public class Hilo implements Runnable{
    private String name;

    public Hilo(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        for(int a=1;a<=50;a++){
            System.out.println(name+": "+a);
            sleep(50);
        }
    }
    
    private void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
        }
    }
    
}
