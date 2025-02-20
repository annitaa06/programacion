package colecciones;

public class UsuarioBanco {
    private String nombre;
    private int edad;
    private String dni;

    public UsuarioBanco(String nombre, int edad, String dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;

    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void mostrarDatos(){
        System.out.println("nombre " + nombre +" edad "+ edad + " dni " +dni);
    }
}
