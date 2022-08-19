package br.com.futurodev.m2s3.exercicios.ex1.classes;

import java.util.Date;

public class Funcionario extends Pessoa {
    // Funcionário: tem como característica obrigatória a data da admissão e seu comportamento será bater ponto.
    private Date dataAdmissao;

    // Construtor
    public Funcionario(String nome, String genero, Date dataAdmissao) {
        super(nome, genero);
        this.dataAdmissao = dataAdmissao; // Atribui a dataAdmissao do parâmetro à dataAdmissao da instância
    }

    // Comportamento de registrar o ponto
    public void registrarPonto() {
        System.out.println("Registrando ponto: " + new Date());
    }

    // Getter
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

}
