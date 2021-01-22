package creation.singleton.loadbalancer;

import java.util.LinkedList;
import java.util.List;

public final class LoadBalancer {

    private List<Server> servers = new LinkedList();
    private static LoadBalancer instance;
    private static Object padlock = new Object();

    private LoadBalancer() {
        servers.add(new Server("192.168.0.2"));
        servers.add(new Server("192.168.0.3"));
        servers.add(new Server("192.168.0.4"));
        servers.add(new Server("192.168.0.5"));
        servers.add(new Server("192.168.0.6"));
    }

    public Server getServer() {
        int i = (int) (Math.random() * 4.9999);
        return servers.get(i);
    }

    public static LoadBalancer getInstance() {
        if (instance == null) {
            //Sincronizo una parte del método no todo para mejorar la 
            //perfonmance
            //No synchronized (this) por que estoy en un entorno static
            synchronized (padlock) {
                if (instance == null) {
                    instance = new LoadBalancer();
                }
            }
        }

        return instance;
    }
}
