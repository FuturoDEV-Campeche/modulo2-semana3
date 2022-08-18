package br.com.futurodev.m2s3.aula3.classes;

import java.util.ArrayList;
import java.util.List;

public class Conta implements ContaBancaria {

    private String nome;
    private String cpf;
    private int agencia;
    private int numero;
    private String tipo; // Conta Corrente, Poupança ou Salário

    private List<Double> historico = new ArrayList<>();

    private double saldo = 0.0;

    public Conta(String nome, String cpf, int agencia, int numero, String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public double mostrarSaldo() {
        return saldo;
    }

    @Override
    public void mostrarExtrato() {
        System.out.println("Extrato"); // Cabeçalho
        for (Double valor : historico) { // Percorre todo o array do histórico
            System.out.println(valor); // Exibe o valor de cada item do histórico
        }
    }

    @Override
    public double sacar(double valor) {
        return 0;
    }

    @Override
    public double depositar(double valor) {
        if (valor > 0) {
            historico.add(valor);
            saldo += valor;
        }
        return saldo;
    }

    @Override
    public double pix(double valor, ContaBancaria destino) {
        return 0;
    }

    @Override
    public double transferir(double valor, ContaBancaria destino) {
        return 0;
    }
}
