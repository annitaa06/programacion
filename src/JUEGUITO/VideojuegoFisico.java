package tema7.JUEGUITO;

public class VideojuegoFisico extends Videojuego {
    private String tiendaCompra;
    private String estado; // nuevo o usado

    public VideojuegoFisico(String titulo, String plataforma, int nota, String tiendaCompra, String estado) throws NotaInvalidaException {
        super(titulo, plataforma, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    @Override
    public String getTipo() {
        return "Físico";
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Físico, Tienda: " + tiendaCompra + ", Estado: " + estado;
    }
}
