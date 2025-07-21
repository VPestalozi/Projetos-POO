package br.inatel.cdg.zoo;

public class Zoo {
    private String nome;
    private String endereco;
    private long cnpj;

    public Animal[] animais;

    public void mostraInfo(){
        System.out.println("Informacoes do Zoologico");
        System.out.println("Nome do Zoologico: " + nome);
        System.out.println("Endereco do Zoologico: " + endereco);
        System.out.println("CNPJ do Zoologico: " + cnpj);
        System.out.println("Quantidade de animais: " + Animal.qntAnimais);
        System.out.println(" ");
        System.out.println("Informacoes dos animais");
        for(Animal animal : animais){
            if(animal instanceof Gato){
                animal.mostraInfo();
                System.out.println(animal.barulho());
                ((Gato) animal).comendo();
                ((Gato) animal).correr();
                System.out.println(" ");
            }
            if(animal instanceof Leao){
                animal.mostraInfo();
                System.out.println(animal.barulho());
                ((Leao) animal).dormir();
                System.out.println(" ");
            }
            if(animal instanceof Coruja){
                animal.mostraInfo();
                System.out.println(animal.barulho());
                ((Coruja) animal).comendo();
                ((Coruja) animal).voar();
                System.out.println(" ");
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
