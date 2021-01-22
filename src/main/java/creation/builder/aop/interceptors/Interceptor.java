package creation.builder.aop.interceptors;

import creation.builder.aop.MapaAcciones;
import creation.builder.aop.Robot;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;


public class Interceptor implements MethodBeforeAdvice,ThrowsAdvice {

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
           if (method.getName().equals("trabajar")) {
            Class clazz = o.getClass();
            clazz.getDeclaredMethod("iniciar", null).invoke(o, null);
            Robot c = (Robot) o;
            c.getAcciones().forEach(item -> {
                try {
                    System.out.println("-------"+item);
                    clazz.getDeclaredMethod(MapaAcciones.getMap().get(item), null).invoke(o, null);
                } catch (Exception e) {
                    System.out.println("Esta Acción no la puedo realizar");
                }
            });
            clazz.getDeclaredMethod("terminar", null).invoke(o, null);
        }

    }
    
    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("Ocurrio un error");
    }

}
