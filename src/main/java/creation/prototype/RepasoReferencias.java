package creation.prototype;

public class RepasoReferencias {
    public static void main(String[] args) {
        Persona uno=new Persona("Alexys");
        System.out.println("nombre Objeto uno: "+uno);
        
        Persona dos=uno;
        System.out.println("nombre Objeto dos: "+dos);
        
        dos.setNombre("Diego");
        System.out.println("nombre Objeto uno: "+uno);
        System.out.println("nombre Objeto dos: "+dos);
        
        /* Las referencias no funcionan con las variable
            A pesar de que String es una clase.
        */
        String st1="Pedro";
        String st2=st1;
        st2="Maria";
        System.out.println(st1);
        System.out.println(st2);
        
        // Tampoco copia la referencia
        st1=new String("Pedro");
        st2=new String(st1); //copia el codigo hash y la referencia.
        
        System.out.println(st1+" "+st1.hashCode());
        System.out.println(st2+" "+st2.hashCode());
        
        st2="Maria"; //se cambia la referencia y el codigo hash
        
        System.out.println(st1+" "+st1.hashCode());
        System.out.println(st2+" "+st2.hashCode());
        
        int entero1=2;
        int entero2=entero1;
        entero2=8;
        
        System.out.println(entero1);
        System.out.println(entero2);
        
        
        
    }
}
