package br.com.futurodev.m2s3.aula4;

import br.com.futurodev.m2s3.aula4.classes.Conta;
import br.com.futurodev.m2s3.aula4.classes.ContaBancaria;
import br.com.futurodev.m2s3.aula4.subclasses.ContaCorrente;

public class ContaMain {

    public static void main(String[] args) {
        System.out.println("Sistema bancário online!");

        Conta contaGabriel = new ContaCorrente(
                "Gabriel", "111.222.333-44",
                1, 12345
        );

        Conta contaSophiye = new ContaCorrente(
                "Sophiye Simon", "222.333.444-55",
                1, 54321
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
