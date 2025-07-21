package br.inatel.cdg.contabancaria;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    public void depositar(double valor){
        System.out.println("Valor de: " + valor + " R$ foram depositados na sua conta");
        saldo +=valor;
    }

    public void sacar(double valor) throws SaldoInsuficiente {
        if(valor>saldo | valor>limite){
            throw new SaldoInsuficiente("Esta operação não pode ser concluida");
        }
        else{
            System.out.println("O saque de " + valor + "R$ foi realizado");
            saldo-=valor;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
