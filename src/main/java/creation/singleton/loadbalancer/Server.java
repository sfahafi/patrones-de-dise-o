package creation.singleton.loadbalancer;

public class Server {
    private String address;

    public Server(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    
}
