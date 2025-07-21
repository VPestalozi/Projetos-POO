import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Comandos {

    public void addProfessor(Professor professor){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{

            os = new FileOutputStream("Professores.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // escrevendo os valores usando bw:
            bw.write("Professor");
            bw.newLine();
            bw.write(professor.nome + "\n");
            bw.write(professor.cpf + "\n");
            bw.write(professor.materia + "\n");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }

    public void removeProf(Professor profe){
        ArrayList<Professor> professors = ler();

        Iterator<Professor> iterator = professors.iterator();
        while (iterator.hasNext()) {
            Professor p = iterator.next();
            if (p.cpf.equals(profe.cpf)) {
                iterator.remove();
                System.out.println("Professor removido!");
                break;
            }
        }

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Professor.txt", false);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            for (Professor p : professors) {
                bw.write("Professor");
                bw.newLine();
                bw.write(p.nome + "\n");
                bw.write(p.cpf + "\n");
                bw.write(p.materia + "\n");
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public ArrayList<Professor> ler(){

        ArrayList<Professor> professores = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        // bloco try catch para tentar ler um arquivo
        try{
            is = new FileInputStream("Professores.txt");

            isr = new InputStreamReader(is);

            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){
                if(linhaLer.contains("Professor")){
                    Professor p = new Professor();
                    p.nome = br.readLine();
                    p.cpf = br.readLine();
                    p.materia = br.readLine();
                    professores.add(p);
                }
                linhaLer = br.readLine(); // pula pra proxima linha
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {

            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return professores;
    }
}
