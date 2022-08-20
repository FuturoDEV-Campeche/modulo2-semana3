package br.com.futurodev.m2s3.exercicios.ex2;

import br.com.futurodev.m2s3.exercicios.ex2.classes.*;

import javax.xml.stream.events.EndElement;
import java.text.ParseException;

/*
Continuando nosso sistema hospitalar, vamos tornar abstratas as classes Pessoa e Funcionário, para que não possam ser criadas instâncias.
Com isso, podemos implementar a nossa equipe médica e administrativa do hospital.
Crie então a classe Médico, Enfermeiro e Financeiro, com a seguinte especificação.
- Médico: tem como características o número CRM e seus comportamentos serão realizar consultas, receitar tratamentos e operar um paciente.
    Obs.: Todos os métodos do médico precisa utilizar um paciente passado por parâmetro.
- Enfermeiro: tem como características o número Coren e seus comportamentos será tratar pacientes e auxiliar médico.
    Obs.: Método de auxiliar médico precisa utilizar um médico como parâmetro e tratar paciente utilizando um paciente passado por parâmetro.
- Financeiro: seu comportamento será pagar salário.
    Obs.: Métodos de pagar salário precisa utilizar um funcionário como parâmetro.
Crie uma classe Exercicio2 com o método "main" em seu projeto para instanciar ao menos um paciente, médico, enfermeiro e financeiro. Para que:
O médico possa consultar, receitar tratamento e operar um paciente;
O enfermeiro possa tratar o paciente;
O financeiro possa realizar o pagamento ao médico e enfermeiro.
Obs.: Utilize encapsulamento e as convenções em todas as classes criadas.
*/
public class Exercicio2 {

    public static void main(String[] args) throws ParseException {

        Paciente pacienteGabriel     = new Paciente("Gabriel", "Masculino", "18/08/2022");
        Medico medicoFabio           = new Medico("Fábio", "Masculino", "18/08/2022", "4321/12");
        Enfermeiro enfermeiraSophiye = new Enfermeiro("Sophiye", "", "17/08/2022", "9876543/21");
        Financeiro financeiroFilipe  = new Financeiro("Filipe", "Masculino", "17/08/2022");

        medicoFabio.realizarConsulta(pacienteGabriel);
        medicoFabio.receitarTratamento(pacienteGabriel);
        System.out.println("Paciente internado no dia: " + pacienteGabriel.getDataInternacao());
        pacienteGabriel.consumirMedicamentos();
        medicoFabio.operar(pacienteGabriel);
        enfermeiraSophiye.auxiliarMedico(medicoFabio);
        enfermeiraSophiye.tratarPaciente(pacienteGabriel);

        financeiroFilipe.pagarSalario(financeiroFilipe);
        financeiroFilipe.pagarSalario(medicoFabio);
        financeiroFilipe.pagarSalario(enfermeiraSophiye);

    }

}
