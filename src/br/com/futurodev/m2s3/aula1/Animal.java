package br.com.futurodev.m2s3.aula1;

public class Animal {

    private String especie;
    private String nome;

    public Animal() {
    }

    public Animal(String especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }



    public void cacar() {
        System.out.println(this.nome + " - Animal.cacar()");
    }

    public void comer() {
        System.out.println(this.nome + " - Animal.comer()");
    }

    public void respirar() {
        System.out.println(this.nome + " - Animal.respirar()");
    }



    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

}
