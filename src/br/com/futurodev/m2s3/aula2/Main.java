package br.com.futurodev.m2s3.aula2;

import br.com.futurodev.m2s3.aula2.exemplo1.Animal;
import br.com.futurodev.m2s3.aula2.exemplo1.Formiga;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema rodando...");

        Animal formiga = new Formiga();
        formiga.setNome("Formiga Atômica");

        System.out.println(formiga);
    }

}
