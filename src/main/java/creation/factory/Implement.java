package creation.factory;

import java.util.Scanner;

public class Implement {
    
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
       
        //Factory
        System.out.print("Digite la BD (Generic-Oracle-MySQL-SQLServer-PostgreSQL): ");
        String tipo=sc.nextLine();
        
        Connection myConnection=new Factory(tipo).getConnection();
        
        String salida="Esta conectado con: "+myConnection.description();
        System.out.println(salida);
        
        
        //Abstract Factory
        System.out.print("Digite la BD (Generic-Oracle-MySQL-SQLServer-PostgreSQL): ");
        tipo=sc.nextLine();

        myConnection=new InheritedFactory().getConnection(tipo);
        //en Fabrica heredada el tipo va en el método
        
        salida="Esta conectado con: "+myConnection.description();
        System.out.println(salida);
        
    }
    
}
