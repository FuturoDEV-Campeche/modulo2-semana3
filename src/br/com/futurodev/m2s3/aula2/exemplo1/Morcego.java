package br.com.futurodev.m2s3.aula2.exemplo1;

public class Morcego extends Animal {

    public Morcego(String nome) {
        setEspecie("Morcego");
        setNome(nome);
    }

    @Override
    public void respirar() {
        dormir();
        System.out.println("Morcego.respirar()");
    }

    @Override
    public void dormir() {
        System.out.println("Morcego buscando um galho....");
        System.out.println("Morcego se pendurando de ponta cabeça no galho.");
        super.dormir();
        System.out.println("Morcego está domindo agora...");
    }

    @Override
    public String toString() {
        return "Morcego{" +
                "nome="+getNome()+","+
                "espécie="+getEspecie()+
                "}";
    }
}
