package repaso.generic.repository;

public class Test {
    public static void main(String[] args) {

        GenericR<alumnos> gr=new GenericR();
        gr.save(new alumnos("Cristina","Molina",22,2));
        alumnos a=gr.getById(20);
        System.out.println(a);
        gr.remove(gr.getById(18));
        gr.getAll().forEach(System.out::println);
        gr.get("nombre like 'lo%'").forEach(System.out::println);
        
    }
}
