package br.com.futurodev.m2s3.aula2;

import br.com.futurodev.m2s3.aula2.exemplo1.Animal;
import br.com.futurodev.m2s3.aula2.exemplo1.Formiga;
import br.com.futurodev.m2s3.aula2.exemplo1.Humano;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema rodando...");

        Animal formiga = new Formiga("Formiga Atômica");
        formiga.respirar();
        System.out.println(formiga);


        Humano serHumano = new Humano("Gabriel");
        serHumano.respirar();
        System.out.println(serHumano);
    }

}
