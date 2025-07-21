import br.inatel.cdg.carrofeliz.Carro;
import br.inatel.cdg.carrofeliz.Hatch;
import br.inatel.cdg.carrofeliz.SUV;
import br.inatel.cdg.carrofeliz.Sedan;

public class Main {
    public static void main(String[] args) {
        SUV suv1 = new SUV(50000,"Azul",2016);
        Sedan sedan1 = new Sedan(60000,"Preto",2017);
        Hatch hatch1 = new Hatch(80000,"Branco",2022);

        suv1.setTracao("Tracao");
        sedan1.setPortaMalas(1);
        hatch1.setPortas(1);

        suv1.mostraInfo();
        suv1.getTracao();
        sedan1.mostraInfo();
        sedan1.getPortaMalas();
        hatch1.mostraInfo();
        hatch1.getPortas();
    }
}
