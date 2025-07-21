package br.inatel.cdg;

public class Camiseta extends Produto{
    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String etiquetaPreco(){
        return getNome();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
