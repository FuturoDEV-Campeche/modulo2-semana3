package br.com.futurodev.m2s3.aula2.exemplo1;

public class Formiga extends Animal {

    // Construtor que recebe Nome como parâmetro e passa a espécie de forma fixa
    public Formiga(String nome) {
        super.setEspecie("Formiga");
        super.setNome(nome);
    }

    // Método implementado a partir de um método abstrato
    @Override
    public void respirar() {
        System.out.println("Formiga.respirar()");
    }

}
