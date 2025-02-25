package ppo3.biblioteca;

public class DVD extends Ficha{
    private String director;
    private int anyo;
    private String tipo;

    public DVD(int numero, String titulo, String director, int anyo, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.anyo = anyo;
        this.tipo = tipo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getanyo() {
        return anyo;
    }

    public void setanyo(int anyo) {
        this.anyo = anyo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return super.toString() + ", Director: " + director + ", anyo: " + anyo + ", Tipo: " + tipo;
    }
}
