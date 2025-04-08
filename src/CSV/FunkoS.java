package tema7.CSV;

import java.io.Serializable;
import java.time.LocalDate;

public class FunkoS implements Serializable {
    private String codigo;
    private String nombre;
    private String modelo;
    private double precio;
    private LocalDate fechaLanzamiento;

    // Constructor
    public FunkoS(String codigo, String nombre, String modelo, double precio, LocalDate fechaLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "FunkoS [codigo=" + codigo + ", nombre=" + nombre + ", modelo=" + modelo + ", precio=" + precio
                + ", fechaLanzamiento=" + fechaLanzamiento + "]";
    }
}
