package ppo3.interfaces.redsocial;

import java.util.Scanner;

public class MainRedS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("TIPO DE PUBLICACION ");
            System.out.println("1. Texto");
            System.out.println("2. Foto");
            System.out.println("3. Video");
            System.out.println("4. Salir");
            System.out.println("elige una opcion: ");
           opcion=sc.nextInt();

           switch (opcion){
               case 1: //TEXTO
                   System.out.println("escribe el texto ");
                   String texto = sc.nextLine();
                   PublicacionTexto pubTexto =new PublicacionTexto(texto);
                   pubTexto.publicar();
                   pubTexto.compartir();
                   break;

               case 2: //FOTO
                   System.out.println("nombre del archivo de la foto: ");
                   String foto= sc.nextLine();
                   PublicacionFoto pubFoto =new PublicacionFoto(foto);

                   pubFoto.abrir();
                   break;
               case 3: // Publicación de video
                   System.out.print("Nombre del archivo de video: ");
                   String video = sc.nextLine();
                   PublicacionVideo pubVideo = new PublicacionVideo(video);
                   pubVideo.abrir();
                   break;

               case 4: // Salir
                   System.out.println("Saliendo...");
                   break;

               default:
                   System.out.println("Opción no válida, intenta de nuevo.");
           }
        }while (opcion !=4);

    }
}
