package br.com.futurodev.m2s3.exercicios.ex2.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente extends Pessoa {
    //Paciente: tem como características obrigatórias data da internação e seu comportamento será consumir remédios.
    private Date dataInternacao;

    // Construtor
    public Paciente(
            String nome,
            String genero,
            String dataInternacao
    ) throws ParseException {
        super(nome, genero);
        // Transformador de String para Data
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataInternacao = formato.parse(dataInternacao);
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
