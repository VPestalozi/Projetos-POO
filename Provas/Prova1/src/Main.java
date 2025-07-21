public class Main {
    public static void main(String[] args) {

        Faculdade faculdade1 = new Faculdade();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        Materia materia1 = new Materia();
        Materia materia2 = new Materia();

        aluno1.materias[0] = materia1;
        aluno1.materias[1] = materia2;

        aluno2.materias[0] = materia1;
        aluno2.materias[1] = materia2;

        // Definindo as materias dos alunos
        materia1.creditos = 100;
        materia1.nome = "Eletrica";
        materia1.sigla = "E202";

        materia2.creditos = 20;
        materia2.nome = "Software";
        materia2.sigla = "C302";

        // Definindo as informcoes da faculdade
        faculdade1.nome = "Inatel";
        faculdade1.cnpj = "1903123jp01";

        // Definindo a informacoes dos alunos
        aluno1.nome = "Cleiton";
        aluno1.curso = "Computacao";
        aluno1.matricula = 1734;

        aluno2.nome = "Roberta";
        aluno2.curso = "Eletrica";
        aluno2.matricula = 1923;

        // Chamando os metodos
        faculdade1.exibirInfos();
        System.out.println("------------------------------");
        aluno1.exibirInfos();
        System.out.println("Total de creditos do aluno: " + aluno1.totalCreditos());
        System.out.println("------------------------------");
        aluno2.exibirInfos();
        System.out.println("Total de creditos do aluno: " + aluno2.totalCreditos());
    }
}