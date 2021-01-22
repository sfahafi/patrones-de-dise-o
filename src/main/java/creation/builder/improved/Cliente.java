package creation.builder.improved;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Builder constructor=new Builder();
        Robot robot;
        String tipoRobot;
        
        System.out.print("Digite el tipo de robot que desea(RobotHamburguesa - RobotHotDog):");
        tipoRobot=sc.nextLine();
        
        constructor.setRobot(tipoRobot);
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
