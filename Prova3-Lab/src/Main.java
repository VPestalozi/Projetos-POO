import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comandos comandos = new Comandos();
        Professor professor1 = new Professor();

        System.out.println("Deseja colocar algum professor no sistem?");
        System.out.println("1 - sim / 2 - nao");
        int test = scanner.nextInt();

        if (test==1) {
            try {
                System.out.println("Digite as informações do professor");
                professor1.nome = scanner.next();
                professor1.cpf = scanner.next();
                professor1.materia = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Erro por favor tente novamente");
            }
        }
        if (test==2) {
            System.out.println("Nenhum professor foi inserido");
        }

        System.out.println("Digite a operação desejada:");
        System.out.println(" (+) - Inserir no sistema / (-) - Remover do sistema / (*) - Demonstrar os professores inseridos");
        String op = scanner.next();
        char opdef = op.charAt(0);
        switch (opdef) {
            case '+':
                comandos.addProfessor(professor1);
                break;
            case '-':
                comandos.removeProf(professor1);
                break;
            case '*':
                comandos.ler();
                break;
        }
        scanner.close();
    }
}