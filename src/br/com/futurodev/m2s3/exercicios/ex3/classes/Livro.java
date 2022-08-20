package br.com.futurodev.m2s3.exercicios.ex3.classes;

public class Livro {

    //Atributos
    private String nome;
    private String descricao;
    private Autor autor; // Tipo Autor
    private Double valor;
    private String codigoIsbn;

    // Construtor
    public Livro(String nome, String descricao, Autor autor, Double valor, String codigoIsbn) {
        this.nome = nome;
        this.descricao = descricao;
        this.autor = autor;
        this.valor = valor;
        this.codigoIsbn = codigoIsbn;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Autor getAutor() {
        return autor;
    }

    public Double getValor() {
        return valor;
    }

    public String getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", autor=" + autor +
                ", valor=" + valor +
                ", codigoIsbn='" + codigoIsbn + '\'' +
                '}';
    }

}
