package Tarea1.Ejercicio3;

public class CuentaBancaria {
    private String titular;
    private String nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor >= 0) {
            this.saldo = this.saldo + valor;
            System.out.println("Monto depositado: " + valor);
        } else {
            System.out.println("No puedes depositar una cantidad negativa");
        }
    }

    public void retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Monto retirado: " + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public String mostrarDatos() {
        return "Datos de la cuenta: \n" + "Titular: " + this.titular + "\nNroCuenta: " + this.nroCuenta + "\nSaldo: " + this.saldo;
    }
}
