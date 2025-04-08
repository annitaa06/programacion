package tema7.CSV;
import java.time.LocalDate;

public class Funko {
    private String codigo;
    private String nombre;
    private String modelo;
    private double precio;
    private LocalDate fechaLanzamiento;

    public Funko(String codigo, String nombre, String modelo, double precio, LocalDate fechaLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }
    public LocalDate getFechaLanzamiento() { return fechaLanzamiento; }

    @Override
    public String toString() {
        return codigo + "," + nombre + "," + modelo + "," + precio + "," + fechaLanzamiento;
    }
    public String toCSV() {
        return codigo + "," + nombre + "," + modelo + "," + precio + "," + fechaLanzamiento;
    }
}
