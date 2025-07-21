public class Aluno {
    String nome;
    int matricula;
    String curso;
    Materia[] materias = new Materia[10];

    int totalCreditos(){
        int contador = 0;
        for(int i=0;i< materias.length;i++){
            if(materias[i] != null){
                contador +=materias[i].creditos;
            }
        }
        return contador;
    }

    void exibirInfos(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("Curso do aluno: " + curso);
        for(int i=0;i< materias.length;i++){
            if(materias[i] != null){
                System.out.println("Materia cursada pelo aluno ");
                System.out.println("Materia: " + materias[i].nome);
                System.out.println("Sigla: " + materias[i].sigla);
            }
        }
    }

}
