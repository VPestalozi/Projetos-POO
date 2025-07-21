package br.inatel.cdg.contabancaria;

public class SaldoInsuficiente extends Exception{
    public SaldoInsuficiente(String message) {
        super(message);
    }
}
