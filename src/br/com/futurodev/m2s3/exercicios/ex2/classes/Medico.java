package br.com.futurodev.m2s3.exercicios.ex2.classes;

import java.text.ParseException;

public class Medico extends Funcionario {

    final private String CRM;

    public Medico(
            String nome,
            String genero,
            String dataAdmissao,
            String crm
    ) throws ParseException {
        super(nome, genero, dataAdmissao);
        this.CRM = crm;
    }

    //realizar consultas, receitar tratamentos e operar um paciente
    public void realizarConsulta(Paciente paciente) {
        System.out.println("O Dr. " + this.getNome() + " está consultando o paciente " + paciente.getNome());
    }

    public void receitarTratamento(Paciente paciente) {
        System.out.println("O Dr. " + this.getNome() + " receitou tratamento para paciente" + paciente.getNome());
    }

    public void operar(Paciente paciente) {
        System.out.println("O Dr. " + this.getNome() + " está operando o paciente " + paciente.getNome());
    }

    // Getter
    public String getCrm() {
        return CRM;
    }

}
