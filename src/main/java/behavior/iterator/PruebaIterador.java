package behavior.iterator;

public class PruebaIterador {
    public static void main(String[] args) {
        ListaNumeros ln=new ListaNumeros();
        ListaPalabras lp=new ListaPalabras();
        Iterador iterador;
        
        ln.agregar(8);
        ln.agregar(7);
        ln.agregar(6);
        ln.agregar(5);
        ln.agregar(4);
        ln.agregar(3);
        
        lp.agregar("ocho");
        lp.agregar("siete");
        lp.agregar("seis");
        lp.agregar("cinco");
        lp.agregar("cuatro");
        
        iterador = ln.iterador();
        while(iterador.tieneSiguiente()){
            //Accede al elemento
            int numero=(int)iterador.siguiente();
            System.out.println(numero);
        }
        
        System.out.println();
        
        iterador = lp.iterador();
        while(iterador.tieneSiguiente()){
            //Accede al elemento
            String palabra=(String)iterador.siguiente();
            System.out.println(palabra);
        }
        
    }
}
