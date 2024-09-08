package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = 1.1;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public double calcularInteres() {
        return saldo * (tipoInteres / 100);
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        if (tipoInteres >= 0 && tipoInteres <= 10) {
            this.tipoInteres = tipoInteres;
        } else {
            System.out.println("El tipo de interés debe estar entre 0 y 10%.");
        }
    }

}
