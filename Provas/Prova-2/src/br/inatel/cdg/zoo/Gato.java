package br.inatel.cdg.zoo;

public class Gato extends Animal implements Alimentacao{
    private String raca;

    public Gato(String nome, int idade, boolean perigoso) {
        super(nome, idade, perigoso);
    }

    @Override
    public void mostraInfo(){
        System.out.println("Animal: Gato");
        System.out.println("Nome do Gato: " + getNome());
        System.out.println("Idade do Gato: " + getIdade());
        System.out.println("Este gato e perigoso?: " + isPerigoso());
        System.out.println("Raca do gato: " + raca);
        System.out.println(" ");
    }

    @Override
    public String barulho() {
        return "Miauuuu.......";
    }

    public void correr(){
        System.out.println("O gato esta correndo.......");
    }

    @Override
    public void comendo() {
        System.out.println("O gato esta comendo.......");
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
