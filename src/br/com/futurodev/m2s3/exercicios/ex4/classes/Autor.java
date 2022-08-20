package br.com.futurodev.m2s3.exercicios.ex4.classes;

public class Autor {

    //Atributos
    private String nome;
    private String email;

    // Construtor
    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
