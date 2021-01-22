package creation.singleton.connector.injection;


import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestConnector {

    public static void main(String[] args) throws Exception {
        
        /*
            Mejora de un Singleton usando Spring context
        
            Arme un SpringConfigFile.xml y lo guarde en la carpeta scr/main/resources.
            Luego inyecte el objeto connection usando spring context
            solo spring-context
        */
          
        
        // por XML
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //ApplicationContext context=new FileSystemXmlApplicationContext("c:/applicationContext.xml");
        
        // hay que agregar Spring-web en el pom
        // XmlWebApplicationContext=new XmlWebApplicationContext();
        // context.setConfigLocation("/localhost/v1/beans.xml");
         
        //por Anotation
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        
        System.out.println("-- Con Inyección --");
        //En esta versión moderna del factory getBean no necesita casteo trabaja con generics
        Connector conn=context.getBean("connector",Connector.class);
        conn
                .getConnection()
                .createStatement()
                .execute("create database if not exists test3");

        conn
                .getConnection()
                .createStatement()
                .execute("use test3");

        conn
                .getConnection()
                .createStatement()
                .execute("create database if not exists test4");

        conn
                .getConnection()
                .createStatement()
                .execute("use test4");
        
        
        Connector conn2=context.getBean("connector",Connector.class);
        conn
                .getConnection()
                .createStatement()
                .execute("create database if not exists test3");

        conn
                .getConnection()
                .createStatement()
                .execute("use test3");

        conn
                .getConnection()
                .createStatement()
                .execute("create database if not exists test4");

        conn
                .getConnection()
                .createStatement()
                .execute("use test4");
        
        System.out.println("Presiona <Enter> para continuar.");
        new Scanner(System.in).nextLine();
        

    }
}
