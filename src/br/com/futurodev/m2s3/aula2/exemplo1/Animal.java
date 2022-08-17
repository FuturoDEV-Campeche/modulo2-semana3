package br.com.futurodev.m2s3.aula2.exemplo1;

public abstract class Animal {

    private String especie;
    private String nome;

    public abstract void respirar();

    public String getEspecie() {
        return especie;
    }

    protected void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
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
