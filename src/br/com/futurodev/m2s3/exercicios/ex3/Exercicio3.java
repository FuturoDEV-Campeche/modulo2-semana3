package br.com.futurodev.m2s3.exercicios.ex3;

import br.com.futurodev.m2s3.exercicios.ex3.classes.Autor;
import br.com.futurodev.m2s3.exercicios.ex3.classes.EBook;
import br.com.futurodev.m2s3.exercicios.ex3.classes.Livro;

/*
Crie uma classe Autor que contenha nome e email. Crie também uma classe Livro que contenha nome, descrição, autor,
valor e código isbn. Na sequência, crie uma classe EBook que contenha o atributo desconto, utilizando herança com
a classe livro. O EBook precisará possuir um método para aplicar desconto ao valor do livro.
Crie uma classe Exercicio3 com o método "main" em seu projeto para instanciar ao menos um autor, livro e e-book.
Obs.: Utilize encapsulamento e as convenções em todas as classes criadas.
 */
public class Exercicio3 {

    public static void main(String[] args) {

        // Cria objeto Autor
        Autor autor = new Autor("Antonie de Saint-Exupéry", "antonie@email.com");

        // Cria objeto Livro
        Livro livro = new Livro(
                "Pequeno Principe",
                "Quem poderia imaginar que a história de um aviador perdido no saara, " +
                        "que só queria fazer um amigo, de uma rosa convencida e de uma raposa " +
                        "ainda não domesticada se tonaria um dos livros mais lidos e mais queridos " +
                        "de todos os tempos?",
                autor,
                20d,
                "978-6586181562"
        );

        // Cria objeto EBook
        EBook ebook = new EBook(
                "Pequeno Principe",
                "Quem poderia imaginar que a história de um aviador perdido no saara, " +
                        "que só queria fazer um amigo, de uma rosa convencida e de uma raposa " +
                        "ainda não domesticada se tonaria um dos livros mais lidos e mais queridos " +
                        "de todos os tempos?",
                autor,
                20d,
                "978-6586181562",
                10d
        );
        ebook.aplicarDesconto(); // Aplica desconto ao livro

        System.out.println(livro);
        System.out.println(ebook);
    }

}
