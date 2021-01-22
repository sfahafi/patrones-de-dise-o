package repaso.aop;

public class Entidad {
    public void metodo1(){}
    public void metodo2(){}
    public void metodo3()throws Exception{ 
        System.out.println(10/0);
        //throw new Exception();
    }
}
