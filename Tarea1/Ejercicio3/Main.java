package Tarea1.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("William Mamani", "123456", 100);
        System.out.println("Saldo actual: " + cuenta1.getSaldo());
        cuenta1.depositar(-100);
        cuenta1.depositar(200);
        cuenta1.retirar(500);
        cuenta1.retirar(160);

        System.out.println("");

        System.out.println(cuenta1.mostrarDatos());
    }
}
