package br.com.futurodev.m2s3.exercicios.ex4.classes;

public class EBook extends Livro {

    //Atributos
    private Double desconto;

    // Construtor sem desconto
    public EBook(String nome, String descricao, Autor autor, Double valor, String codigoIsbn) {
        super(nome, descricao, autor, valor, codigoIsbn);
    }
    // Construtor com desconto
    public EBook(String nome, String descricao, Autor autor, Double valor, String codigoIsbn, Double desconto) {
        this(nome, descricao, autor, valor, codigoIsbn);
        this.desconto = desconto;
    }

    public void aplicarDesconto() {
        if (desconto != null && desconto > 0) { // Verifica se existe deseconto e se é maior que ZERO
            /* Aplica o desconto no valor. Como o valor é herdado
             * da classe Livro, utilizamos os métodos "setValor" e "getValor" */
            setValor(getValor()-desconto);
        }
    }

    // Getters e Setters
    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", autor=" + getAutor() +
                ", valor=" + getValor() +
                ", codigoIsbn='" + getCodigoIsbn() + '\'' +
                ", desconto='" + desconto + '\'' +
                '}';
    }

}
