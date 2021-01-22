package repaso.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    /*
        Bibliografia: http://www.arumeinformatica.es/blog/java-reflection-parte-1/
     */
    public static void main(String[] args) throws Exception {
        class Persona {

            private String nombre;
            private int edad;

            public Persona() {

            }

            public Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

            @Override
            public String toString() {
                return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }

        }

        //obtengo un objeto class de la clase persona
        Class userClass = Persona.class;

        //usando el metodo Class.forName
        //Class userClassX=Class.forName("com.test.model.AdminUser");
        Persona persona = new Persona();
        System.out.println(persona.getClass());
        Class userClass2 = Class.forName("util.Reflection$1Persona");

        System.out.println(userClass.getName());
        System.out.println(userClass.getSimpleName());
        //sin el nombre de paquete

        System.out.println(userClass.getSuperclass());

        Package userPackage = userClass.getPackage();
        System.out.println(userPackage + "");

        Class userSuperclass = userClass.getSuperclass();
        System.out.println(userSuperclass);

        Class[] userInterfaces = userClass.getInterfaces();
        System.out.println(userInterfaces.length);

        Constructor[] userConstructors = userClass.getConstructors();
        System.out.println(userConstructors.length);
        for (Constructor co : userConstructors) {
            System.out.println(co + " - ");
            //System.out.println(co.getParameters());
            Class[] params = co.getParameterTypes();
            for (Class cl : params) {
                System.out.print(cl + " , ");
            }
            System.out.println(".");
        }

        Constructor userConstructor = userClass.getConstructor(new Class[]{String.class, int.class});
        //userConstructor=userClass.getConstructor(new Class[] {});
        //El metodo getConstructor devuelve un constructor con la firma indicada.

        System.out.println(userConstructor);

        /*
        Una vez hallamos conseguido el constructor deseado, podemos instanciar 
        un objeto mediante el método newInstance() con los parámetros adecuados.
        ejemplo:
         */
        //Constructor userConstructor;
        //Persona persona;
        userConstructor = userClass.getConstructor(new Class[]{String.class, int.class});
        persona = (Persona) userConstructor.newInstance("Antonio González", 12);
        System.out.println(persona);

        System.out.println("------------------------------");
        //Campos

        // Campos
        // Solo es posible con campos publicos.
        //userClass = Persona.class;
        //Field userField = userClass.getField("nombre");
        //System.out.println(userField);

        Field[] userFields = userClass.getFields();
        System.out.println(userFields.length);
        for (Field fl : userFields) {
            System.out.println(fl + " - " + fl.getType());
        }

        //Para campos privados.
        System.out.println(Persona.class.getDeclaredField("nombre"));

        userFields = Persona.class.getDeclaredFields();
        System.out.println(userFields.length);
        for (Field fl : userFields) {
            System.out.println(fl + " - " + fl.getType());
        }

        //Metodos
        //Method[] userMethods = userClass.getMethods();
        Method[] userMethods = userClass.getDeclaredMethods();
        System.out.println(userMethods.length);
        for (Method mt : userMethods) {
            System.out.println("------------");
            System.out.println(mt);
            System.out.println(mt.getName());
            System.out.println(mt.getReturnType());
        }

        //Método .invoke() invoca un método o constructor
        System.out.println("---------------------------------------");
        String alias;
        Object userInstance = userClass.getConstructor(new Class[]{String.class, int.class}).newInstance(new Object[]{"Juan", 32});
        System.out.println(userInstance);
        Method setNombreMethod = userClass.getMethod("setNombre", String.class);
        Method getNombreMethod = userClass.getMethod("getNombre", null);
        setNombreMethod.invoke(userInstance, "Pepe");
        alias = (String) getNombreMethod.invoke(userInstance, null);
        System.out.println(alias);
        System.out.println(userInstance);

    }
}
