package br.com.futurodev.m2s3.exercicios.ex2.classes;

import java.text.ParseException;

public class Financeiro extends Funcionario {

    public Financeiro(String nome, String genero, String dataAdmissao) throws ParseException {
        super(nome, genero, dataAdmissao);
    }

    public void pagarSalario(Funcionario funcionario) {
        System.out.println("Financeiro pagando salário de " + funcionario.getNome());
    }

}
