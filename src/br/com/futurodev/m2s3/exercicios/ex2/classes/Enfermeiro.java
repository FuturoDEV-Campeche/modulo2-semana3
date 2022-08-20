package br.com.futurodev.m2s3.exercicios.ex2.classes;

import java.text.ParseException;

public class Enfermeiro extends Funcionario {

    final private String COREN;

    public Enfermeiro(
            String nome,
            String genero,
            String dataAdmissao,
            String coren
    ) throws ParseException {
        super(nome, genero, dataAdmissao);
        this.COREN = coren;
    }

    public void tratarPaciente(Paciente paciente) {
        System.out.println("Enfermeir@ " + this.getNome() + " está tratando o paciente "+ paciente.getNome());
        paciente.consumirMedicamentos();
    }

    public void auxiliarMedico(Medico medico) {
        System.out.println("Enfermeir@ " + this.getNome() + " está auxiliando o Dr. "+ medico.getNome());
    }

    public String getCoren() {
        return COREN;
    }

}
