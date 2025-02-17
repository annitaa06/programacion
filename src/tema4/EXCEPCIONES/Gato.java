package EXCEPCIONES;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(int edad, String nombre) throws Exception {
        setEdad(edad);
       setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        boolean compwhile = false;
        while (!compwhile) {
            if (nombre.length() < 3) {
                throw new Exception("EL NOMBRE DEBE TENER MINIMO TRES CARACTERES");
            }
            else this.nombre = nombre;
            compwhile = true;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        boolean compwhile = false;

        while (!compwhile) {
            if (edad < 0) {
                throw new Exception("LA EDAD NO PUEDE SER NEGATIVA");
            }
            else this.edad = edad;
            compwhile = true;
        }
    }

    public void imprimir(){
        System.out.println("NOMBRE: " + getNombre());
        System.out.println("APELLIDOS: " + getEdad());
    }


}
