package tema4.Persona;

public class Persona {
    private final String dni;
    private String nombre;
    private String apellidos;
    private  int edad;

    //definir valores que no cambian
    public static final int
    ADULT_AGE =18;
    public static final int
    RETIRED_AGE =65;

    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    public String getDni(){
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //metodos
    public void imprimir(){
        System.out.println("DNI: " + dni);
        System.out.println("nombre: " + nombre);
        System.out.println("apellidos " + apellidos);
        System.out.println("edad " + edad);
    }
    //metodo para saber si es adulto
    public boolean isAdult(){
        return this.edad >= ADULT_AGE;
    }
    //Saber si esta jubilado
    public boolean isRetired(){
        return edad>= RETIRED_AGE;
    }
    //calcular diferencia de edad
    public int ageDiference(Persona otra){
        return Math.abs(this.edad- otra.edad);
    }
    public static boolean checkDNI(String dni) {

        return dni.length() == 9;
    }
}
