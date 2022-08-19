package br.com.futurodev.m2s3.aula4.subclasses;

import br.com.futurodev.m2s3.aula4.classes.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, String cpf, int agencia, int numero) {
        super(nome, cpf, agencia, numero, "Conta Corrente");
    }

}
