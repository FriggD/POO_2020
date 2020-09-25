public abstract class Produto {
    private String marca;
    private String nome;
    private String modelo;
    private double preco;

    public Produto(String nome, double preco){
        // this.setMarca(marca);
        this.setNome(nome);
        this.setPreco(preco);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPreco() {
        return preco;
    }

    public String toString(){
        dadosProd = "Marca: " + getMarca() + "\nModel: " + getModelo() + "\nPreco: " + getPreco();
        return dadosProd;
    }

}
