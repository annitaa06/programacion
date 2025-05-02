package tema7.JUEGUITO;

public class VideojuegoDigital extends Videojuego{
    private String tiendaOnline;
    private double tamañoGB;

    public VideojuegoDigital(String titulo, String plataforma, int nota, String tiendaOnline, double tamañoGB) throws NotaInvalidaException {
        super(titulo, plataforma, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamañoGB = tamañoGB;
    }

    public String getTiendaOnline() {
        return tiendaOnline;
    }

    public void setTiendaOnline(String tiendaOnline) {
        this.tiendaOnline = tiendaOnline;
    }

    public double getTamañoGB() {
        return tamañoGB;
    }

    public void setTamañoGB(double tamañoGB) {
        this.tamañoGB = tamañoGB;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Digital, Tienda Online: " + tiendaOnline + ", Tamaño: " + tamañoGB + " GB";
    }
}

