package colecciones.gimnasio;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad){
        this.edad=edad;
        this.nombre=nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("nombre: " + nombre + " edad " + edad);
    }
}
