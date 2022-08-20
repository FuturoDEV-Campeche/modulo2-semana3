package br.com.futurodev.m2s3.exercicios.ex1.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {
    // Funcionário: tem como característica obrigatória a data da admissão e seu comportamento será bater ponto.
    private Date dataAdmissao;

    // Construtor
    public Funcionario(
            String nome,
            String genero,
            String dataAdmissao
    ) throws ParseException {
        super(nome, genero);
        // Transformador de String para Data
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataAdmissao = formato.parse(dataAdmissao); // Atribui a dataAdmissao do parâmetro à dataAdmissao da instância
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
