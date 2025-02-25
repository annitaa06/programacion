package ppo3.interfaces.redsocial;

public class PublicacionTexto implements IPublicacion {
private String texto;

public PublicacionTexto(String texto){
    this.texto=texto;
}
    @Override
    public void publicar() {
        System.out.println("Pubkicando texto " + texto);
    }

    @Override
    public void compartir() {
        System.out.println("compartiendo texto "+ texto);
    }
}
