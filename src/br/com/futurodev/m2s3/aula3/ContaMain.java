package br.com.futurodev.m2s3.aula3;

import br.com.futurodev.m2s3.aula3.classes.Conta;

public class ContaMain {

    public static void main(String[] args) {
        System.out.println("Sistema bancário online!");

        Conta contaGabriel = new Conta(
                "Gabriel", "111.222.333-44",
                1, 12345, "Corrente"
        );

        System.out.println("Saldo inicial: " + contaGabriel.mostrarSaldo());

        contaGabriel.depositar(200);
        contaGabriel.mostrarExtrato();
        System.out.println("Saldo após depósito: " + contaGabriel.mostrarSaldo());

        contaGabriel.sacar(150);
        contaGabriel.mostrarExtrato();
        System.out.println("Saldo após saque: " + contaGabriel.mostrarSaldo());

    }

}
