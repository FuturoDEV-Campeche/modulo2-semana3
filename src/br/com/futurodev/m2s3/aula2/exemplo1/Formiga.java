package br.com.futurodev.m2s3.aula2.exemplo1;

public class Formiga extends Animal {

    public Formiga(String nome) {
        super.setEspecie("Formiga");
        super.setNome(nome);
    }

    @Override
    public void respirar() {
        System.out.println("Formiga.respirar()");
    }

}
