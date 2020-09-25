public abstract class Produto {
	
	protected String nome;
    protected String marca;
    protected String modelo;
    protected double preco;


    public Produto(String nome, String marca, String modelo, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
    
    	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + "]";
	}


}