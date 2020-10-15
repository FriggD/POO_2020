public class Monitor extends Produto implements Promocionavel, Comparable<Monitor> {

	private String tamanhoTela;
	private int quantidadeProdutos;
	
	public Monitor(String marca, String modelo, double valorUnitario, String tamanhoTela) {
		super(marca, modelo, valorUnitario);
		this.tamanhoTela = tamanhoTela;
	}

	public String getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(String tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	@Override
	public String descricaoPromocao() {
		return "De 2 a 5 monitores, 10% de desconto em cada. De 6 a 10, 15% de desconto em cada. Acima de 10, 25% de desconto em cada";
	}

	@Override
	public double valorPromocao(int quantidadeProdutos) {
		
		this.quantidadeProdutos = quantidadeProdutos;
		if(quantidadeProdutos>1&&quantidadeProdutos<6) {
			double vUnit = (getValorUnitario() - (getValorUnitario()*0.1));
			System.out.println("Valor Unitário: R$" + String.format("%.2f",vUnit)+"\nValor Total da Compra: R$"+String.format("%.2f",vUnit*quantidadeProdutos));
			return (vUnit*quantidadeProdutos);
		}
		else if(quantidadeProdutos>5&&quantidadeProdutos<11) {
			double vUnit = (getValorUnitario() - (getValorUnitario()*0.15));
			System.out.println("Valor Unitário: R$" + String.format("%.2f",vUnit)+"\nValor Total da Compra: R$"+String.format("%.2f",vUnit*quantidadeProdutos));
			return (vUnit*quantidadeProdutos);
		}
		else if(quantidadeProdutos>10)  {
			double vUnit = (getValorUnitario() - (getValorUnitario()*0.25));
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
		return "Monitor [Marca = " + getMarca() + ", Modelo = " + getModelo() + ", Valor Unitário = R$"
				+ getValorUnitario() + ", Tamanho da Tela=" + tamanhoTela + "]";
	}

	@Override
	public int compareTo(Monitor m) {
		if(getValorUnitario()==m.getValorUnitario())  
		      return 0;  
		   else if(this.getValorUnitario()>m.getValorUnitario())  
		      return 1;  
		   else  
		      return -1; 
	}

}