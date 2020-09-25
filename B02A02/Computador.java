public class Computador extends Produto {

	private int memoria;
	private String processador;
	private String hd;
	
	public Computador(String nome, String marca, String modelo, double preco, int memoria, String processador,
			String hd) {
		super(nome, marca, modelo, preco);
		this.memoria = memoria;
		this.processador = processador;
		this.hd = hd;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	@Override
	public String toString() {
		return "Computador [nome=" + nome + ", marca=" + marca + ", modelo=" + modelo + ", preco=" + preco
				+ ", memoria=" + memoria + ", processador=" + processador + ", hd=" + hd + "]";
	}
	
	


}