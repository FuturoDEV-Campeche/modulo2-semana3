package br.com.futurodev.m2s3.exercicios.ex4.classes;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private String nome;
    private double valorTotal;
    private double desconto;
    private List<Livro> livros = new ArrayList<>();

    public void adicionar(Livro livro) {
        livros.add(livro);
        valorTotal += livro.getValor(); // Incrementando o valor total com o valor do livro
    }

    // Utilizando a sobrecarga do método adicionar para adicionar também vários livros de uma só vez.
    public void adicionar(List<Livro> livros) {
        for (Livro livro : livros) { // Percorre lista de livros e para adicioná-los à lista do box
            adicionar(livro); // Utiliza a função adicionar que recebe um parâmetro livro (método acima)
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    // Utilizar a sobrescrita de métodos para sobrescrever o método "toString", no método
    // deverá exibir ao menos o nome e o valor líquido (valor total - desconto).
    @Override
    public String toString() {
        return "Box{" +
                "nome='" + nome + '\'' +
                ", valorTotal=" + valorTotal +
                ", desconto=" + desconto +
                ", valorLiquido=" + (valorTotal - desconto) +
                ", livros=" + livros +
                '}';
    }
}
