package br.com.futurodev.m2s3.aula1.exemplocomplexo.classes;

public class Humano extends SerVivo {

    public Humano(String nome) {
        super("Humano", nome);
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando!");
    }

}
