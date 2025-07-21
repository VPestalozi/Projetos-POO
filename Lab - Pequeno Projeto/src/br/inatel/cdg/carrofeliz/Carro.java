package br.inatel.cdg.carrofeliz;

public abstract class Carro implements Controle{
    private double valor;
    private String cor;
    private int ano;

    public Carro(double valor,String cor,int ano){
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }


    @Override
    public void taxa(){
        System.out.println("A taxa do veiculo e de 20% com imposto");
    }

    @Override
    public void mostraInfo(){
        System.out.println("Informacoes do carro: ");
        System.out.println("Valor do carro sem a taxa = " + valor);
        System.out.println("Cor do carro: " + cor);
        System.out.println("Ano do carro: " + ano);
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

}
