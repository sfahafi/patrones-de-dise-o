package creation.mvc3.modelo.vo;

public class Persona {

    private int idPersona;
    private String nombrePersona;
    private Integer edadPersona;
    private String profesionPersona;
    private int telefonoPersona;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public Integer getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(Integer edadPersona) {
        this.edadPersona = edadPersona;
    }

    public String getProfesionPersona() {
        return profesionPersona;
    }

    public void setProfesionPersona(String profesionPersona) {
        this.profesionPersona = profesionPersona;
    }

    public Integer getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(Integer telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

}
