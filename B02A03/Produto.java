public abstract class Produto {
	private String marca;
	private String modelo;
	private double valorUnitario;
	
	public Produto(String marca, String modelo, double valorUnitario) {
		this.marca = marca;
		this.modelo = modelo;
		this.valorUnitario = valorUnitario;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

    public String descricaoPromString() {
		return descricaoPromString();
    }
    
    public double valorPromocao(){
        return valorPromocao();
    }

    // public void personalizar(String cor){
    //     return;
    // }

	@Override
	public String toString() {
		return "Produto [Marca = " + marca + ", Modelo = " + modelo + ", Valor Unitário = R$" + valorUnitario + "]";
	}
	
	
	
}