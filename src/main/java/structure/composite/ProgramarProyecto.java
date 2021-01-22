package structure.composite;

public class ProgramarProyecto {

    private Proyecto miProyecto;
    private Responsable responsable1, responsable2, responsable3, responsable4,
            responsable5, responsable6, responsable7, responsable8, responsable9,
            responsable10, responsable11, responsable12, responsable13, responsable14,
            responsable15, responsable16;

    public ProgramarProyecto() {
        // Fases para ejecutar un proyecto.
        crearResponsables();
        crearProyectoPrincipal();
        crearSubProAnalisis();
        crearSubProDiseno();
        crearSubProDesarrollo();
        crearSubProPruebas();
        crearSubProImplementacion();
        miProyecto.imprimir();
    }

    public void crearResponsables() {
        responsable1 = new Responsable("Alexys Lozada", "12345678");
        responsable2 = new Responsable("Daniel Lozada", "23456789");
        responsable3 = new Responsable("Carlos Ríos", "34567890");
        responsable4 = new Responsable("Jenifer Mendoza", "0987654");
        responsable5 = new Responsable("Laura Salinas", "98765432");
        responsable5 = new Responsable("Andrea Moretti", "87654321");
        responsable6 = new Responsable("Debora Vargas", "76543210");
        responsable7 = new Responsable("Andres Rodriguez", "111111111");
        responsable8 = new Responsable("Diana Lanchero", "22222222");
        responsable9 = new Responsable("Pedro Vega", "3333333");
        responsable10 = new Responsable("Diego Suarez", "4444444");
        responsable11 = new Responsable("Raul Ledesma", "55555555");
        responsable12 = new Responsable("Mariela Casimiro", "66666666");
        responsable13 = new Responsable("Susana Lujan", "777777777");
        responsable14 = new Responsable("Martin Sayago", "88888888");
        responsable15 = new Responsable("Silvana Scotti", "99999999");
        responsable16 = new Responsable("Juan Solis", "000000000");
    }

    public void crearProyectoPrincipal() {
        miProyecto = new Proyecto("Crear Un Software", responsable1);
    }

    public void crearSubProAnalisis() {
        Proyecto subProyecto = new Proyecto("Analisis", responsable2);
        Entregable entregable = new Entregable("Documento de Analisis");

        Tarea tarea1 = new Tarea("Identificación de interesados", responsable3, 0);
        Tarea subTarea11 = new Tarea("Identificar usuarios", responsable4, 36);
        Tarea subTarea12 = new Tarea("Identificar Tecnicos", responsable5, 12);
        tarea1.agregarItemTarea(subTarea11);
        tarea1.agregarItemTarea(subTarea12);

        Tarea tarea2 = new Tarea("Levantamiento de requerimientos", responsable6, 0);
        Tarea subTarea21 = new Tarea("Requerimientos funcionales", responsable6, 72);
        Tarea subTarea22 = new Tarea("Requerimientos no funcionales", responsable6, 24);
        tarea2.agregarItemTarea(subTarea21);
        tarea2.agregarItemTarea(subTarea22);

        Tarea tarea3 = new Tarea("Analisis de requerimientos", responsable7, 72);
        subProyecto.agregarItemProyecto(entregable);
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);
        subProyecto.agregarItemProyecto(tarea3);

        miProyecto.agregarItemProyecto(subProyecto);

    }

    public void crearSubProDiseno() {
        Proyecto subProyecto = new Proyecto("Diseno", responsable2);
        Entregable entregable = new Entregable("Documento Diseño");

        Tarea tarea1 = new Tarea("Diseño de casos de uso", responsable8, 34);
        Tarea tarea2 = new Tarea("Diseño de secuencias", responsable8, 24);
        Tarea tarea3 = new Tarea("Diagrama de UML", responsable8, 30);

        subProyecto.agregarItemProyecto(entregable);
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);
        subProyecto.agregarItemProyecto(tarea3);

        miProyecto.agregarItemProyecto(subProyecto);

    }

    public void crearSubProDesarrollo() {
        Proyecto subProyecto = new Proyecto("Desarrollo", responsable2);
        Entregable entregable = new Entregable("Código Fuente");

        Tarea tarea1 = new Tarea("Definición de tecnología y lenguaje a usar", responsable9, 12);
        Tarea tarea2 = new Tarea("Desarrollar Código", responsable10, 0);
        Tarea subTarea21 = new Tarea("Código de capa de Datos", responsable11, 120);
        Tarea subTarea22 = new Tarea("Código de la capa Lógica", responsable12, 180);
        Tarea subTarea23 = new Tarea("Código de la capa de Presentación", responsable13, 120);
        tarea2.agregarItemTarea(subTarea21);
        tarea2.agregarItemTarea(subTarea22);
        tarea2.agregarItemTarea(subTarea23);

        subProyecto.agregarItemProyecto(entregable);
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);

        miProyecto.agregarItemProyecto(subProyecto);

    }

    public void crearSubProPruebas() {
        Proyecto subProyecto = new Proyecto("Pruebas", responsable2);
        Entregable entregable = new Entregable("Documento de Aceptación");
        Tarea tarea1 = new Tarea("Realización de pruebas técnicas", responsable14, 24);
        Tarea tarea2 = new Tarea("Realización de pruebas de usuario", responsable15, 36);
        subProyecto.agregarItemProyecto(entregable);
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);

        miProyecto.agregarItemProyecto(subProyecto);

    }

    public void crearSubProImplementacion() {
        Proyecto subProyecto = new Proyecto("Implementación", responsable2);
        Entregable entregable = new Entregable("Software Funcionando");

        Tarea tarea1 = new Tarea("Configuración del Servidor", responsable16, 24);
        Tarea tarea2 = new Tarea("Implementación del Software", responsable2, 24);
        subProyecto.agregarItemProyecto(entregable);
        subProyecto.agregarItemProyecto(tarea1);
        subProyecto.agregarItemProyecto(tarea2);

        miProyecto.agregarItemProyecto(subProyecto);
    }

}
