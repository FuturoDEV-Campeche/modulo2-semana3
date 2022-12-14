package br.com.futurodev.m2s3.aula3;

import br.com.futurodev.m2s3.aula3.classes.Conta;
import br.com.futurodev.m2s3.aula3.classes.ContaBancaria;

public class ContaMain {

    public static void main(String[] args) {
        System.out.println("Sistema bancário online!");

        ContaBancaria contaGabriel = new Conta(
                "Gabriel", "111.222.333-44",
                1, 12345, "Corrente"
        );

        ContaBancaria contaSophiye = new Conta(
                "Sophiye Simon", "222.333.444-55",
                1, 54321, "Corrente"
        );

        System.out.println("Saldo inicial: " + contaGabriel.mostrarSaldo());

        contaGabriel.depositar(500);
        contaGabriel.mostrarExtrato();
        System.out.println("Saldo após depósito: " + contaGabriel.mostrarSaldo());

        contaGabriel.sacar(150);
        contaGabriel.mostrarExtrato();
        System.out.println("Saldo após saque: " + contaGabriel.mostrarSaldo());

        System.out.println("Saldo da Sophiye antes do PIX: " + contaSophiye.mostrarSaldo());

        contaGabriel.pix(50, contaSophiye);

        System.out.println("Saldo da Sophiye: " + contaSophiye.mostrarSaldo());
        System.out.println("Saldo do Gabriel: " + contaGabriel.mostrarSaldo());
        contaSophiye.depositar(2000);

        System.out.println("------------------------------------------------");

        System.out.println("Extrato do Gabriel");
        contaGabriel.mostrarExtrato();

        contaGabriel.transferir(100, contaSophiye);

        System.out.println("Extrato do Gabriel");
        contaGabriel.mostrarExtrato();

        System.out.println("Extrato da Sophiye");
        contaSophiye.mostrarExtrato();

        System.out.println("Saldo do Gabriel: "+contaGabriel.mostrarSaldo());

        System.out.println("Saldo da Sophiye: " + contaSophiye.mostrarSaldo());



    }

}
