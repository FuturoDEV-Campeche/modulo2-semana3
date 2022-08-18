package br.com.futurodev.m2s3.aula3.classes;

import java.text.DecimalFormat;
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
    public String mostrarSaldo() {
        return formatarValor(saldo);
    }

    @Override
    public void mostrarExtrato() {
        System.out.println("Extrato"); // Cabeçalho
        for (Double valor : historico) { // Percorre todo o array do histórico
            System.out.println(
                    (valor >= 0 ? "+" : "")
                    + formatarValor(valor)
            ); // Exibe o valor de cada item do histórico
        }
    }

    @Override
    public String sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            historico.add((valor * -1));
            saldo -= valor;
        }
        return formatarValor(saldo);
    }

    @Override
    public String depositar(double valor) {
        if (valor > 0) {
            historico.add(valor);
            saldo += valor;
        }
        return formatarValor(saldo);
    }

    @Override
    public String pix(double valor, ContaBancaria destino) {

        return "";
    }

    @Override
    public String transferir(double valor, ContaBancaria destino) {
        return "";
    }

    private String formatarValor(double valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }

}
