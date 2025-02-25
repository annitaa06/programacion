package ppo3.interfaces.redsocial;

public class PublicacionFoto implements IAbrirPublicacion{
    private String foto;

    public PublicacionFoto(String foto){
        this.foto=foto;
    }

    @Override
    public void abrir() {
        System.out.println("abriendo foto "+ foto);

    }
}
