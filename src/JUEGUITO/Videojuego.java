package tema7.JUEGUITO;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {
     String titulo;
     String plataforma;
     int nota;


    // constructor común para todos los videojuegos
    public Videojuego(String titulo, String plataforma, int nota) throws NotaInvalidaException {
        if (nota < 1 || nota > 10) {
            throw new NotaInvalidaException("La nota debe estar entre 1 y 10");
        }

        this.titulo = titulo;
        this.plataforma = plataforma;
        this.nota = nota;
    }
    // método abstracto que implementarán las subclases
    public abstract String getTipo();

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Plataforma: " + plataforma + ", Nota: " + nota;
    }
}


