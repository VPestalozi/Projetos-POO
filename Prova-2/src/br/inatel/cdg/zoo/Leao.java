package br.inatel.cdg.zoo;

public class Leao extends Animal{
    private float tamanhoJuba;
    public Leao(String nome, int idade, boolean perigoso) {
        super(nome, idade, perigoso);
    }

    @Override
    public void mostraInfo(){
        System.out.println("Animal: Leao");
        System.out.println("Nome do Leao: " + getNome());
        System.out.println("Idade do Leao: " + getIdade());
        System.out.println("Este leao e perigoso?: " + isPerigoso());
        System.out.println("Tamanho da juba do leao: " + tamanhoJuba + " cm");
        System.out.println(" ");
    }

    @Override
    public String barulho() {
        return "Roarrrrrrrr......";
    }

    public void dormir(){
        System.out.println("O leao esta indo dormir.....");
    }

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }
}
