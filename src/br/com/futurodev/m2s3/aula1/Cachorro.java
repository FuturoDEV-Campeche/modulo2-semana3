package br.com.futurodev.m2s3.aula1;

public class Cachorro extends Animal {

    public void latir() {
        System.out.println(getNome() + " - Cachorro.latir()");
    }

    public void rosnar() {
        System.out.println(getNome() + " - Cachorro.rosnar()");
    }

    public void cacarComer() {
        respirar();
        farejar();
        cacar();
        latir();
        comer();
    }

}
