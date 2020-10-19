public class Produto {

	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto(String nome, double valor, int quantidade) throws ValorIncorretoException {
		if(nome.length() < 3)
			throw new ValorIncorretoException("Nome não pode ser inferior a 3 caracteres");
		this.nome = nome;
		if(valor < 0)
			throw new ValorIncorretoException("Valor não pode ser inferior a 0");
		this.valor = valor;
		if(quantidade < 0)
			throw new ValorIncorretoException("Valor não pode ser inferior a 0");
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws ValorIncorretoException {
		if(nome.length() < 3)
			throw new ValorIncorretoException("Nome não pode ser inferior a 3 caracteres");
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) throws ValorIncorretoException {
		if(valor < 0)
			throw new ValorIncorretoException("Valor não pode ser inferior a 0");
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) throws ValorIncorretoException {
		if(quantidade < 0)
			throw new ValorIncorretoException("Valor não pode ser inferior a 0");
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Produto [Nome = " + nome + ", Valor = " + valor + ", Quantidade = " + quantidade + "]";
	}
	
}