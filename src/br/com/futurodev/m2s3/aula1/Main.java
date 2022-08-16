package br.com.futurodev.m2s3.aula1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Aplicação rodando corretamente!");

        Animal cachorroAmora = new Cachorro();

        cachorroAmora.setEspecie("Cachorro");
        cachorroAmora.setNome("Amora");
        System.out.println(cachorroAmora);

        Cachorro cachorroKent = new Cachorro();
        cachorroKent.setEspecie("Cachorro");
        cachorroKent.setNome("Kent");
        System.out.println(cachorroKent);

        Cachorro cachorroScooby = new Cachorro();
        cachorroScooby.setEspecie("Cachorro");
        cachorroScooby.setNome("Scooby");
        System.out.println(cachorroScooby);


        Animal humano = new Animal("Humano", "Gabriel");
        System.out.println(humano);


        System.out.println("#########");
        System.out.println("# Ações #");
        System.out.println("#########");

        System.out.println("###########");
        System.out.println("# Animais #");
        System.out.println("###########");
        cachorroAmora.respirar();
        humano.respirar();

        System.out.println("#############");
        System.out.println("# Cachorros #");
        System.out.println("#############");
        cachorroKent.respirar();
        cachorroScooby.respirar();
        cachorroKent.cacar();
        cachorroScooby.cacar();
        cachorroKent.comer();
        cachorroScooby.comer();

        cachorroKent.latir();
        cachorroScooby.latir();

        cachorroKent.rosnar();
        cachorroScooby.rosnar();



    }

}
