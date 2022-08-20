package br.com.futurodev.m2s3.exercicios.ex4;

import br.com.futurodev.m2s3.exercicios.ex4.classes.Box;
import br.com.futurodev.m2s3.exercicios.ex4.classes.Livro;
import br.com.futurodev.m2s3.exercicios.ex4.classes.Autor;
import br.com.futurodev.m2s3.exercicios.ex4.classes.EBook;

import java.util.ArrayList;
import java.util.List;

/*
Criar uma classe Box que contenha nome, valor total, desconto e lista de livros. Para adicionar
um novo item na lista de livros, deve ser criado um método para realizar esta ação. Ao adicionar
um novo livro à lista, também deve ser somado o valor do livro ao valor total do box.
Será necessário:
- Utilizar a sobrecarga de métodos para adicionar também vários livros de uma só vez.
- Utilizar a sobrescrita de métodos para sobrescrever o método "toString", no método deverá exibir
  ao menos o nome e o valor líquido (valor total - desconto).
- Na mesma lista de livros precisam ser incluídos e-books.
Crie uma classe Exercicio4 com o método "main" em seu projeto para instanciar ao menos um autor, livro, e-book e box.
Obs.: Utilize encapsulamento e as convenções em todas as classes criadas.
 */
public class Exercicio4 {

    public static void main(String[] args) {

        // Cria objeto Autor
        Autor autor = new Autor("Antonie de Saint-Exupéry", "antonie@email.com");

        // Cria objeto Livro
        Livro livro = new Livro(
                "Pequeno Príncipe",
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
                "Pequeno Príncipe",
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

        // Criando Box 1
        Box box1 = new Box();
        box1.setNome("Box Pequeno Príncipe + E-book"); // Método set para atribuir o nome do Box
        box1.adicionar(livro);
        box1.adicionar(ebook); // Na mesma lista de livros precisam ser incluídos e-books.
        System.out.println(box1);

        // Criando lista de livros para adicionar todos usando o método criado com recurso de sobrecarga
        List<Livro> listaLivros = new ArrayList<>();
        listaLivros.add(livro);
        listaLivros.add(ebook);

        // Criando Box 2 - Promocional
        Box box2 = new Box();
        box2.setNome("Box promocional - Pequeno Príncipe + E-book");
        box2.setDesconto(5); // Atribui 5 em desocnto
        box2.adicionar(listaLivros); // Utilizando a sobrecarga do método adicionar para adicionar também vários livros de uma só vez.
        System.out.println(box2);

    }

}
