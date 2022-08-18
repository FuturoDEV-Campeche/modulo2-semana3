package br.com.futurodev.m2s3.aula3.classes;

public interface ContaBancaria {

    double mostrarSaldo();
    void mostrarExtrato();

    double sacar(double valor);
    double depositar(double valor);

    double pix(double valor, ContaBancaria destino);
    double transferir(double valor, ContaBancaria destino);

}
