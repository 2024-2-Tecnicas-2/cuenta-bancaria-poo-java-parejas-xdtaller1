package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        
        CuentaBancaria cuenta = new CuentaBancaria("Nicolas", "123456789", 10000);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.ingresar(500);
        System.out.println("Saldo despues de ingresar: " + cuenta.getSaldo());

        cuenta.retirar(200);
        System.out.println("Saldo despues de retirar: " + cuenta.getSaldo());

        cuenta.setTipoInteres(2.5);
        System.out.println("Interes a aplicar: " + cuenta.calcularInteres());
        ///...
    }
}
