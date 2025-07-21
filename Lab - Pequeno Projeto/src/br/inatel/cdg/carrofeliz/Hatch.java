package br.inatel.cdg.carrofeliz;

public class Hatch extends Carro{
    private int portas;
    public Hatch(double valor, String cor, int ano) {
        super(valor, cor, ano);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
