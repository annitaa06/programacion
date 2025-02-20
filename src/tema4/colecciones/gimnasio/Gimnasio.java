package colecciones.gimnasio;

import java.util.HashMap;
import java.util.Map;

public class Gimnasio {
/*    String → Es el tipo de dato de la clave (DNI).
    Usuario → Es el tipo de dato del valor (el objeto Usuario).
    usuarios → Es el nombre de la variable (el mapa donde guardamos los usuarios).*/
    private Map<String,Usuario> usuarios =new HashMap<>();

    //agregar un usuario si el dni no existe
    public void agregarUsuario (String dni, String nombre, int edad){
    if (usuarios.containsKey(dni)){
        System.out.println("YA HAY UN USUARIO CON ESTE DNI");
    }else {
        usuarios.put(dni, new Usuario(nombre,edad));//se guarda en el maoa
        System.out.println("usuario añadido con exito");
    }

    }
    public void eliminarUsuario(String dni){
        if (usuarios.remove(dni)!=null){
            System.out.println("Usuario eliminado con exito");
        }
        else{
            System.out.println("usuario NO encontrado");
        }
    }
    public void mostrarUsuario(String dni){
        if (usuarios.containsKey(dni)){
            usuarios.get(dni).mostrarDatos();
        }else{
            System.out.println("usuario NO encontrado");
        }
    }
    public void modificarUsuario(String dni, String nombre, int edad){
        Usuario usuario = usuarios.get(dni);
        if (usuario != null) {
            usuario.setNombre(nombre);
            usuario.setEdad(edad);
            System.out.println("usuario modificado.");
        }else{
            System.out.println("usuario NO encontrado");
        }
    }
}
