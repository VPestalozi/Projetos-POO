import br.inatel.cdg.zoo.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoologico = new Zoo();
        zoologico.animais = new Animal[3];
        Leao leao1 = new Leao("Simba",4,true);
        Coruja coruja1 = new Coruja("Edvirges",6,false);
        Gato gato1 = new Gato("Meia-Noite",10,true);

        zoologico.setNome("Zoolandia");
        zoologico.setCnpj(1281823121);
        zoologico.setEndereco("Rua 4");

        leao1.setTamanhoJuba(12);
        zoologico.animais[0] = leao1;

        gato1.setRaca("Vira-Lata");
        zoologico.animais[1] = gato1;

        coruja1.setCor("Branca");
        zoologico.animais[2] = coruja1;

        zoologico.mostraInfo();
    }
}