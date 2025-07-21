public class Faculdade {
    String nome;
    String cnpj;
    Faculdade(){
        Aluno alunos = new Aluno();
        System.out.println("Teste do sistema");
        alunos.nome = "test";
        alunos.matricula = 0;
        alunos.curso = "test";
        alunos.exibirInfos();
        System.out.println("-------------------------");
    }
    void exibirInfos(){
        System.out.println("Informacao Faculdade:");
        System.out.println("Nome da faculdade: " + nome);
        System.out.println("CNPJ da faculdade: " + cnpj);
    }

}
