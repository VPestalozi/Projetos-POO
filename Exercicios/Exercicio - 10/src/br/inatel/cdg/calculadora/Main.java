package br.inatel.cdg.calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int n1 = numero.nextInt();
        int n2 = numero.nextInt();
        int n3 = 0;

        try{
            n3 = n1/n2;
        }catch (ArithmeticException e){
            System.out.println("Erro:Divisão por zero");
        }
        numero.close();

        System.out.println("Soma entre n1 e n2 = " + (n1+n2));
        System.out.println("Subtracao entre n1 e n2 = " + (n1-n2));
        System.out.println("Divisão entre n1 e n2 = " + n3);
        System.out.println("Multiplicação entre n1 e n2 = " + (n1*n2));
    }
}
