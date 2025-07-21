public class Main {
    public static void main(String[] args) {
       Geladeira gela1 = new Geladeira(12,"Eletrolux","Contem 2 portas e um otimo freezer",150);
       Fogao fog1 = new Fogao(10,"Brasa","Fogao 4 bocas de otima qualidade",120);

       gela1.setTipo("Comum");
       gela1.setTamanho(2);
       gela1.setQuantidadePortas(2);

       fog1.setQuantidadeBocas(4);
       fog1.setTipoAcendimento("A gas");
    }
}