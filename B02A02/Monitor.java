public class Monitor extends Produto {
    private double tamanhoTela;

    public Monitor(double tamanhoTela, String marca, String modelo, double preco) {
        super(marca, modelo, preco);
        this.setTamanhoTela(tamanhoTela);
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    @Override
    public String toString() {
        return "Monitor [tamanhoTela=" + tamanhoTela + ", Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Preco="
                + getPreco() + "]";
    }

}