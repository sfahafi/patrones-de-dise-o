package repaso.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Entidad e=context.getBean("entidad",Entidad.class);
        Entidad e=context.getBean("entidadServiceProxy",Entidad.class);
        e.metodo1();
        e.metodo2();
        try {e.metodo3();} catch (Exception ex) {}
        
    }
}
