package creation.factory;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImplementInjection {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Connection myConnection;
                
        
        //Abstract Factory Injection
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.print("Digite la BD (Generic-Oracle-MySQL-SQLServer-PostgreSQL): ");
        String tipo=sc.nextLine();

        myConnection=context.getBean("factory",InheritedFactory.class).getConnection(tipo);
        
        //en Fabrica heredada el tipo va en el método
        System.out.println("Esta conectado con: "+myConnection.description());
    }
   
}
