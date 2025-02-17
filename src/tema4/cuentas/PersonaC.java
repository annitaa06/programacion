package cuentas;

public class PersonaC {
    private String dni;
    private Cuenta[] cuentas; //array para almacenar las cuentas
    private int numCuentas; //cuenta cuantas cuentas tiene la persona

    //public y this
    public PersonaC(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.numCuentas = 0;

    }

    public String getDni() {
        return dni;
    }

    public boolean agregarCuenta(Cuenta cuenta) { //agregar cuentas a una persona solo si no tiene 3
        if (numCuentas < 3) { //verifica que la persona tiene menos cuentas
            cuentas[numCuentas] = cuenta; //guarda la cuenta en el array de cuentas
            numCuentas++; //suma el contador
            return true; //devuelve true si se ha agregado correctamente
        }
        return false;
    }

    public boolean esMorosa() { //saldo negativo
        for (int i = 0; i < numCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                return true;
            }
        }
        return false;
    }
    public Cuenta buscarCuenta(String numCuenta) {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentas[i].getNumCuenta().equals(numCuenta)) { // COMPARA STRINGS CORRECTAMENTE
                return cuentas[i]; // Devuelve la cuenta encontrada
            }
        }
        return null; // Si no encuentra la cuenta, devuelve null
    }


    public void mostrarCuentas() {
        System.out.println("DNI: " + dni);
        for (int i = 0; i < numCuentas; i++) {
            System.out.println("Cuenta: " + cuentas[i].getNumCuenta() + " - Saldo: " + cuentas[i].getSaldo());
        }
    }
}
