package ppo3.biblioteca;

public class Revista extends Ficha{
    private int numeroPublicacion;
    private int año;

    public Revista(int numero, String titulo, int numeroPublicacion, int año) {
        super(numero, titulo);
        this.numeroPublicacion = numeroPublicacion;
        this.año = año;
    }

    public int getNumeroPublicacion() {
        return numeroPublicacion;
    }

    public void setNumeroPublicacion(int numeroPublicacion) {
        this.numeroPublicacion = numeroPublicacion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String toString() {
        return super.toString() + ", Número de publicación: " + numeroPublicacion + ", Año: " + año;
    }
}
