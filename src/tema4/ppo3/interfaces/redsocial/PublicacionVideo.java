package ppo3.interfaces.redsocial;

public class PublicacionVideo implements IAbrirPublicacion{
    private  String video;

    public  PublicacionVideo(String video){
        this.video=video;
    }
    @Override
    public void abrir() {
        System.out.println("abriendo un video "+ video);
    }
}
