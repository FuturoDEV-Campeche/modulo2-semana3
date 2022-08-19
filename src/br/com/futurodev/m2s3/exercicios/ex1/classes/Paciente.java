package br.com.futurodev.m2s3.exercicios.ex1.classes;

import java.util.Date;

public class Paciente extends Pessoa {
    //Paciente: tem como características obrigatórias data da internação e seu comportamento será consumir remédios.
    private Date dataInternacao;

    // Construtor
    public Paciente(
            String nome,
            String genero,
            Date dataInternacao
    ) {
        super(nome, genero);
        this.dataInternacao = dataInternacao;
    }

    // Comportamento de consumir medicamentos
    public void consumirMedicamentos() {
        System.out.println("Paciente consumindo medicamentos.");
    }

    // Getter
    public Date getDataInternacao() {
        return dataInternacao;
    }
}
