package tema4.Reloj;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean formato24horas;

    //constructor vacio
    public Reloj() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    //constructor con aprametros
    public Reloj(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("la hora no es valida");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("minutos no validos deben estar entre 1 y 59");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo > 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("segundo no validos deben estar entre 1 y 59");
        }
    }

    public void mostrarHora(){
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    //para ponerlo en lenguaje humano
    public String toString() {
    return hora +":"+ minuto + ":" + segundo;
    }

}
