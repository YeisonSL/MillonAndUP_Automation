package models;

public class InformacionProgramacion {

    private String hora;
    private String correo;
    private String nombre;
    private String telefono;

    public InformacionProgramacion(String hora, String correo,  String nombre, String telefono) {
        this.hora = hora;
        this.correo = correo;

        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
