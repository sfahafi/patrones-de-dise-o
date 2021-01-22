package creation.singleton.loadbalancer;

public class TestLoadBalancer {

    public static void main(String[] args) {
        LoadBalancer lb1 = LoadBalancer.getInstance();
        System.out.println(lb1.hashCode());
        Server s1 = lb1.getServer();
        System.out.println(s1.getAddress());

        LoadBalancer lb2 = LoadBalancer.getInstance();
        System.out.println(lb2.hashCode());
        Server s2 = lb2.getServer();
        System.out.println(s2.getAddress());

        if (lb1 == lb2) {
            System.out.println("Mismo balanceador");
        } else {
            System.out.println("Distinto balanceador");
        }
    }
}
