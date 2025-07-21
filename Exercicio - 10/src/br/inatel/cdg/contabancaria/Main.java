package br.inatel.cdg.contabancaria;

public class Main {
    public static void main(String[] args) throws SaldoInsuficiente {
        Conta conta1 = new Conta();
        conta1.setSaldo(100);
        conta1.setLimite(500);

        conta1.sacar(500);
    }
}
