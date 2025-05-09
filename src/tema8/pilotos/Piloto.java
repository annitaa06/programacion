package tema8.pilotos;

import java.sql.Date; // IMPORTANTE, usa java.sql.Date

public class Piloto {
    private String codigo;
    private String nombre;
    private Date fecha; // esto va antes
    private String apellido;
    private String nacionalidad;
    private String link;
    private int id;

    public Piloto(String codigo, String nombre, Date fecha, String apellido, String nacionalidad, String link, int id) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.link = link;
        this.id = id;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fecha=" + fecha +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", link='" + link + '\'' +
                ", id=" + id +
                '}';
    }
}
