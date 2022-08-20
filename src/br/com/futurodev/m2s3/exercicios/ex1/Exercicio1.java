package br.com.futurodev.m2s3.exercicios.ex1;

import br.com.futurodev.m2s3.exercicios.ex1.classes.Funcionario;
import br.com.futurodev.m2s3.exercicios.ex1.classes.Paciente;

import java.text.ParseException;
import java.util.Date;

/*
Vamos criar um sistema para um hospital, portanto utilizaremos 3 classes, são elas:
- Pessoa
- Paciente
- Funcionário
Crie as classes com seus atributos e utilize a devida herança entre elas.
- Pessoa: tem como características obrigatórias nome e gênero.
- Paciente: tem como características obrigatórias data da internação e seu comportamento será consumir remédios.
- Funcionário: tem como característica obrigatória a data da admissão e seu comportamento será bater ponto.
Crie uma classe Exercicio1 com o método "main" em seu projeto para instanciar ao menos um paciente e um funcionário.
Obs.: Utilize encapsulamento e as convenções em todas as classes criadas.
*/
public class Exercicio1 {

    public static void main(String[] args) throws ParseException {

        Paciente paciente1 = new Paciente("Gabriel", "Masculino", "18/08/2022");
        Funcionario funcionario1 = new Funcionario("Ritierri", "Masculino", "10/07/2021");

        System.out.println("Paciente internado às: " + paciente1.getDataInternacao());
        paciente1.consumirMedicamentos();

        System.out.println("Funcionario 1 admtido: " + funcionario1.getDataAdmissao());
        funcionario1.registrarPonto();

    }

}
