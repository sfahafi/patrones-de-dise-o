package creation.builder;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Builder constructor=new Builder();
        Robot robot;
        int tipoRobot;
        
        System.out.println("Digite el tipo de robot que desea(1- RobotHamburguesa  2- RobotHotDog):");
        tipoRobot=sc.nextInt();
        
        constructor.setRobot(tipoRobot);
        constructor.addRevisar();
        constructor.addImposible();
        constructor.addGetIngredientes();
        constructor.addArmar();
        constructor.addRevisar();
        
        /*
        El objetivo del builder es que el código cliente pueda controlar
        el proceso de construcción y cambiar la configuración de construcción
        facilmente, abstrayendose de los problemas de tecnologias de robots
        */
        
        robot=constructor.getRobot();
        robot.trabajar();
    }
}
