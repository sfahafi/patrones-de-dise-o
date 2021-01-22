package structure.proxy;

public class PruebaProxy {
    /*
        El objeto cliente aca creado usa personaProxy sin importar donde se
        encuentre personaRemota, dado que piensa que es un objeto local.
    */
    PersonaProxy persona;
    
    public PruebaProxy() {
        persona = new PersonaProxy();
        persona.saludar();
        persona.decirEstado();
        persona.despedirse();
        persona.cerrar();
    }
    
    public static void main(String[] args) {
        PruebaProxy pp=new PruebaProxy();
    }
}
