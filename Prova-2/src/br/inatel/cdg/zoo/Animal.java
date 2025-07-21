package br.inatel.cdg.zoo;

public abstract class Animal {
    public static int qntAnimais=0;
    private String nome;
    private int idade;
    private boolean perigoso;

    public Animal(String nome,int idade,boolean perigoso){
        this.nome = nome;
        this.idade = idade;
        this.perigoso = perigoso;
        qntAnimais++;
    }
    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Perigo: " + perigoso);
    }
    public abstract String barulho();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

}
