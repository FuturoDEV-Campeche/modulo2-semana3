package br.com.futurodev.m2s3.aula2.exemplo1;

public class Morcego extends Animal {

    // Construtor que recebe Nome como parâmetro e passa a espécie de forma fixa
    public Morcego(String nome) {
        setEspecie("Morcego");
        setNome(nome);
    }

    // Método implementado a partir de um método abstrato
    @Override
    public void respirar() {
        dormir();
        System.out.println("Morcego.respirar()");
    }

    // Método sobrescrito da classe Animal
    @Override
    public void dormir() {
        System.out.println("Morcego buscando um galho....");
        System.out.println("Morcego se pendurando de ponta cabeça no galho.");
        super.dormir(); // Chama o método dormir da superclasse (Animal)
        System.out.println("Morcego está domindo agora...");
    }

    // Método sobrescrito da classe Animal
    @Override
    public String toString() {
        return "Morcego{" +
                "nome="+getNome()+","+
                "espécie="+getEspecie()+
                "}";
    }
}
