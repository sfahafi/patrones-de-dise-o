package creation.builder.aop;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cliente {
    public static void main(String[] args) throws Exception{

        //Ejemplo de AOP
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
        //sin aop
        TestAop test = context.getBean("test",TestAop.class);
        test.metodo1();
        test.metodo2();
        
        //con aop
        test = context.getBean("testServiceProxy",TestAop.class);
        test.metodo1();
        test.metodo2();
        
        Scanner sc=new Scanner(System.in);
        Builder constructor=new Builder();
        Robot robot;
        String tipoRobot;
        
        
        
        // los robots en minuscula por que asi estan en el contexto
        System.out.print("Digite el tipo de robot que desea(robotHamburguesa - robotHotDog):");
        tipoRobot=sc.nextLine();

        constructor.setRobot(tipoRobot,context);
        constructor.addItem("Revisar");
        constructor.addItem("Imposible");
        constructor.addItem("Ingredientes");
        constructor.addItem("Armar");
        constructor.addItem("Revisar");
        
        /*
        El objetivo del builder es que el código cliente pueda controlar
        el proceso de construcción y cambiar la configuración de construcción
        facilmente, abstrayendose de los problemas de tecnologias de robots
         */
        
        robot=constructor.getRobot();
        robot.trabajar();
         
    }
}
