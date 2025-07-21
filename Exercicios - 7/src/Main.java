import br.inatel.cdg.Camiseta;
import br.inatel.cdg.Notebook;

public class Main {
    public static void main(String[] args) {
        //Criando os Pordutos
        Notebook not1 = new Notebook("Lenovo Ultra",1320);
        Camiseta camisa1 = new Camiseta("Polo",120);

        not1.setArmazenamento(120);
        not1.setGpu("NVIDIA 1050 ti");
        not1.setProcessador("Intel i5 6400");

        camisa1.setCor("Azul");
        camisa1.setTamanho("PP");

        //Saida de dados
        System.out.println("Produtos adicionados no sistema:");
        System.out.println("Etiqueta do " + not1.etiquetaPreco());
        System.out.println("Preco do produto: " + not1.getPreco());
        System.out.println("Especificacoes do produto:");
        System.out.println("Armazenamento: " + not1.getArmazenamento() + " Gb");
        System.out.println("GPU: " + not1.getGpu());
        System.out.println("Processador: " + not1.getProcessador());
        System.out.println("------------------------------");
        System.out.println("Etiqueta do produto: " + camisa1.etiquetaPreco());
        System.out.println("Preco do produto: " + camisa1.getPreco());
        System.out.println("Especificacoes do produto:");
        System.out.println("Cor: " + camisa1.getCor());
        System.out.println("Tamanho: " + camisa1.getTamanho());
    }
}