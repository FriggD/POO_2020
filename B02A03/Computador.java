public class Computador extends Produto implements Promocionavel, Personalizavel, Comparable<Computador> {
	private String memoria;
	private String processador;
	private String hd;
	private String cor = "Preto";
	
	public Computador(String marca, String modelo, double valorUnitario, String memoria, String processador,
			String hd) {
		super(marca, modelo, valorUnitario);
		this.memoria = memoria;
		this.processador = processador;
		this.hd = hd;
	}

	public String getMemoria() {
		return memoria;
	}

	public String getProcessador() {
		return processador;
	}

	public String getHd() {
		return hd;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public void personalizar(String cor) {
		this.cor=cor;
	}

	@Override
	public String descricaoPromString() {
		return "De 2 a 4 computadores, 15% de desconto em cada. De 5 a 6, 25% de desconto em cada. Acima de 6, 30% de desconto em cada";
	}

	@Override
	public double valorPromocao(int quantidadeProdutos) {
		
		if(quantidadeProdutos>1&&quantidadeProdutos<5) {
			double vUnit = (getValorUnitario() - (getValorUnitario()*0.15));
			System.out.println("Valor Unitário: R$" + String.format("%.2f",vUnit)+"\nValor Total da Compra: R$"+String.format("%.2f",vUnit*quantidadeProdutos));
			return (vUnit*quantidadeProdutos);
		}
		else if(quantidadeProdutos>4&&quantidadeProdutos<7) {
			double vUnit = (getValorUnitario() - (getValorUnitario()*0.25));
			System.out.println("Valor Unitário: R$" + String.format("%.2f",vUnit)+"\nValor Total da Compra: R$"+String.format("%.2f",vUnit*quantidadeProdutos));
			return (vUnit*quantidadeProdutos);
		}
		else if(quantidadeProdutos>6)  {
			double vUnit = (getValorUnitario() - (getValorUnitario()*0.3));
			System.out.println("Valor Unitário: R$" + String.format("%.2f",vUnit)+"\nValor Total da Compra: R$"+String.format("%.2f",vUnit*quantidadeProdutos));
			return (vUnit*quantidadeProdutos);
		}
		
		else {
			double vUnit = (getValorUnitario());
			System.out.println("Valor Unitário: R$" + String.format("%.2f",vUnit)+"\nValor Total da Compra: R$"+String.format("%.2f",vUnit*quantidadeProdutos));
			return (vUnit*quantidadeProdutos);
		}
		
	}

	@Override
	public String toString() {
		return "Computador [Marca = " + getMarca() + ", Modelo = " + getModelo() + ", Valor Unitário = R$"
				+ getValorUnitario() + ", Memória = " + memoria + ", Processador = " + processador + ", HD = " + hd + ", Cor = "
				+ cor + "]";
	}

	@Override
	public int compareTo(Computador c) {
		 if(getValorUnitario()==c.getValorUnitario())  
		      return 0;  
		   else if(this.getValorUnitario()>c.getValorUnitario())  
		      return 1;  
		   else  
		      return -1;  
	}

}