package behavior.templateMethod;

public class PruebaPlantilla {
    public static void main(String[] args) {
        CajeroAutomatico ca=new CajeroAutomatico("F976AB",30,1);
        System.out.println();
        ca.procesar("F976AB", 10, 2);
        
        System.out.println();
        Cajero c=new Cajero("ABC123",100,1);
        System.out.println();
        c.procesar("ABC123", 10, 2);
    }
}
