package tema4.cuentas;

public class Cuenta {
    private String numCuenta; // Número de cuenta
    private double saldo; // Saldo actual de la cuenta

    // Constructor para inicializar la cuenta
    public Cuenta(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    // Getter para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Método para recibir un abono
    public void recibirAbono(double cantidad) {
        saldo += cantidad; // Suma la cantidad al saldo actual
    }

    // Método para pagar un recibo
    public boolean pagarRecibo(double cantidad) {
        if (saldo >= cantidad) { // Comprueba si hay saldo suficiente
            saldo = saldo - cantidad; // Resta la cantidad del saldo
            return true; // Pago realizado con éxito
        }
        return false; // Saldo insuficiente, pago no realizado
    }
}

