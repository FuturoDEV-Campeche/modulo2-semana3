package br.com.futurodev.m2s3.aula4.classes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements ContaBancaria {

    private String nome;
    final private String CPF;
    final private int AGENCIA;
    final private int NUMERO;
    private String tipo; // Conta Corrente, Poupança ou Salário

    private double taxaTransferencia = 20;

    private double saldo = 0.0;
    private List<Double> historico = new ArrayList<>();

    public Conta(String nome, String cpf, int agencia, int numero, String tipo) {
        this.nome = nome;
        this.CPF = cpf;
        this.AGENCIA = agencia;
        this.NUMERO = numero;
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
        if (verificaSaldoSuficiente(valor)) {
            diminuirSaldo(valor);
        }
        return formatarValor(saldo);
    }

    public String sacar(Integer valor) {
        return sacar(Double.parseDouble(valor.toString()));
    }

    public String sacar(double valor, double taxa) {
        return formatarValor(saldo);
    }

    @Override
    public String depositar(double valor) {
        if (valor > 0) {
            adicionarSaldo(valor);
        }
        return formatarValor(saldo);
    }

    @Override
    public String pix(double valor, ContaBancaria destino) {
        if (verificaSaldoSuficiente(valor)) {
            diminuirSaldo(valor);
            destino.depositar(valor);
        }
        return formatarValor(saldo);
    }

    @Override
    public String transferir(double valor, ContaBancaria destino) {
        double valorDescontar = valor + taxaTransferencia;
        if (verificaSaldoSuficiente(valorDescontar)) {
            diminuirSaldo(valorDescontar);
            destino.depositar(valor);
        }
        return formatarValor(saldo);
    }

    private String formatarValor(double valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }

    private boolean verificaSaldoSuficiente(double valor) {
        boolean retorno = (valor > 0 && saldo >= valor);
        return retorno;
    }

    private void diminuirSaldo(double valor) {
        historico.add(valor * -1);
        saldo -= valor;
    }

    private void adicionarSaldo(double valor) {
        historico.add(valor);
        saldo += valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return CPF;
    }

    public int getAgencia() {
        return AGENCIA;
    }

    public int getNumero() {
        return NUMERO;
    }

    public String getTipo() {
        return tipo;
    }

    public double getTaxaTransferencia() {
        return taxaTransferencia;
    }
}
