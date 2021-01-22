package repaso.aop;

import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class InterceptorEntity implements MethodBeforeAdvice,AfterReturningAdvice,ThrowsAdvice,MethodInterceptor{

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        if(method.getName().equals("metodo1")) System.out.println("Método interceptado Before.");
        //se podria usar un mapa con opciones en vez de un if.
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
        if(method.getName().equals("metodo1")) System.out.println("Método interceptado After.");
    }
    public void afterThrowing(ArithmeticException e) throws Throwable {
        System.out.println("División / 0.");
    }
    public void afterThrowing(Exception e) throws Throwable {
        System.out.println("Ocurrio un error.");
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
       boolean m=mi.getMethod().getName().equals("metodo2");
       if(m) System.out.println("Metodo Interceptado Around Before.");
       Object obj=mi.proceed();
       if(m) System.out.println("Metodo Interceptado Around After.");
       return obj;
    }
    
}
