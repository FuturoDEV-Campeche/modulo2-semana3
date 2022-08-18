package br.com.futurodev.m2s3.aula3.classes;

public interface ContaBancaria {

    String mostrarSaldo();
    void mostrarExtrato();

    String sacar(double valor);
    String depositar(double valor);

    String pix(double valor, ContaBancaria destino);
    String transferir(double valor, ContaBancaria destino);

}
