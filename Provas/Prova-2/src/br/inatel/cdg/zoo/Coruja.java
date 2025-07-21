package br.inatel.cdg.zoo;

public class Coruja extends Animal implements Alimentacao{

    private String cor;

    public Coruja(String nome, int idade, boolean perigoso) {
        super(nome, idade, perigoso);
    }

    @Override
    public void mostraInfo(){
        System.out.println("Animal: Coruja");
        System.out.println("Nome da Coruja: " + getNome());
        System.out.println("Idade da Coruja: " + getIdade());
        System.out.println("Esta coruja e perigosa?: " + isPerigoso());
        System.out.println("Cor da coruja: " + cor);
        System.out.println(" ");
    }

    @Override
    public String barulho() {
        return "Barulho de coruja.....";
    }

    public void voar(){
        System.out.println("A coruja esta voando........");
    }

    @Override
    public void comendo() {
        System.out.println("A coruja esta comendo.....");
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
