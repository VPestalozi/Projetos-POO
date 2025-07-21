public class Fogao extends Mercadoria{
    private int quantidadeBocas;
    private String tipoAcendimento;
    public Fogao(int codigo, String fabricante, String descricao, double valor) {
        super(codigo, fabricante, descricao, valor);
    }

    public int getQuantidadeBocas() {
        return quantidadeBocas;
    }

    public void setQuantidadeBocas(int quantidadeBocas) {
        this.quantidadeBocas = quantidadeBocas;
    }

    public String getTipoAcendimento() {
        return tipoAcendimento;
    }

    public void setTipoAcendimento(String tipoAcendimento) {
        this.tipoAcendimento = tipoAcendimento;
    }
}
