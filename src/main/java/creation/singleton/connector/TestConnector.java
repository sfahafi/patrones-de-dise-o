package creation.singleton.connector;

import java.util.Scanner;

public class TestConnector {

    public static void main(String[] args) throws Exception {
        /*
        System.out.println("-- Sin Singleton --");
        //for(int a=1;a<=1000;a++)
        //Sin singleton es más lento el tiempo de ejecución por que tiene que crear las conexiones
        //A parte hay pocos puertos
        
        
        Connector1
                .getConnection()
                .createStatement()
                .execute("create database if not exists test");

        Connector1
                .getConnection()
                .createStatement()
                .execute("use test");

        Connector1
                .getConnection()
                .createStatement()
                .execute("create database if not exists test2");

        Connector1
                .getConnection()
                .createStatement()
                .execute("use test2");
        
        
        // Esta lineas son para detener el hilo de ejecución y evitar
        // que las conexiones pierdan scope.
        // mirar en workbench o otro producto las conexiones actuales.
        System.out.println("Presiona <Enter> para continuar.");
        new Scanner(System.in).nextLine();
        */
        
        
        System.out.println("-- Con Singleton --");
        //for(int a=1;a<=1000;a++)
        Connector2
                .getConnection()
                .createStatement()
                .execute("create database if not exists test");

        Connector2
                .getConnection()
                .createStatement()
                .execute("use test");

        Connector2
                .getConnection()
                .createStatement()
                .execute("create database if not exists test2");

        Connector2
                .getConnection()
                .createStatement()
                .execute("use test2");
        
        System.out.println("Presiona <Enter> para continuar.");
        new Scanner(System.in).nextLine();
        
    }
}
