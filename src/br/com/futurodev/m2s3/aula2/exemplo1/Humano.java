package br.com.futurodev.m2s3.aula2.exemplo1;

public class Humano extends Animal {

    public Humano(String nome) {
        setEspecie("Humano");
        setNome(nome);
    }

    // Método implementado a partir de um método abstrato
    @Override
    public void respirar() {
        System.out.println("Humano.respirar()");
    }

}
