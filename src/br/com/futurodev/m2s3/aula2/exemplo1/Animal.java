package br.com.futurodev.m2s3.aula2.exemplo1;

public abstract class Animal {

    private String especie;
    private String nome;

    // Método abstrato - Sem a implementação do que ele deve fazer
    public abstract void respirar();

    public void dormir() {
        System.out.println("Animal.dormir()");
    }

    public String getEspecie() {
        return especie;
    }

    // Método protegido (protected) para dar acesso somente à classes do mesmo pacote ou por meio de herança
    protected void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    // Método protegido (protected) para dar acesso somente à classes do mesmo pacote ou por meio de herança
    protected void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

}
