package br.com.futurodev.m2s3.aula1.exemplocomplexo;

import br.com.futurodev.m2s3.aula1.exemplocomplexo.classes.Humano;
import br.com.futurodev.m2s3.aula1.exemplocomplexo.classes.Planta;
import br.com.futurodev.m2s3.aula1.exemplocomplexo.classes.SerVivo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Aplicação inicializada!");

        SerVivo joao = new SerVivo("Humano", "João");
        System.out.println(joao);

        Humano gabrielzinho = new Humano("Gabrielzinho");
        System.out.println(gabrielzinho);

        joao.respirar();
        gabrielzinho.respirar();
        gabrielzinho.estudar();

        Planta orquidea = new Planta("Orquidea");
        orquidea.respirar();
        orquidea.fotossintese();

    }

}
