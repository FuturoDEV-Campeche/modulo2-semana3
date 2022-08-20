package br.com.futurodev.m2s3.exercicios.ex2.classes;

public abstract class Pessoa {

    // Pessoa: tem como características obrigatórias nome e gênero.
    private String nome;
    private String genero;

    // Construtor
    public Pessoa(String nome, String genero) {
        this.nome = nome; // Atribui o nome do parâmetro ao nome da instância
        this.genero = genero; // Atribui o genero do parâmetro ao genero da instância
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

}
